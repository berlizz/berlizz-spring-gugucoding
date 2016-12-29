package org.zerock.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.domain.UserVO;
import org.zerock.dto.LoginDTO;
import org.zerock.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Inject
	private UserService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") LoginDTO dto) throws Exception {
		
	}
	
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public void loginPOST(LoginDTO dto, HttpSession session, Model model) throws Exception {
		UserVO vo = service.login(dto);
		
		if(vo == null) {
			return;
		}
		
		model.addAttribute("userVO", vo);
	}
}
