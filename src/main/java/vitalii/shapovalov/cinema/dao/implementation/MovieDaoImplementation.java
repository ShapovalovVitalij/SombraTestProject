package vitalii.shapovalov.cinema.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import vitalii.shapovalov.cinema.dao.MovieDao;
import vitalii.shapovalov.cinema.entity.Movie;


@Repository
public class MovieDaoImplementation implements MovieDao {
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager em;

	@Override
	public List<Movie> getAll() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Movie> cq = builder.createQuery(Movie.class);
		Root<Movie> root = cq.from(Movie.class);
		cq.select(root);
		return em.createQuery(cq).getResultList();
	}

	@Override
	public void create(Movie m) {
		em.persist(m);

	}

	@Override
	public void deleteById(int id) {
		em.remove(getById(id));
	}

	@Override
	public Movie getById(int id) {
		return em.find(Movie.class, id);
	}

	@Override
	public List<Movie> getAllWithoutRatings() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Movie> cq = builder.createQuery(Movie.class);
		Root<Movie> root = cq.from(Movie.class);
		cq.select(root);
		return em.createQuery(cq).getResultList();

	}
}
