package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Payement;
import com.example.interfaces.IPayementService;



@RestController
@RequestMapping("payements")
public class PayementController {
	@Autowired
	private IPayementService service;
	@GetMapping("")
	public List<Payement> AllPayement(){
	return this.service.AllPayement();		
	}
	@GetMapping("/{id}")
	public Payement findone(@PathVariable int id) {
		return this.service.onePayement(id);
	}

	@PostMapping("")
	public Payement addPayement(@RequestBody Payement payement) {
		return this.service.addPayement(payement);
				
	}
	@PutMapping("")
	public Payement updatePayement(int id,@RequestBody Payement payement) {
		return this.service.updatePayement(id, payement);
	}
	@DeleteMapping("/{id}")
	public void deletePayement(int id) {
	this.service.deletePayement(id);;
	}

}
