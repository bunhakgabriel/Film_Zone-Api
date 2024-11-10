/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.filmzone.api;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author admin
 */
@ApplicationPath("api")
public class Aplicacao extends ResourceConfig{
    public Aplicacao(){
        packages("api");
        register(JacksonFeature.class);
    }
}
