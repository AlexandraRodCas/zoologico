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
public interface IEspecieDAO {
    boolean agregar(Especie especie);
    List<Especie> consultarTodos();
    List<Especie> consultar(int id);
    boolean actualizar(Especie especie);
    boolean eliminar(int id);
}
