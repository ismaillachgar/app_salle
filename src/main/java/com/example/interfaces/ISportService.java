package com.example.interfaces;

import java.util.List;

import com.example.entities.Sport;


public interface ISportService {
	public List<Sport> AllSports();
	public Sport oneSport(int id);
	public Sport addSport(Sport sport);
	public Sport updateSport(int id,Sport sport);
	public void deleteSport(int id);

}
