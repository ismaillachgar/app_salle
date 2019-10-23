package com.example.interfaces;

import java.util.List;

import com.example.entities.Payement;

public interface IPayementService {
	public List<Payement> AllPayement();
	public Payement onePayement(int id);
	public Payement addPayement(Payement payement);
	public Payement updatePayement(int id,Payement payement);
	public void deletePayement(int id);
}
