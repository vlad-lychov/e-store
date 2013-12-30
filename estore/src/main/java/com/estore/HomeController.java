package com.estore;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.estore.catalog.datamodel.Product;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private SessionFactory factory;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is "+ locale.toString());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String homeTest(Locale locale, Model model) {
		
//		Session session = factory.openSession();
//		
//		Product pr = new Product();
//		pr.setTitle("title");
//		pr.setDescription("description");
//		pr.setCreated(System.currentTimeMillis());
//		
//		String id = (String) session.save(pr);
//		logger.info("Save. id = " + id);
//		
//		Product pr2 = new Product();
//		pr2.setTitle("title2");
//		pr2.setDescription("description2");
//		pr2.setCreated(System.currentTimeMillis());
//		
//		String id2 = (String) session.save(pr2);
//		logger.info("Save. id = " + id2);
//		
//		session.close();
		
		Session session2 = factory.openSession();
		
		List<Product> products = session2.createCriteria(Product.class).list();
		for (Product p : products) {
			logger.info("id = " + p.getId() + " , title = " + p.getTitle() + " , description = " + p.getDescription() + ", created = " + new Date(p.getCreated()));
		}
		
		return "home";
	}
	
}
