package com.cursospring.service.impl;

import java.lang.reflect.Method;
import java.util.List;

import com.cursospring.exception.ModelNotFoundException;
import com.cursospring.repo.IGenericRepo;
import com.cursospring.service.ICRUD;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {
    
    protected abstract IGenericRepo<T, ID> getRepo();

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(T t, ID id) throws Exception {
        Class<?> classType = t.getClass();
        String className = t.getClass().getSimpleName();
        String methodName = "setId" + className;
        Method setIdMethod = classType.getMethod(methodName, id.getClass());
        setIdMethod.invoke(t, id);

        getRepo().findById(id).orElseThrow(() -> new ModelNotFoundException("ID no encontrado" + id));
        return getRepo().save(t);
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElseThrow(()-> new ModelNotFoundException("ID no encontrado" + id));
    }

    @Override
    public void delete(ID id) {
        getRepo().findById(id).orElseThrow(()-> new ModelNotFoundException("ID no encontrado" + id));
        getRepo().deleteById(id);
    }

}
