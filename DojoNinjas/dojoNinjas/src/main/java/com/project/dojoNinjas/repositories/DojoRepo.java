package com.project.dojoNinjas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.dojoNinjas.models.Dojo;

@Repository 												
public interface DojoRepo extends CrudRepository<Dojo,Long>{
	// Query methods go here.
	
	// Example:
	// public YourModelHere findByName(String name);
}
