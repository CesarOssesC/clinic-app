package com.cursospring.service.impl;

import java.util.List;

import com.cursospring.repo.IGenericRepo;
import com.cursospring.service.ICRUD;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {
    
    protected abstract IGenericRepo<T, ID> getRepo();

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(T t, ID id) {
        return getRepo().save(t);
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public void delete(ID id) {
        getRepo().deleteById(id);
    }

}
