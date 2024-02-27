package br.com.ifpe.oxefoodapiwarley.util.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EntidadeAuditavel extends EntidadeNegocio {

    private Long versao;

    private LocalDate dataCriacao;

    private LocalDate dataUltimaModificacao;

    private Long criadoPor; // id do usuário que o criou

    private Long ultimaModificacaoPor; // id do usuário que fez a última alteração

}
