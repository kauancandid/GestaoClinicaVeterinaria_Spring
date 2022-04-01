package br.edu.catolica.ppi.primeiro_exemplo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String recommendation;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemMedicine> itemMedicineList;

}