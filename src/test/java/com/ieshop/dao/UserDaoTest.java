package com.ieshop.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration("*/mvc-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {
	
	 @Configuration
	    static class ContextConfiguration {

	        // this bean will be injected into the OrderServiceTest class
	        @Bean
	        public UserDao userDao() {
	        	UserDao userDao = new UserDao();
	            // set properties, etc.
	            return userDao;
	        }
	    }

	
	@Autowired
	UserDaoAble userDao;

	@Test
	public void testGetAll() {

		try {
			System.out.println(userDao.getAll());

		} catch (Exception e) {
			e.printStackTrace(); // TODO: handle exception
		}
	}

}
