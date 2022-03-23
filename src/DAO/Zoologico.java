/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


/**
 *
 * @author Luis Soto
 */
public class Zoologico{
    private int id_zoologico;
    private String nombre;
    private String ciudad;
    private String pais;
    private String fecha_inauguracion;

    public Zoologico() {
    }

    public Zoologico(int id_zoologico, String nombre, String ciudad, String pais, String fecha_inauguracion) {
        this.id_zoologico = id_zoologico;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_inauguracion = fecha_inauguracion;
    }

    public Zoologico(String nombre, String ciudad, String pais, String fecha_inauguracion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_inauguracion = fecha_inauguracion;
    }

    public int getId_zoologico() {
        return id_zoologico;
    }

    public void setId_zoologico(int id_zoologico) {
        this.id_zoologico = id_zoologico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha_inauguracion() {
        return fecha_inauguracion;
    }

    public void setFecha_inauguracion(String fecha_inauguracion) {
        this.fecha_inauguracion = fecha_inauguracion;
    }

    @Override
    public String toString() {
        return id_zoologico + ", " + nombre + ", " + ciudad + ", " + pais + ", " + fecha_inauguracion;
    }
    
    
}
