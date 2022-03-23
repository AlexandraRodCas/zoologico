/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexa
 */
public class ZoologicoDAO implements IZoologicoDAO{
    public IConexionBD conexion= new ConexionBD();

    public ZoologicoDAO() {
    }

    public ZoologicoDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }
    @Override
    public boolean agregar(Zoologico zoologico) {
        try{ 
            System.out.println("");
        String query="INSERT INTO `planetaanimal`.`zoologicos` (`id_zoologico`, `nombre`, `ciudad`, `pais`, `fecha_inauguracion`) VALUES ("+zoologico.getId_zoologico()+", '"+zoologico.getNombre()+"', '"+zoologico.getCiudad()+"', '"+zoologico.getPais()+"', '"+zoologico.getFecha_inauguracion()+"')";
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
    public List<Zoologico> consultarTodos() {
        try{
        List<Zoologico> list= new ArrayList();
        String query="SELECT * FROM planetaanimal.zoologicos";
        Connection con=conexion.crearConexion();
        Statement comando = con.createStatement();
        ResultSet datos = comando.executeQuery(query);
        while(datos.next()){
            Zoologico zoo =new Zoologico();
            int espacio1=datos.getInt("id_zoologico");
            zoo.setId_zoologico(espacio1);

            String espacio2=datos.getString("nombre");
            zoo.setNombre(espacio2);

            String espacio3=datos.getString("ciudad");
            zoo.setCiudad(espacio3);

            String espacio4=datos.getString("pais");
            zoo.setPais(espacio4);

            String espacio5=datos.getString("fecha_inauguracion");
            zoo.setFecha_inauguracion(espacio5);
            list.add(zoo);
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
    public boolean actualizar(Zoologico zoologico) {
       try{
            String query="CALL Actualiza_Zoo("+zoologico.getId_zoologico()+",'"+zoologico.getNombre()+"','"+zoologico.getCiudad()
                    +"','"+zoologico.getPais()+"','"+zoologico.getFecha_inauguracion()+"')";
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
    public List<Zoologico> consultar(int id) {
        try{
        List<Zoologico> list= new ArrayList();
        String query="SELECT * FROM planetaanimal.zoologicos WHERE id_zoologico="+id;
        Connection con=conexion.crearConexion();
        Statement comando = con.createStatement();
        ResultSet datos = comando.executeQuery(query);
        while(datos.next()){
            Zoologico zoo =new Zoologico();
            int espacio1=datos.getInt("id_zoologico");
            zoo.setId_zoologico(espacio1);

            String espacio2=datos.getString("nombre");
            zoo.setNombre(espacio2);

            String espacio3=datos.getString("ciudad");
            zoo.setCiudad(espacio3);

            String espacio4=datos.getString("pais");
            zoo.setPais(espacio4);

            String espacio5=datos.getString("fecha_inauguracion");
            zoo.setFecha_inauguracion(espacio5);
            list.add(zoo);
        }
        con.close();
        
        return list;
            
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public boolean eliminar(int id) {
        try{
            Connection con = conexion.crearConexion();
            Statement comando = con.createStatement();
            String query = "DELETE FROM zoologicos WHERE id_zoologico =" + id;
            comando.executeUpdate(query);
            return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }    
    }
    
}
