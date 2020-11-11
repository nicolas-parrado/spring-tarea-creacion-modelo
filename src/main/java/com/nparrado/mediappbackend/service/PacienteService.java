package com.nparrado.mediappbackend.service;

import com.nparrado.mediappbackend.model.Paciente;

import java.util.List;

public interface PacienteService {

    List<Paciente> getAll();

    Paciente save(Paciente paciente);
}
