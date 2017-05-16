package vitalii.shapovalov.cinema.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vitalii.shapovalov.cinema.dao.UserDao;
import vitalii.shapovalov.cinema.entity.User;
import vitalii.shapovalov.cinema.service.UserService;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}
