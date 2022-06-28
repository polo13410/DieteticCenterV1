package com.dietcenter.patientmanager.repository;

import com.dietcenter.patientmanager.model.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {

    //Note : attention a la syntaxe JPQL - ici il faut entrer la classe entity et non pas la table
    @Query("SELECT p FROM Patient p WHERE p.status = 'A'")
    Collection<Patient> selectActives();

}
