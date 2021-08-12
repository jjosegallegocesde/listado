/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intersoftware.listado.services;

import com.intersoftware.listado.Repositorios.RepositorioPelicula;
import com.intersoftware.listado.modelos.Pelicula;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan
 */
@Service
public class ServicioPelicula {
    
    private final RepositorioPelicula consulta;
    
    

    public ServicioPelicula(RepositorioPelicula consulta) {
        this.consulta = consulta;
    }
    
    
    public List<Pelicula> buscarPeliculas() {

        
        return consulta.findAll();
        

    }

}
