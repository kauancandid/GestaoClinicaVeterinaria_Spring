package br.edu.catolica.ppi.primeiro_exemplo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ItemMedicine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne
    private Medicine medicine;

    private Integer quantity;

    @Transient //não mostra essa coluna no banco, mas registra o total, dependendo do tanto de medicamentos adicionados
    private Double subTotal;

    public Double getSubTotal() {
        return subTotal = medicine.getPrice() + quantity;
    }
}
