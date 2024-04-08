package com.cursospring.service.impl;

import org.springframework.stereotype.Service;

import com.cursospring.model.Consult;
import com.cursospring.repo.IGenericRepo;
import com.cursospring.repo.IConsultRepo;
import com.cursospring.service.IConsultService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConsultServiceImpl extends CRUDImpl<Consult, Integer> implements IConsultService {

    private final IConsultRepo repo;

    @Override
    protected IGenericRepo<Consult, Integer> getRepo() {
        return repo;
    }

}
