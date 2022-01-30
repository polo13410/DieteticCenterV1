package com.dietcenter.patientmanager.repository;

import com.dietcenter.patientmanager.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {


}
