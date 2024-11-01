package com.spproject.springservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spproject.springservices.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
