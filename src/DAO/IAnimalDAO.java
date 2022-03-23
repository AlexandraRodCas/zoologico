/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author Alexa
 */
public interface IAnimalDAO {
    boolean agregar(Animal animal);
    List<Animal> consultarTodos();
    List<Animal> consultar(int id);
    boolean actualizar(Animal animal);
    boolean eliminar(int id);
}
