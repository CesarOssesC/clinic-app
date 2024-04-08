package com.cursospring.controller;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursospring.service.IPatientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor

public class PatientController {
    
    private final IPatientService service;

    //debo traerme todos los servicios implementados para crear mi api rest de pacientes.

    // @GetMapping
    // public ResponseEntity<List<?>> findAll() {

    // }

    // @PostMapping("/patients")
    // public ResponseEntity<?> save() {

    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<?> findById() {

    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<?> findById() {

    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<?> delete() {

    // }
}
