package com.cursospring.service.impl;

import org.springframework.stereotype.Service;

import com.cursospring.model.Exam;
import com.cursospring.repo.IGenericRepo;
import com.cursospring.repo.IExamRepo;
import com.cursospring.service.IExamService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl extends CRUDImpl<Exam, Integer> implements IExamService {

    private final IExamRepo repo;

    @Override
    protected IGenericRepo<Exam, Integer> getRepo() {
        return repo;
    }

}
