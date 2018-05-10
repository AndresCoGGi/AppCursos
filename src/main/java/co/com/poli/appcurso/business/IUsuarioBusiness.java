/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcurso.business;

import co.com.poli.appcurso.model.Usuario;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public interface IUsuarioBusiness {

    List<Usuario> ObtenerListaUsuarios();
    Usuario obtenerUsuario(String documento);
    String crearUsuario(Usuario usuario);
    String modificarUsuario(Usuario usuario);
    String eliminarUsuario(String documento);
    Usuario obtenerUsuario(String email, String clave);
}
