package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Sport;
import com.example.interfaces.ISportService;



@RestController
@RequestMapping("sports")
public class SportController {
@Autowired
ISportService service;
@RequestMapping(value="", method=RequestMethod.GET)
public List<Sport> AllSport() {
	return this.service.AllSports();
}
@RequestMapping(value="/{id}", method=RequestMethod.GET)
public Sport oneSalle(@PathVariable int id) {
	return this.service.oneSport(id);
}
@RequestMapping(value="", method=RequestMethod.POST)
public Sport AddSport(@RequestBody Sport sport) {
	return this.service.addSport(sport);
}
@RequestMapping(value="/{id}", method=RequestMethod.PUT)
public Sport updateSport(@PathVariable int id,@RequestBody Sport sport) {
	return this.service.updateSport(id, sport);
}
@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
public void deleteSalle(@PathVariable int id) {
	 this.service.deleteSport(id);;
}

}
