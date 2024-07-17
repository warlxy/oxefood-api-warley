package br.com.ifpe.oxefoodapiwarley.modelo.categoria;

import br.com.ifpe.oxefoodapiwarley.util.entity.EntidadeNegocio;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "CategoriaProduto")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto extends EntidadeNegocio {

    @Column
    private String descricao;

}
