package vitalii.shapovalov.cinema.dao.implementation;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import vitalii.shapovalov.cinema.dao.RatingDao;
import vitalii.shapovalov.cinema.entity.Rating;

@Repository
public class RatingDaoImplementation implements RatingDao {
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager em;

	@Override
	public List<Rating> getAll() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Rating> cq = builder.createQuery(Rating.class);
		Root<Rating> root = cq.from(Rating.class);
		cq.select(root);
		return em.createQuery(cq).getResultList();
	}

	@Override
	public List<Rating> getAllWithNullDate() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Rating> cq = builder.createQuery(Rating.class);
		Root<Rating> root = cq.from(Rating.class);
		cq.where(builder.isNull(root.get("ratingDate")));
		return em.createQuery(cq).getResultList();
	}

	@Override
	public void changeDate(int id) {
		Rating rating = em.find(Rating.class, id);
		rating.setRatingDate(LocalDate.now());
		em.merge(rating);
	}

	@Override
	public List<Rating> sortByRatingDate() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Rating> cq = builder.createQuery(Rating.class);
		Root<Rating> root = cq.from(Rating.class);
		cq.where(builder.between(root.get("rating"), 4, 5));
		cq.orderBy(builder.asc(root.get("ratingDate")));
		return em.createQuery(cq).getResultList();
	}

}
