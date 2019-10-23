package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Salle;
import com.example.interfaces.IsalleService;




@RestController
@RequestMapping("salle")
public class SalleController {
    @Autowired
	IsalleService service;
    @RequestMapping(value="/", method=RequestMethod.GET)
    public List<Salle> AllSalles() {
    	return this.service.AllSalles();
    }
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Salle oneSalle(@PathVariable int id) {
    	return this.service.onesalle(id);
    }
    @RequestMapping(value="/", method=RequestMethod.POST)
    public Salle AddSalle(@RequestBody Salle salle) {
    	return this.service.addsalle(salle);
    }
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public Salle updateSalle(@PathVariable int id,@RequestBody Salle salle) {
    	return this.service.updateSalle(id, salle);
    }
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteSalle(@PathVariable int id) {
    	 this.service.deleteSalle(id);;
    }
}
