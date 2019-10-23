package com.example.interfaces;

import java.util.List;

import com.example.entities.User;



public interface IUserservice {
	public List<User> AllUser();
	public User oneUser(int id);
	public User addUser(User user);
	public User findBycin(String cin);
	public User updateUser(int id,User user);
	public void deleteUser(int id);
}
