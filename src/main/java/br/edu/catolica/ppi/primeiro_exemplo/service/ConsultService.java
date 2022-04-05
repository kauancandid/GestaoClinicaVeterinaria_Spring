package br.edu.catolica.ppi.primeiro_exemplo.service;

import br.edu.catolica.ppi.primeiro_exemplo.model.Consult;
import br.edu.catolica.ppi.primeiro_exemplo.model.ItemMedicine;
import br.edu.catolica.ppi.primeiro_exemplo.repository.ConsultRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ConsultService {

    @Value(("${value.consult}"))
    private Double valueConsult;

    private final ConsultRepository consultRepository;

    public ConsultService(ConsultRepository consultRepository) {
        this.consultRepository = consultRepository;
    }

    public Consult save(Consult consult){
        consult.setDateConsult(LocalDate.now());
        consult.setValueTotal(valueTotalConsult(consult));
        return consultRepository.save(consult);
    }

    private Double valueTotalConsult(Consult consult){
        var valueTotalMedicine = consult.getPrescription()
                .getItemMedicineList()
                .stream().mapToDouble(ItemMedicine::getSubTotal).sum();
        return valueTotalMedicine + valueConsult;
    }

}