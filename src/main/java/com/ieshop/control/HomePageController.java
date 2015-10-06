package com.ieshop.control;
 

import java.util.Locale;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ieshop.dao.UserDao;
 


@Controller
public class HomePageController {
	
	@Autowired 
	private UserDao userDao;
	
	public HomePageController() {
	}

	@RequestMapping(value="/showMessage", method=RequestMethod.GET)
	public ModelAndView hello (Locale locale, Model model) {
			
			ModelAndView modelAndView =new ModelAndView("forward:app/index.html");

			System.out.println(userDao.getAll());

		return modelAndView;
	}
	
 

}
