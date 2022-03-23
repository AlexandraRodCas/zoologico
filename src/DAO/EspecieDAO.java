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
public class EspecieDAO implements IEspecieDAO{
    public IConexionBD conexion= new ConexionBD();

    public EspecieDAO() {
    }

    public EspecieDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean agregar(Especie especie){
        System.out.println("");
        try{
            String query="INSERT INTO planetaanimal.especies (`id_especies`, `nombre_vulgar`, `nombre_cientifico`, `familia`, `peligro_extincion`) VALUES ("
                    +especie.getId_especie()+",'"+especie.getNombre_vulgar()+"','"+especie.getNombre_cientifico()
                    +"','"+especie.getFamilia()+"',"+especie.getPeligo_extincion()+")";
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
    public boolean actualizar(Especie especie){
        try{
            String query="CALL Actualiza_Especie("+especie.getId_especie()+",'"+especie.getNombre_vulgar()+"','"+especie.getNombre_cientifico()
                    +"','"+especie.getFamilia()+"',"+especie.getPeligo_extincion()+")";
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
        String query= "DELETE FROM `planetaanimal`.`especies` WHERE id_especies="+id;
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
    public List<Especie> consultar(int id) {
        try{
            List<Especie> list= new ArrayList();
            String query = "SELECT * FROM planetaanimal.especies WHERE id_especies=" + id;
            Connection con = conexion.crearConexion();
            Statement comando = con.createStatement();
            ResultSet datos = comando.executeQuery(query);
            if (datos.next()){
                Especie especie =new Especie();
                int espacio1=datos.getInt("id_especies");
                especie.setId_especie(espacio1);

                String espacio2=datos.getString("nombre_vulgar");
                especie.setNombre_vulgar(espacio2);

                String espacio3=datos.getString("nombre_cientifico");
                especie.setNombre_cientifico(espacio3);

                String espacio4=datos.getString("familia");
                especie.setFamilia(espacio4);

                int espacio5=datos.getInt("peligro_extincion");
                especie.setPeligo_extincion(espacio5);
                list.add(especie);
            }
            con.close();
            return list;
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
            return null;
        }
    }
  
    @Override
    public List<Especie> consultarTodos(){
        try{
            List<Especie> list= new ArrayList();
            String query="SELECT * FROM planetaanimal.especies";
            Connection con=conexion.crearConexion();
            Statement comando = con.createStatement();
            ResultSet datos = comando.executeQuery(query);
            while(datos.next()){
                Especie especie =new Especie();
                int espacio1=datos.getInt("id_especies");
                especie.setId_especie(espacio1);

                String espacio2=datos.getString("nombre_vulgar");
                especie.setNombre_vulgar(espacio2);

                String espacio3=datos.getString("nombre_cientifico");
                especie.setNombre_cientifico(espacio3);

                String espacio4=datos.getString("familia");
                especie.setFamilia(espacio4);

                int espacio5=datos.getInt("peligro_extincion");
                especie.setPeligo_extincion(espacio5);
                
                list.add(especie);
            }
            con.close();
            return list;
        }
        catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    
}
