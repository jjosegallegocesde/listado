/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intersoftware.listado.controlador;

import com.intersoftware.listado.modelos.Pelicula;
import com.intersoftware.listado.services.ServicioPelicula;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Juan
 */

@Controller
public class ControladorPeliculas {
    
    private ServicioPelicula servicio;

    
    public ControladorPeliculas(ServicioPelicula servicio) {
        this.servicio = servicio;
    }
    
    
    
    @RequestMapping("/")
    public String listarPeliculas(Model modelo){
        
        List<Pelicula> peliculas=servicio.buscarPeliculas();
        modelo.addAttribute("peliculas",peliculas);
        return "vistaListado";
        
    }
    
    
    
}
