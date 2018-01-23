package com.project.productCategories.repositories;

import java.util.List;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.productCategories.models.*;

@Repository 												
public interface ProductRepo extends CrudRepository<Product,Long>{
	@Query(value="Select * from categories_products left join products on products.category_id left join categories on categories.product_id", nativeQuery=true)
	
	ArrayList<Category> join();
	// Query methods go here.
	
	// Example:
	// public YourModelHere findByName(String name);
}
