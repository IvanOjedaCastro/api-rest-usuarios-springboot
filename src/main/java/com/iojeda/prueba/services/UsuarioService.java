package com.iojeda.prueba.services;

import java.util.List;

import com.iojeda.prueba.models.Usuario;

public interface UsuarioService {
	List<Usuario> obtenerTodos();
    Usuario obtenerPorId(Long id);
    Usuario crearUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
}