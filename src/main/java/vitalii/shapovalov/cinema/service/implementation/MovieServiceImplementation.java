package vitalii.shapovalov.cinema.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vitalii.shapovalov.cinema.dao.MovieDao;
import vitalii.shapovalov.cinema.dto.MovieDTO;
import vitalii.shapovalov.cinema.entity.Movie;
import vitalii.shapovalov.cinema.service.MovieService;

@Service
@Transactional
public class MovieServiceImplementation implements MovieService {

	@Autowired
	private MovieDao movieDao;

	@Override
	public List<Movie> getAll() {
		return movieDao.getAll();
	}

	@Override
	public void create(MovieDTO m) {
		Movie movie = new Movie();
		movie.setId(m.getId());
		movie.setDirector(m.getDirector());
		movie.setTitle(m.getTitle());
		movieDao.create(movie);

	}

	@Override
	public void deleteById(int id) {
		movieDao.deleteById(id);

	}

	@Override
	public List<Movie> getAllWithoutRatings() {
		return movieDao.getAllWithoutRatings();
	}

}
