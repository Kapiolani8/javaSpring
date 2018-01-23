package com.project.loginReg.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.loginReg.models.*;
import com.project.loginReg.repositories.*;

@Service
public class UserService {
	private UserRepo userRepo;
	private BCryptPasswordEncoder bcrypt;
	// Member variables / service initializations go here
		
	public UserService(UserRepo userRepo){
		this.userRepo = userRepo;
		this.bcrypt = new BCryptPasswordEncoder();
	}

	public boolean isMatch(String password, String dbPass){
		if(bcrypt.matches(password, dbPass)){
			return true;
		}
		else{
			return false;
		}
	}

	public void create(User user){
		user.setPassword(bcrypt.encode(user.getPassword()));
		userRepo.save(user);
	}

	public ArrayList<User> all(){
		return (ArrayList<User>)userRepo.findAll();
	}
	
	public User findById(long id){
		return (User) userRepo.findOne(id);
	}

	public void destroy(User user){
		userRepo.delete(user);
	}

	public void update(User user){
		create(user);
	}

	public User findByEmail(String email){
		return (User) userRepo.findByEmail(email);
	}
	// Crud methods to act on services go here.
}
