package com.estore.controler.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.estore.datamodel.profile.User;
import com.estore.service.profile.ProfileService;

@RequestMapping("/register")
public class RegistrationController {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@Autowired
	ProfileService profileService;

	@RequestMapping(method = RequestMethod.GET)
	public String getPage(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String registrateUser(@ModelAttribute("user") User user) {
		User created = profileService.create(user);
		if (created != null) {
			return "redirect: /home";			
		} else {
			// TODO implement error page
			return "someErrorView";
		}
	}
}
