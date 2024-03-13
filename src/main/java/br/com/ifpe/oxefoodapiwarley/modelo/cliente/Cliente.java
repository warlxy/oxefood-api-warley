package br.com.ifpe.oxefoodapiwarley.modelo.cliente;

import java.time.LocalDate;

import br.com.ifpe.oxefoodapiwarley.util.entity.EntidadeAuditavel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "Cliente")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends EntidadeAuditavel  {

    @Id
    private Long id;

    private String nome;

    private LocalDate dataNascimento;

    private String cpf;

    private String foneCelular;

    private String foneFixo;

}

