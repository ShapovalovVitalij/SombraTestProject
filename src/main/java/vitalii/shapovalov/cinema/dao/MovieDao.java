package vitalii.shapovalov.cinema.dao;

import java.util.List;

import vitalii.shapovalov.cinema.entity.Movie;

public interface MovieDao {

	List<Movie> getAll();

	void create(Movie m);

	void deleteById(int id);

	Movie getById(int id);

	List<Movie> getAllWithoutRatings();

}
