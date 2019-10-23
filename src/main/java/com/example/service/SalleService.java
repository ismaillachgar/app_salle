package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SalleRepository;
import com.example.entities.Salle;
import com.example.interfaces.IsalleService;



@Service
public class SalleService implements IsalleService{
	@Autowired
SalleRepository sallerepository;
	@Override
	public List<Salle> AllSalles() {
		// TODO Auto-generated method stub
		List<Salle>salles=this.sallerepository.findAll();
		return salles;
	}

	@Override
	public Salle onesalle(int id) {
		// TODO Auto-generated method stub
		Salle salle=this.sallerepository.getOne(id);
		return salle;
	}

	@Override
	public Salle addsalle(Salle salle) {
		// TODO Auto-generated method stub
		Salle sl=this.sallerepository.save(salle);
		return sl;
	}

	@Override
	public Salle updateSalle(int id,Salle salle) {
		// TODO Auto-generated method stub
		salle.setId(id);
		return sallerepository.save(salle);
	}

	@Override
	public void deleteSalle(int id) {
		// TODO Auto-generated method stub
		this.sallerepository.deleteById(id);;
	}

}
