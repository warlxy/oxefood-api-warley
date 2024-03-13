package br.com.ifpe.oxefoodapiwarley.modelo.produto;

import br.com.ifpe.oxefoodapiwarley.util.entity.EntidadeAuditavel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;

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
    private Long id;
}
