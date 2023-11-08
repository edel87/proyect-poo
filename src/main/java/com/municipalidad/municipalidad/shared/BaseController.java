package com.municipalidad.municipalidad.shared;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class BaseController<T> {
    @Autowired
    BaseService<T> baseService;

    @PostMapping("")
    public T createObject(T object) {
        return baseService.create(object);
    }

    @GetMapping("")
    public List<T> getObject() {
        return baseService.getAll();
    }

    @GetMapping("{id}")
    public T getObjectById(@PathVariable Long id) {
        return baseService.getById(id);
    }

    @DeleteMapping("{id}")
    public void deleteObjectById(@PathVariable Long id) {
        baseService.deleteById(id);
    }
}
