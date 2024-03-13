package br.com.ifpe.oxefoodapiwarley.util.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
@MappedSuperclass
public abstract class EntidadeNegocio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JsonIgnore
    @Column
    private Boolean habilitado;

}

