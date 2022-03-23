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
public interface IZoologicoDAO {
    boolean agregar(Zoologico zoologico);
    List<Zoologico> consultarTodos();
    boolean actualizar(Zoologico zoologico);
    List<Zoologico> consultar(int id);
    boolean eliminar (int id);
}
