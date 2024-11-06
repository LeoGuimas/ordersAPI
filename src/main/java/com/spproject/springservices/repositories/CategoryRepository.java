package com.spproject.springservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spproject.springservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
