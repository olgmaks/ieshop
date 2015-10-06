package com.ieshop.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ieshop.model.User;

@Repository
public class UserDao implements UserDaoAble{

	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDao(){}

	public List<User> getAll() {
		@SuppressWarnings("unchecked")
		List<User> results = (List<User>)sessionFactory.openSession().createQuery("from User").list();
		return results;
	}

}
