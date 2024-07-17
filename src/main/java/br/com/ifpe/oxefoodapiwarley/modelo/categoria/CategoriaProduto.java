package br.com.ifpe.oxefoodapiwarley.modelo.categoria;

import br.com.ifpe.oxefoodapiwarley.util.entity.EntidadeNegocio;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "Categoria")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto extends EntidadeNegocio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    private String titulo;

    private String


}
