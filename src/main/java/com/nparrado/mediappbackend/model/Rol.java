package com.nparrado.mediappbackend.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;

    @ManyToMany
    @JoinTable(
        name = "rel_usuario_rol",
        joinColumns = @JoinColumn(name = "idUsuario"),
        inverseJoinColumns = @JoinColumn(name = "idRol")
    )
    private Set<Usuario> usuarios;


    @ManyToMany
    @JoinTable(
        name = "rel_menu_rol",
        joinColumns = @JoinColumn(name = "idMenu"),
        inverseJoinColumns = @JoinColumn(name = "idRol")
    )
    private Set<Menu> menues;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Set<Menu> getMenues() {
        return menues;
    }

    public void setMenues(Set<Menu> menues) {
        this.menues = menues;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
