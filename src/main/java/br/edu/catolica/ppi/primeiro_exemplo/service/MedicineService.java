package br.edu.catolica.ppi.primeiro_exemplo.service;

import br.edu.catolica.ppi.primeiro_exemplo.model.Medicine;
import br.edu.catolica.ppi.primeiro_exemplo.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    MedicineRepository medicineRepository;

    public Medicine saveOrUpdate(Medicine medicine){
        return medicineRepository.save(medicine);
    }

    public List<Medicine> getAllMedicine(){
        return medicineRepository.findAll();
    }

}
