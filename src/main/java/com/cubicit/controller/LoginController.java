package com.cubicit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	//  <form action="authUser" method="POST">
	@PostMapping({"/authUser"})
	public String execute(HttpServletRequest req){
		String username=req.getParameter("username");
		String password=req.getParameter("pswd");
		if("jack".equals(username) && "jill".equals(password)){
			return "home"; // ->> /home.jsp	
		}else{
			//Adding message in request scope so that we can access this message on jsp file
			req.setAttribute("message", "I am sorry , username and password are not correct!");
			return "auth"; // ->> /auth.jsp
		}
	}
	
//  <form action="authUser" method="POST">
	@GetMapping({"/oauth"})
	public String showPage(){
		return "auth"; // ->> /auth.jsp
	}

}
