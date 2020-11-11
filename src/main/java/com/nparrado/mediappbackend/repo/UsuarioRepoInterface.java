package com.nparrado.mediappbackend.repo;

import com.nparrado.mediappbackend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepoInterface extends JpaRepository<Usuario, Integer> {

}
