package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Sport;

public interface SportRepository extends JpaRepository<Sport, Integer> {

}
