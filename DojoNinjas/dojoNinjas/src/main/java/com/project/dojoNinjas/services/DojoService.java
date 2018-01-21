package com.project.dojoNinjas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.dojoNinjas.repositories.*;
import com.project.dojoNinjas.models.*;

@Service
public class DojoService {
	private DojoRepo dojoRepo; 

	// Member variables / service initializations go here

		public DojoService(DojoRepo dojoRepo){
			this.dojoRepo = dojoRepo;
		}
	
		//Shit that connects JAVA to MySQL
	
		public void create(Dojo dojo){
			dojoRepo.save(dojo);
		}
		
		public void edit(Dojo dojo){
			dojoRepo.save(dojo);
		}
		
		public void delete(long id){
			dojoRepo.delete(id);
		}
		
		public Dojo findById(long id){
			return dojoRepo.findOne(id);
		}

	}
	
	// Crud methods to act on services go here.
