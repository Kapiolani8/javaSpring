package com.project.productCategories.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.productCategories.models.*;
import com.project.productCategories.repositories.*;

@Service
public class CategoryService {
	// Member variables / service initializations go here
	private CategoryRepo categoryRepo;

	public CategoryService(CategoryRepo categoryRepo){
		this.categoryRepo = categoryRepo;
	}
		
	//Shit that connects JAVA to MySQL

	public void create(Category category){
		categoryRepo.save(category);
	}
	
	public void edit(Category category){
		categoryRepo.save(category);
	}
	
	public void delete(long id){
		categoryRepo.delete(id);
	}
	
	public Category findById(long id){
		return categoryRepo.findOne(id);
		}


	public ArrayList<Category> all(){
		return(ArrayList<Category>)categoryRepo.findAll();
	}
}
	// Crud methods to act on services go here.
