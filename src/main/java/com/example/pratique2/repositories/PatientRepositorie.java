package com.example.pratique2.repositories;

import com.example.pratique2.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepositorie extends JpaRepository<Patient,Long> {

    Page<Patient> findByNomContains(String kw, Pageable pageable);
}
