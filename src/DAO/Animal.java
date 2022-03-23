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
public class Animal {
    
    private int id_animal;
    private String identificacion;
    private String sexo;
    private int año_nacimiento;
    private int especie;
    private int zoologico;

    public Animal() {
    }

    public Animal(int id_animal, String identificacion, int año_nacimiento, int especie, int zoologico) {
        this.id_animal = id_animal;
        this.identificacion = identificacion;
        this.año_nacimiento = año_nacimiento;
        this.especie = especie;
        this.zoologico = zoologico;
    }

    public Animal(String identificacion, int año_nacimiento, int especie, int zoologico) {
        this.identificacion = identificacion;
        this.año_nacimiento = año_nacimiento;
        this.especie = especie;
        this.zoologico = zoologico;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getAño_nacimiento() {
        return año_nacimiento;
    }

    public void setAño_nacimiento(int año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEspecie() {
        return especie;
    }

    public void setEspecie(int especie) {
        this.especie = especie;
    }

    public int getZoologico() {
        return zoologico;
    }

    public void setZoologico(int zoologico) {
        this.zoologico = zoologico;
    }

    @Override
    public String toString() {
        return id_animal + ", " + identificacion + ", a\u00f1o_nacimiento=" + año_nacimiento + ", " + especie + ", " + zoologico;
    }
    
}
