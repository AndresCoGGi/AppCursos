/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcurso.data;

import co.com.poli.appcurso.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class UsuarioData {
    
    //variables estatcas pertenecen en la clase pero no en los objetos
    private static List<Usuario> listaUsuarios;
    
    static{
        listaUsuarios = new ArrayList<Usuario>(){
            {
                add(new Usuario("10", "Andres", "Correa", "andres@hola.com", 
                                       "123", "ADMIN", Boolean.TRUE));
                add(new Usuario("20", "Carlos", "perez", "carlos@hola.com", 
                                       "456", "CONSULTA", Boolean.TRUE));
                add(new Usuario("30", "Esteban", "hernandez", "esteban@hola.com", 
                                       "789", "CONSULTA", Boolean.TRUE));
            }  
        };
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(List<Usuario> aListaUsuarios) {
        listaUsuarios = aListaUsuarios;
    }
    
    
}
