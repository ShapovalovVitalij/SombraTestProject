package vitalii.shapovalov.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vitalii.shapovalov.cinema.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/task0users")
	String allUsers(Model model) {
		model.addAttribute("users", userService.getAll());
		return "users/allUsers";
	}
}
