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

import com.example.entities.User;
import com.example.interfaces.IUserservice;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private IUserservice service;
	@GetMapping("")
	public List<User> AllUsers(){
	return this.service.AllUser();		
	}
	@GetMapping("/{id}")
	public User findone(@PathVariable int id) {
		return this.service.oneUser(id);
	}
	@GetMapping("/cin/{cin}")
	public User FindBycin(@PathVariable String cin) {
		return this.service.findBycin(cin);
	}
	@PostMapping("")
	public User addUser(@RequestBody User user) {
		return this.service.addUser(user);
				
	}
	@PutMapping("")
	public User updateUser(int id,@RequestBody User user) {
		return this.service.updateUser(id, user);
	}
	@DeleteMapping("/{id}")
	public void deleteUser(int id) {
	this.service.deleteUser(id);
	}

}
