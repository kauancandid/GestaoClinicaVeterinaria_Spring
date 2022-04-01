package br.edu.catolica.ppi.primeiro_exemplo.controller;

import br.edu.catolica.ppi.primeiro_exemplo.model.Medicine;
import br.edu.catolica.ppi.primeiro_exemplo.service.MedicineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestBody Medicine medicine){
        medicineService.delete(medicine);
        return ResponseEntity.noContent().build();

    }


}
