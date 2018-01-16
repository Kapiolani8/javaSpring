package com.project.displayDate.controllers;

import java.security.Principal;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

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

@Controller
@RequestMapping("/*") // Wildcard all routes.
public class Router{
	public Router(){

	}

	@RequestMapping("index")
	public String index(){
		return "index";
	}

	@RequestMapping("date")
	public String date(Model model){
	    Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, yyyy");
		model.addAttribute("date",formatter.format(date));
		return "date";
	}

	@RequestMapping("time")
	public String time(Model model){
	    Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
		model.addAttribute("time",formatter.format(date));
		return "time";
	}

	@RequestMapping("")
	public String redirect(HttpServletRequest req){		
		String url = req.getRequestURI().toString();
		return "redirect:/index";
	}		
}
