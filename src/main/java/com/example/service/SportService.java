package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SportRepository;
import com.example.entities.Sport;
import com.example.interfaces.ISportService;



@Service
public class SportService implements ISportService {
	@Autowired
SportRepository sportRepository;
	@Override
	public List<Sport> AllSports() {
		// TODO Auto-generated method stub
		return this.sportRepository.findAll();
	}

	@Override
	public Sport oneSport(int id) {
		// TODO Auto-generated method stub
		return this.sportRepository.getOne(id);
	}

	@Override
	public Sport addSport(Sport sport) {
		// TODO Auto-generated method stub
		return sportRepository.save(sport);
	}

	@Override
	public Sport updateSport(int id, Sport sport) {
		sport.setId(id);
		// TODO Auto-generated method stub
		return sportRepository.save(sport);
	}

	@Override
	public void deleteSport(int id) {
		// TODO Auto-generated method stub
		this.sportRepository.deleteById(id);;
		
	}

}
