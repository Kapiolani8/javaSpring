package com.project.loginReg.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.loginReg.models.*;

@Repository 												
public interface UserRepo extends CrudRepository<User,Long>{
	User findByEmail(String email);
	// Query methods go here.
	
	// Example:
	// public YourModelHere findByName(String name);
}
