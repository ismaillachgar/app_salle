package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Payement;


public interface PayementRepository extends JpaRepository<Payement, Integer> {

}
