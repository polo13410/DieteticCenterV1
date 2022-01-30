package com.dietcenter.patientmanager;


import com.dietcenter.patientmanager.model.Patient;
import com.dietcenter.patientmanager.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final PatientService psMain;

    public PatientController(PatientService patientService) {
        this.psMain = patientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Patient>> getAllPatients(){
        List<Patient> lPatients = psMain.findAllPatients();
        return new ResponseEntity<>(lPatients, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long id){
        Patient patient = psMain.findPatientById(id);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){
        Patient pNew = psMain.addPatient(patient);
        return new ResponseEntity<>(pNew, HttpStatus.CREATED);
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<?> delPatientById(@PathVariable("id") Long id){
        psMain.deletePatient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/upd")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient){
        Patient pNew = psMain.updatePatient(patient);
        return new ResponseEntity<>(pNew, HttpStatus.OK);
    }
}
