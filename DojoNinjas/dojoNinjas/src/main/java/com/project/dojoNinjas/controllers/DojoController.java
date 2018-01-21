package com.project.dojoNinjas.controllers;

import java.security.Principal;
import java.util.Date;

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

import com.project.dojoNinjas.models.*;
import com.project.dojoNinjas.services.*;

@Controller
@RequestMapping("/dojo")
public class DojoController{
	//Member variables go here

	public DojoController(){

	}

	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	// @RequestMapping("yourRoute")
	// public String yourMethod(){
	// 	return "yourView";
	// }	
}
