package org.zerock.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.persistence.SampleMapper;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private SampleMapper mapper;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		System.out.println("===================================================================");
		System.out.println("mapper.getClass().getName() : " + mapper.getClass().getName());
		System.out.println("mapper.getTime() : " + mapper.getTime());
		
		String email = mapper.getEmail("user10", "user10");
		System.out.println(email);
		
		String name = mapper.getUserName("user10", "user10");
		System.out.println(name);
		
		System.out.println("===================================================================");
		/*logger.info("======================================================================");
		logger.info("mapper.getTime() : " + mapper.getTime());
		logger.info("======================================================================");*/
		
		return "home";
	}
	
}
