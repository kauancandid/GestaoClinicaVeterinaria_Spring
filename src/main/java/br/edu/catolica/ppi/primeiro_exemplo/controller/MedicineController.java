package br.edu.catolica.ppi.primeiro_exemplo.controller;

import br.edu.catolica.ppi.primeiro_exemplo.model.Medicine;
import br.edu.catolica.ppi.primeiro_exemplo.service.MedicineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicine")
public class MedicineController {

    private final MedicineService medicineService;

    public MedicineController(MedicineService medicineServece) {
        this.medicineService = medicineServece;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Medicine medicine){
        return ResponseEntity.ok()
                .body(medicineService.saveOrUpdate(medicine));
    }


}
