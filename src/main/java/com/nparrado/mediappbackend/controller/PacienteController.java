package com.nparrado.mediappbackend.controller;

import com.nparrado.mediappbackend.model.Paciente;
import com.nparrado.mediappbackend.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/paciente")
    public @ResponseBody List<Paciente> getAll(){
        return pacienteService.getAll() ;
    }

    @PostMapping("/paciente")
    public @ResponseBody Paciente save(@RequestBody Paciente paciente) {
        return pacienteService.save(paciente);
    }
}
