package vitalii.shapovalov.cinema.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import vitalii.shapovalov.cinema.dao.UserDao;
import vitalii.shapovalov.cinema.entity.User;


@Repository
public class UserDaoImplementation implements UserDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<User> getAll() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<User> cq = builder.createQuery(User.class);
		Root<User> root = cq.from(User.class);
		cq.select(root);
		return em.createQuery(cq).getResultList();
	}

}
