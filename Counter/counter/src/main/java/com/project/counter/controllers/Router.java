package com.project.counter.controllers;

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

@Controller
@RequestMapping("/*") // Wildcard all routes.
public class Router{
	public Router(){

	}



	@RequestMapping("index")
	public String index(HttpSession session){
		if(session.getAttribute("counter")==null){ //this line is checking if it's null. and if it is. it's setting it to zero.
			session.setAttribute("counter", 0);
		}
		else{
			session.setAttribute("counter", (Integer) session.getAttribute("counter")+1);
		}

		return "index";
	}

	@RequestMapping("counter")
	public String counter(){
		return "counter";
	}

	@RequestMapping("reset")
	public String reset(HttpSession session){
		session.setAttribute("counter", 0);
		return "redirect:/counter";
	}



	@RequestMapping("")
	public String redirect(HttpServletRequest req){		
		String url = req.getRequestURI().toString();
		return "redirect:/index";
	}		
}
