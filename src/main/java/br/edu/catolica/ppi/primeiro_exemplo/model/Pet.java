package br.edu.catolica.ppi.primeiro_exemplo.model;

import br.edu.catolica.ppi.primeiro_exemplo.enums.Species;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Species specie;

}
