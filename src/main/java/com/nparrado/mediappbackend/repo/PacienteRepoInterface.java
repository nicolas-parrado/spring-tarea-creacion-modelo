package com.nparrado.mediappbackend.repo;

import com.nparrado.mediappbackend.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepoInterface extends JpaRepository<Paciente, Integer> {

}
