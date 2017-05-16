package vitalii.shapovalov.cinema.service;

import java.util.List;

import vitalii.shapovalov.cinema.entity.Rating;

public interface RatingService {

	List<Rating> getAll();

	List<Rating> getAllUsersWothoutRatingDate();

	void changeDate(int id);

	List<Rating> sortByRatingDate();
}
