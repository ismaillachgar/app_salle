package com.example.interfaces;

import java.util.List;

import com.example.entities.Salle;


public interface IsalleService {

	public List<Salle> AllSalles();
	public Salle onesalle(int id);
	public Salle addsalle(Salle salle);
	public Salle updateSalle(int id,Salle salle);
	public void deleteSalle(int id);
	}

