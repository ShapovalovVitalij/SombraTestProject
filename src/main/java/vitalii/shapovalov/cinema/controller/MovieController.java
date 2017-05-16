package vitalii.shapovalov.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vitalii.shapovalov.cinema.dto.MovieDTO;
import vitalii.shapovalov.cinema.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;

	@RequestMapping("/task0movies")
	String showAll(Model model) {
		model.addAttribute("movies", movieService.getAll());
		return "movies/allMovies";
	}

	@RequestMapping("/task2")
	String createMovie(Model model) {
		model.addAttribute("movieForm", new MovieDTO());
		return "movies/create";
	}

	@RequestMapping(value = "/task2", method = RequestMethod.POST)
	String createMovie(@ModelAttribute("movieForm") MovieDTO movie) {
		System.out.println("mamama");
		movieService.create(movie);
		return "redirect:/task0movies";
	}

	@RequestMapping("/task5/" + "{id}")
	String deleteById(@PathVariable int id) {
		movieService.deleteById(id);
		return "redirect:/task0movies";
	}

	@RequestMapping("/task4")
	String showAllMoviesWithoutRatings(Model model) {
		model.addAttribute("movies", movieService.getAllWithoutRatings());
		return "movies/allMoviesWithoutRatings";
	}
}
