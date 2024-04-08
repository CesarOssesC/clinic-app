package com.cursospring.service.impl;

import org.springframework.stereotype.Service;

import com.cursospring.model.Specialty;
import com.cursospring.repo.IGenericRepo;
import com.cursospring.repo.ISpecialtyRepo;
import com.cursospring.service.ISpecialtyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SpecialtyServiceImpl extends CRUDImpl<Specialty, Integer> implements ISpecialtyService {

    private final ISpecialtyRepo repo;

    @Override
    protected IGenericRepo<Specialty, Integer> getRepo() {
        return repo;
    }

}
