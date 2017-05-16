package vitalii.shapovalov.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vitalii.shapovalov.cinema.service.RatingService;

@Controller
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@RequestMapping("/task0ratings")
	String showAll(Model model) {
		model.addAttribute("ratings", ratingService.getAll());
		return "ratings/allRatings";
	}

	@RequestMapping("/task6")
	String showFullMovieInfo(Model model) {
		model.addAttribute("ratings", ratingService.getAll());
		return "ratings/allRatingsWithDetails";
	}

	@RequestMapping("/task1")
	String eliminateNulls(Model model) {
		model.addAttribute("ratings", ratingService.getAllUsersWothoutRatingDate());
		return "ratings/allRatingsWithNull";
	}

	@RequestMapping("/task1/" + "{id}")
	String editRating(@PathVariable int id) {
		ratingService.changeDate(id);
		return "redirect:/task0ratings";
	}

	@RequestMapping("/task3")
	String sortByRatingDate(Model model) {
		model.addAttribute("ratings", ratingService.sortByRatingDate());
		return "ratings/allSorted";
	}
}
