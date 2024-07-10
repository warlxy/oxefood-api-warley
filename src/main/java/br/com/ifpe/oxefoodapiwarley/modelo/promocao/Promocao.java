package br.com.ifpe.oxefoodapiwarley.modelo.promocao;

import br.com.ifpe.oxefoodapiwarley.util.entity.EntidadeAuditavel;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;

import java.time.LocalDate;

@Entity
@Table(name = "Promocao")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Promocao extends EntidadeAuditavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column
    private LocalDate dataInicio;

    @Column
    private LocalDate dataFim;

    @Column
    private String regra;

    @Column
    private Double valorDesconto;



}
