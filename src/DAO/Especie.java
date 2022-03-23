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
public class Especie {
    private int id_especie;
    private String nombre_vulgar;
    private String nombre_cientifico;
    private String familia;
    private int peligo_extincion;
    private int edad;

     public Especie() {
    }
     
    public Especie(int id_especie, String nombre_vulgar, String nombre_cientifico, String familia, byte peligo_extincion) {
        this.id_especie = id_especie;
        this.nombre_vulgar = nombre_vulgar;
        this.nombre_cientifico = nombre_cientifico;
        this.familia = familia;
        this.peligo_extincion = peligo_extincion;
    }

    public Especie(String nombre_vulgar, String nombre_cientifico, String familia, byte peligo_extincion) {
        this.nombre_vulgar = nombre_vulgar;
        this.nombre_cientifico = nombre_cientifico;
        this.familia = familia;
        this.peligo_extincion = peligo_extincion;
    }
    

    public int getId_especie() {
        return id_especie;
    }

    public void setId_especie(int id_especie) {
        this.id_especie = id_especie;
    }

    public String getNombre_vulgar() {
        return nombre_vulgar;
    }

    public void setNombre_vulgar(String nombre_vulgar) {
        this.nombre_vulgar = nombre_vulgar;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getPeligo_extincion() {
        return peligo_extincion;
    }

    public void setPeligo_extincion(int peligo_extincion) {
        this.peligo_extincion = peligo_extincion;
    }

    @Override
    public String toString() {
        return id_especie + ", " + nombre_vulgar + ", " + nombre_cientifico + ", " + familia + ", " + peligo_extincion ;
    }
    
}
