package com.estore.controler.catalog;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.estore.dao.catalog.CategoryDao;
import com.estore.dao.catalog.ProductDao;
import com.estore.datamodel.catalog.Category;
import com.estore.datamodel.catalog.Product;
import com.google.common.collect.Sets;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
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
		
		Product p = productDao.findById("1");
		logger.info("id = " + p.getId() + " , title = " + p.getTitle() + " , description = " + p.getDescription() + ", created = " + p.getCreated());
		
		Category cat1 = new Category();
		cat1.setTitle("title");
		cat1.setDescription("description1");
		cat1.setCreated(new Timestamp(System.currentTimeMillis()));
		cat1.setProducts(Sets.newHashSet(p));
		
		String idCreated = categoryDao.create(cat1);
		logger.info("idCreated: ", idCreated);
		
		Category cat1Created = categoryDao.findById(idCreated);
		logger.info("id = " + cat1Created.getId() + " , title = " + cat1Created.getTitle() + " , description = " + cat1Created.getDescription() 
				+ ", created = " + p.getCreated());
		
		cat1Created.setDescription("description111");
		categoryDao.saveOrUpdate(cat1Created);
		logger.info("id = " + cat1Created.getId() + " , title = " + cat1Created.getTitle() + " , description = " + cat1Created.getDescription() 
				+ ", created = " + p.getCreated());
		return "home";
	}
	
}
