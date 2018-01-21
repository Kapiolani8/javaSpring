package com.project.productCategories.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.productCategories.models.*;
import com.project.productCategories.repositories.*;

@Service
public class ProductService {
	// Member variables / service initializations go here
	private ProductRepo productRepo;

	public ProductService(ProductRepo productRepo){
		this.productRepo = productRepo;
	}
		
	//Shit that connects JAVA to MySQL

	public void create(Product product){
		productRepo.save(product);
	}
	
	public void edit(Product product){
		productRepo.save(product);
	}
	
	public void delete(long id){
		productRepo.delete(id);
	}
	
	public Product findById(long id){
		return productRepo.findOne(id);
		}

	public ArrayList<Product> all(){
		return(ArrayList<Product>)productRepo.findAll();
	}

}

	// Crud methods to act on services go here.

