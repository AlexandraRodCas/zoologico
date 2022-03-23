/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexa
 */
public class animalDAO implements IAnimalDAO{
    public IConexionBD conexion= new ConexionBD();

    public animalDAO() {
    }

    public animalDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean agregar(Animal animal){
        try{
            String query="INSERT INTO planetaanimal.animales (`id_animal`, `identifiacion`, `sexo`, `año_nacimiento`, `id_especie`,`id_zoologico`) VALUES ("
                    +animal.getId_animal()+",'"+animal.getIdentificacion()+"', \""+animal.getSexo()+
                    "\", "+animal.getAño_nacimiento()+", "+animal.getEspecie()+", "+animal.getZoologico()+")";
            Connection con=conexion.crearConexion();
            Statement comando = con.createStatement();
            comando.executeUpdate(query);
            con.close();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex);
            return false;
        }
    }
    
    @Override
    public boolean actualizar(Animal animal){
        try{
           
            String query="CALL Actualiza_Animal("+animal.getId_animal()+",'"+animal.getIdentificacion()+"',\""+animal.getSexo()+
                    "\","+animal.getAño_nacimiento()+","+animal.getEspecie()+", "+animal.getZoologico()+")";
            Connection con=conexion.crearConexion();
            Statement comando = con.createStatement();
            comando.executeUpdate(query);
            con.close();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex);
            return false;
        }
    }
    
    @Override
    public boolean eliminar(int id) {
        try{ 
        String query= "DELETE FROM `planetaanimal`.`animales` WHERE id_animal="+id;
        Connection con=conexion.crearConexion();
        Statement comando = con.createStatement();
        comando.executeUpdate(query);
        con.close();
        return true;
        }
        catch(Exception ex){
            System.out.println(ex);
            return false;
        }
    }
  
    @Override
    public List<Animal> consultarTodos(){
        try{
            List<Animal> list= new ArrayList();
            String query="SELECT * FROM planetaanimal.animales";
            Connection con=conexion.crearConexion();
            Statement comando = con.createStatement();
            ResultSet datos = comando.executeQuery(query);
            while(datos.next()){
                Animal animal =new Animal();
                int espacio1=datos.getInt("id_animal");
                animal.setId_animal(espacio1);

                String espacio2=datos.getString("identifiacion");
                animal.setIdentificacion(espacio2);

                String espacio3=datos.getString("sexo");
                animal.setSexo(espacio3);

                int espacio4=datos.getInt("año_nacimiento");
                animal.setAño_nacimiento(espacio4);

                int espacio5=datos.getInt("id_especie");
                animal.setEspecie(espacio5);
                
                int espacio6=datos.getInt("id_zoologico");
                animal.setZoologico(espacio6);

                list.add(animal);
            }
            con.close();
            return list;
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    @Override
    public List<Animal> consultar(int id) {
        try{
            List<Animal> listI= new ArrayList();
            String query = "SELECT * FROM planetaanimal.animales WHERE id_animal=" + id;
            Connection con = conexion.crearConexion();
            Statement comando = con.createStatement();
            ResultSet datos = comando.executeQuery(query);
            if (datos.next()){
                Animal animal =new Animal();
                int espacio1=datos.getInt("id_animal");
                animal.setId_animal(espacio1);

                String espacio2=datos.getString("identifiacion");
                animal.setIdentificacion(espacio2);

                String espacio3=datos.getString("sexo");
                animal.setSexo(espacio3);

                int espacio4=datos.getInt("año_nacimiento");
                animal.setAño_nacimiento(espacio4);

                int espacio5=datos.getInt("id_especie");
                animal.setEspecie(espacio5);
                
                int espacio6=datos.getInt("id_zoologico");
                animal.setZoologico(espacio6);
                listI.add(animal);
            }
            con.close();
            return listI;
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
            return null;
        }
    }
}
