package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	@RequestMapping(value = "/myLogin")
	public void myLogin(@RequestParam(value = "error", required = false) String error, 
						@RequestParam(value = "logout", required = false) String logout, Model model) {
		logger.info("my login");
		
		if(error != null) {
			model.addAttribute("error", "Invalid username and password");
		}
		if(logout != null) {
			model.addAttribute("msg", "You've been logged out successfully");
		}
	}
	
	@RequestMapping(value = "myLogout")
	public void myLogout() {

	}

}
