package com.nparrado.mediappbackend.controller;

import com.nparrado.mediappbackend.model.Usuario;
import com.nparrado.mediappbackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public @ResponseBody List<Usuario> getAll() {
        return usuarioService.getAll();
    }

    @PostMapping("/usuario")
    public @ResponseBody Usuario save(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

}
