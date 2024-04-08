package com.cursospring.service.impl;

import org.springframework.stereotype.Service;

import com.cursospring.model.Menu;
import com.cursospring.repo.IGenericRepo;
import com.cursospring.repo.IMenuRepo;
import com.cursospring.service.IMenuService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl extends CRUDImpl<Menu, Integer> implements IMenuService {

    private final IMenuRepo repo;

    @Override
    protected IGenericRepo<Menu, Integer> getRepo() {
        return repo;
    }

}
