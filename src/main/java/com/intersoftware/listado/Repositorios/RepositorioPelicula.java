/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intersoftware.listado.Repositorios;

import com.intersoftware.listado.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Juan
 */
public interface RepositorioPelicula extends JpaRepository<Pelicula,Integer> {
    
    
    
}
