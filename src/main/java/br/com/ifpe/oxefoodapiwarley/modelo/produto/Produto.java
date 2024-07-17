package br.com.ifpe.oxefoodapiwarley.modelo.produto;

import br.com.ifpe.oxefoodapiwarley.modelo.categoria.CategoriaProduto;
import br.com.ifpe.oxefoodapiwarley.util.entity.EntidadeAuditavel;
import jakarta.persistence.*;
import org.hibernate.annotations.SQLRestriction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Produto")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends EntidadeAuditavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String codigo;

    @Column
    private String titulo;

    @Column
    private String descricao;

    @Column
    private Double valorUnitario;

    @Column
    private Integer tempoEntregaMinimo;

    @Column
    private Integer tempoEntregaMaximo;

    @ManyToOne
    private CategoriaProduto categoriaProduto;

}