package com.project.productCategories.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.productCategories.models.*;
import com.project.productCategories.controllers.*;
import com.project.productCategories.repositories.*;
import com.project.productCategories.services.*;

@Controller
@RequestMapping("/*")
public class router{
	//Member variables go here
	private CategoryService categoryService;
	private ProductService productService;
	public router(CategoryService categoryService, ProductService productService){
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	@RequestMapping("/newProduct")
	public String newProduct(Model model){
		List<Product> product = productService.all();
		model.addAttribute("products", product);
		return "newProduct";
	}	

	@PostMapping("/addProduct")
	public String addProduct(@Valid @RequestParam(value="name") String name, @RequestParam(value="description") String description, @RequestParam(value="price") float price){
		System.out.println("*************"+price);
		Product product = new Product(name, description, price);
		productService.create(product);
		return "redirect:/newProduct";
	}

	@RequestMapping("/newCategory")
	public String newCategory(Model model){
		List<Category> category = categoryService.all();
		model.addAttribute("categories", category);
		return "newCategory";
	}	

	@PostMapping("/addCategory")
	public String addCategory(@RequestParam(value="name") String name){
		Category category = new Category(name);
		categoryService.create(category);
		return "redirect:/newCategory";
	}

	@RequestMapping("displayInfo/{id}")
	public String displayInfo(@PathVariable("id")long id, Model model){
		Product product = productService.findById(id);
		List<Category> categories = product.getCategory();
		List<Category> categoriesAll = categoryService.all();
		model.addAttribute("categories", categories);
		model.addAttribute("categoriesAll", categoriesAll);
		model.addAttribute("product", product);
		model.addAttribute("product", productService.findById(id));
		model.addAttribute("categories", categoryService.all());
		// ArrayList<Category> selectedCategories = 
		return "displayInfo";
	}

	@PostMapping("/join/{id}")
	public String join(@PathVariable("id") long id, @RequestParam(value="category") long categoryId){
		Product product = productService.findById(id);
		List<Category> kittykatlicklick = product.getCategory();
		Category category = categoryService.findById(categoryId);
		kittykatlicklick.add(category);
		productService.edit(product);
		return "redirect:/displayInfo/" + id; //use "+id"(DO NOT USE "/{id}" in the return "redirect") when you're trying to call the foreign keys set for both tables.
	} 


	@RequestMapping("/errors")
	public String errors(RedirectAttributes redirectAttributes){
		redirectAttributes.addFlashAttribute("errors", "Too long!!");
		return "redirect:/";
	}
}
