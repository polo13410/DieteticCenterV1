package com.dietcenter.patientmanager.service;

import com.dietcenter.patientmanager.exception.PatientException;
import com.dietcenter.patientmanager.model.Patient;
import com.dietcenter.patientmanager.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    PatientRepository pr;

    @Autowired
    public PatientService(PatientRepository pr){
        this.pr = pr;
    }

    public Patient addPatient(Patient patient){
        return pr.save(patient);
    }

    public Patient updatePatient(Patient patient) {
        return pr.save(patient);
    }

    public void deletePatient(Long id){
        pr.deleteById(id);
    }

    public List<Patient> findAllPatients(){
        return pr.findAll();
    }

    public Patient findPatientById(Long id){return pr.findById(id).orElseThrow(() -> new PatientException("User with ID = " + id + " not found"));}

}
