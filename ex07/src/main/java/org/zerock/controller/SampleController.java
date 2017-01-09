package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/sample")
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping(value = "/forGuest")
	public void forGuest() {
		logger.info("for guest");
	}
	
	@RequestMapping(value = "/forMember")
	public void forMember() {
		logger.info("for member");
	}
	
	@RequestMapping(value = "/forManager")
	public void forManager() {
		logger.info("for manager");
	}
	
	@RequestMapping(value = "/forAdmin")
	public void forAdmin() {
		logger.info("for admin");
	}
	
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

	@RequestMapping(value = "fail")
	public void fail() {
		logger.info("fail");
	}

}
