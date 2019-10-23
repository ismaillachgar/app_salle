package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {
public User findByCin(String cin);
}
