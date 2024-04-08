package com.cursospring.service.impl;

import org.springframework.stereotype.Service;

import com.cursospring.model.Patient;
import com.cursospring.repo.IGenericRepo;
import com.cursospring.repo.IPatientRepo;
import com.cursospring.service.IPatientService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl extends CRUDImpl<Patient, Integer> implements IPatientService {

    private final IPatientRepo repo;

    @Override
    protected IGenericRepo<Patient, Integer> getRepo() {
        return repo;
    }
    
    
    
}
