package vitalii.shapovalov.cinema.service;

import java.util.List;

import vitalii.shapovalov.cinema.dto.MovieDTO;
import vitalii.shapovalov.cinema.entity.Movie;

public interface MovieService {

	List<Movie> getAll();

	void create(MovieDTO m);

	void deleteById(int id);

	List<Movie> getAllWithoutRatings();
}
