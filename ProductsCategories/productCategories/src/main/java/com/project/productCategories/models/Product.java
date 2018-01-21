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
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Product{
	@Id
	@GeneratedValue
	private long id;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		name = "categories_products",
		joinColumns = @JoinColumn(name = "product_id"), 
		inverseJoinColumns = @JoinColumn(name = "category_id")
	)
	private List<Category> categories;

	@Size(min=2, max = 50, message = "Name must be longer than 2 characters.")
	private String name;
	
	@Size(min=2, max = 50, message = "Descriptions must be longer than 2 characters.")
	private String description;
	
	@NotNull(message = "You must enter a price.")
	private float price;

	public Product(String name, String description, float price){
		this.name = name;  
		this.description = description; 
		this.price = price;
		}
	
	public void setName(String name){
		this.name = name;
		}
	
	public String getName(){
		return name;
		}
		
	public void setDescription(String description){
		this.description = description;
		}
	
	public String getDescription(){
		return description;
		}

	public void setPrice(float price){
		this.price = price;
		}
	
	public float getPrice(){
		return price;
		}

	// public List getCategory(){ //COME BACK HERE IF WE SCREW UP EVERYTHING. 
	// 		return category;
	// 	}

	public List getCategory(){
		return categories;
	}
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
	
	public Product(){
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

}

