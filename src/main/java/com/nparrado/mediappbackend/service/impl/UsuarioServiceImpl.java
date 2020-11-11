package com.nparrado.mediappbackend.service.impl;

import com.nparrado.mediappbackend.model.Usuario;
import com.nparrado.mediappbackend.repo.UsuarioRepoInterface;
import com.nparrado.mediappbackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepoInterface repoInterface;

    @Override
    public List<Usuario> getAll() {
        return repoInterface.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repoInterface.save(usuario);
    }
}
