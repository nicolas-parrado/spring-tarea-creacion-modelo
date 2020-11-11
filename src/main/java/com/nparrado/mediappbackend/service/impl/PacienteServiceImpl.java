package com.nparrado.mediappbackend.service.impl;

import com.nparrado.mediappbackend.model.Paciente;
import com.nparrado.mediappbackend.repo.PacienteRepoInterface;
import com.nparrado.mediappbackend.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepoInterface repoInterface;


    @Override
    public List<Paciente> getAll() {
        return repoInterface.findAll();
    }

    @Override
    public Paciente save(Paciente paciente) {
        return repoInterface.save(paciente);
    }
}
