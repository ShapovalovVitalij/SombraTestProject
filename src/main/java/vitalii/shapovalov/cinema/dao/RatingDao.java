package vitalii.shapovalov.cinema.dao;

import java.util.List;

import vitalii.shapovalov.cinema.entity.Rating;

public interface RatingDao {

	List<Rating> getAll();

	List<Rating> getAllWithNullDate();

	void changeDate(int id);

	List<Rating> sortByRatingDate();
}
