package com.cursospring.service.impl;

import org.springframework.stereotype.Service;

import com.cursospring.model.ConsultExam;
import com.cursospring.repo.IGenericRepo;
import com.cursospring.repo.IConsultExamRepo;
import com.cursospring.service.IConsultExamService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConsultExamServiceImpl extends CRUDImpl<ConsultExam, Integer> implements IConsultExamService {

    private final IConsultExamRepo repo;

    @Override
    protected IGenericRepo<ConsultExam, Integer> getRepo() {
        return repo;
    }

}
