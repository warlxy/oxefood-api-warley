package br.com.ifpe.oxefoodapiwarley.api.produto;

import br.com.ifpe.oxefoodapiwarley.modelo.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {

    private Long idCategoria;

    private String codigo;

    private String titulo;

    private String descricao;

    private Double valorUnitario;

    private Integer tempoEntregaMinimo;

    private Integer tempoEntregaMaximo;

    public Produto build() {

        return Produto.builder()
                .codigo(codigo)
                .titulo(titulo)
                .descricao(descricao)
                .valorUnitario(valorUnitario)
                .tempoEntregaMinimo(tempoEntregaMinimo)
                .tempoEntregaMaximo(tempoEntregaMaximo)
                .build();
    }

}