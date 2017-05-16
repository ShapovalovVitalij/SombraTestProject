package vitalii.shapovalov.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	String showIndex(Model model) {
		return "index";
	}

}
