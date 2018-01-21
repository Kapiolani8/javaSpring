package com.project.dojoNinjas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.dojoNinjas.repositories.*;
import com.project.dojoNinjas.models.*;

@Service
public class NinjaService {
	private NinjaRepo ninjaRepo; 	
		// Member variables / service initializations go here

			// Member variables / service initializations go here
		
	public NinjaService(NinjaRepo ninjaRepo){
		this.ninjaRepo = ninjaRepo;
	}

	//Shit that connects JAVA to MySQL

	public void create(Ninja ninja){
		ninjaRepo.save(ninja);
	}
	
	public void edit(Ninja ninja){
		ninjaRepo.save(ninja);
	}
	
	public void delete(long id){
		ninjaRepo.delete(id);
	}
	
	public Ninja findById(long id){
		return ninjaRepo.findOne(id);
				}
		
	}
	
	// Crud methods to act on services go here
