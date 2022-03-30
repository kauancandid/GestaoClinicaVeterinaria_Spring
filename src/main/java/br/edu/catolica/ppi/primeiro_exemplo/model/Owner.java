package br.edu.catolica.ppi.primeiro_exemplo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Owner extends Person {

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Pet> pets;

}
