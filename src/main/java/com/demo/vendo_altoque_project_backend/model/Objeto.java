package com.demo.vendo_altoque_project_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
public class Objeto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_objeto;
    private String nombreObjeto;

    public Objeto() {
    }

    public Objeto(Long id_objeto, String nombreObjeto) {
        this.id_objeto = id_objeto;
        this.nombreObjeto = nombreObjeto;
    }
}
