package br.com.ifpe.oxefoodapiwarley.api.promocao;

import br.com.ifpe.oxefoodapiwarley.modelo.produto.Produto;
import br.com.ifpe.oxefoodapiwarley.modelo.promocao.Promocao;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PromocaoRequest {

    private String titulo;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataInicio;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFim;

    private String regra;

    private Double valorDesconto;

    public Promocao build() {

        return Promocao.builder()
                .titulo(titulo)
                .dataInicio(dataInicio)
                .dataFim(dataFim)
                .regra(regra)
                .valorDesconto(valorDesconto)
                .build();
    }
}
