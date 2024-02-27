package br.com.ifpe.oxefoodapiwarley.util.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class EntidadeNegocio implements Serializable {

    private Long id;

    private Boolean habilitado;
}
