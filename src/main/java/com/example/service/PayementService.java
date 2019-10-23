package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PayementRepository;
import com.example.entities.Payement;
import com.example.interfaces.IPayementService;


@Service
public class PayementService implements IPayementService {
	@Autowired
   private PayementRepository payemenRepository;
	@Override
	public List<Payement> AllPayement() {
		// TODO Auto-generated method stub
		return this.payemenRepository.findAll();
	}

	@Override
	public Payement onePayement(int id) {
		// TODO Auto-generated method stub
		return this.payemenRepository.getOne(id);
	}

	@Override
	public Payement addPayement(Payement payement) {
		// TODO Auto-generated method stub
		return this.payemenRepository.save(payement);
	}

	@Override
	public Payement updatePayement(int id, Payement payement) {
		// TODO Auto-generated method stub
		payement.setId(id);
		return this.payemenRepository.save(payement);
	}

	@Override
	public void deletePayement(int id) {
		// TODO Auto-generated method stub
		this.payemenRepository.deleteById(id);;
		
		
	}

}
