package com.nparrado.mediappbackend.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConsulta;

    @ManyToOne
    @JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey( name = "FK_consulta_paciente"))
    private Paciente paciente;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

}
