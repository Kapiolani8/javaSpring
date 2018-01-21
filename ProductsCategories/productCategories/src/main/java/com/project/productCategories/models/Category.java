package com.project.productCategories.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Category{
	@Id
	@GeneratedValue
	private long id;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		name = "categories_products",
		joinColumns = @JoinColumn(name="category_id"),
		inverseJoinColumns = @JoinColumn(name="product_id")
	)
	private List<Product> products;
	
	@Size(min=2, max = 50, message = "Name must be longer than 2 characters.")
	private String name;
	
	public Category(String name){
		this.name = name;  
		}
	
	public void setName(String name){
		this.name = name;
		}
	
	public String getName(){
		return name;
		}


	// public List getProduct(){ //COME BACK HERE IF WE SCREW UP EVERYTHING. 
	// 		return products;
	// 	}

	// public Product getProduct(){
	// 	return products;
	// }


	// Member variables and annotations go here.
	
	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
	private Date createdAt;
	
	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
	private Date updatedAt;

	@PrePersist
	public void onCreate(){this.createdAt = new Date();}
	@PreUpdate
	public void onUpdate(){this.updatedAt = new Date();}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	// Setters and Getters go here
	
	public Category(){
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}
}
