package com.example.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app1.model.User;
import com.example.app1.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User getUserByUsername(String Username) {
		return userRepository.findByUsername(Username);
	}
	
	public User getUserByIdAndPassword(String id, String password) {
		return userRepository.findByIdAndPassword(id, password);
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

}
