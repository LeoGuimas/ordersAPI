package com.spproject.springservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spproject.springservices.entities.Category;
import com.spproject.springservices.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id).get();
    }
}
