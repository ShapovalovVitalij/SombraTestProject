package vitalii.shapovalov.cinema.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vitalii.shapovalov.cinema.dao.RatingDao;
import vitalii.shapovalov.cinema.entity.Rating;
import vitalii.shapovalov.cinema.service.RatingService;

@Service
@Transactional
public class RatingServiceImplementation implements RatingService {

	@Autowired
	private RatingDao ratingDao;

	@Override
	@Transactional(readOnly = true)
	public List<Rating> getAll() {
		return ratingDao.getAll();
	}

	@Override
	public List<Rating> getAllUsersWothoutRatingDate() {

		return ratingDao.getAllWithNullDate();
	}

	@Override
	public void changeDate(int id) {
		ratingDao.changeDate(id);

	}

	@Override
	public List<Rating> sortByRatingDate() {
		return ratingDao.sortByRatingDate();
	}

}
