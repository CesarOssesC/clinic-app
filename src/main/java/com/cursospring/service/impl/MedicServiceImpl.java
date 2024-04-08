package com.cursospring.service.impl;

import org.springframework.stereotype.Service;

import com.cursospring.model.Medic;
import com.cursospring.repo.IGenericRepo;
import com.cursospring.repo.IMedicRepo;
import com.cursospring.service.IMedicService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MedicServiceImpl extends CRUDImpl<Medic, Integer> implements IMedicService {

    private final IMedicRepo repo;

    @Override
    protected IGenericRepo<Medic, Integer> getRepo() {
        return repo;
    }

}
