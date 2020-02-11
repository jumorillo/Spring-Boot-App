package com.example.app1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.app1.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	public User findByUsername(String Username);
	
	public User findByIdAndPassword(String id, String password);
}
