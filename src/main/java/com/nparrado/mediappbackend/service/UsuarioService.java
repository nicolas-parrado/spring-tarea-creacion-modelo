package com.nparrado.mediappbackend.service;

import com.nparrado.mediappbackend.model.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> getAll();

    Usuario save(Usuario usuario);
}
