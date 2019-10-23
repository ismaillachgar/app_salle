package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepository;
import com.example.entities.User;
import com.example.interfaces.IUserservice;

@Service
public class UserService implements IUserservice {
	@Autowired
   private  UserRepository userRepository;
	@Override
	public List<User> AllUser() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}

	@Override
	public User oneUser(int id) {
		// TODO Auto-generated method stub
		return this.userRepository.getOne(id);
	}

	@Override
	public User addUser(User user) {
	
		return this.userRepository.save(user);
	   
	}

	@Override
	public User updateUser(int id, User user) {
		user.setId(id);
return this.userRepository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);;
	}

	@Override
	public User findBycin(String cin) {
		// TODO Auto-generated method stub
		return this.userRepository.findByCin(cin);
	}

}
