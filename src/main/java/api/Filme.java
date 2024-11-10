/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author admin
 */
@Path("Filme")
public class Filme {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<com.curso.filmzone.dominio.Filme> obterListaFilmes() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432"
                            +"/film_zone?user=postgres&password=74115987");
        
        com.curso.filmzone.negocio.Filme filmeNeg = new com.curso.filmzone.negocio.Filme(conexao);
        List<com.curso.filmzone.dominio.Filme> listaFilmes = filmeNeg.obterLista();
        
        return listaFilmes;
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public com.curso.filmzone.dominio.Filme obterFilmePorId(@PathParam("id") int id) throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432"
                            +"/film_zone?user=postgres&password=74115987");
        
        com.curso.filmzone.negocio.Filme filmeNeg = new com.curso.filmzone.negocio.Filme(conexao);
        return filmeNeg.obterFilmeId(id);
    }
}
