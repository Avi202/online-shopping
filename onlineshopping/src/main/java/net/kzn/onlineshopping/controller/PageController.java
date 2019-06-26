package net.kzn.onlineshopping.controller;
import net.kzn.shoppingbackend.dto.Category;
import net.kzn.shoppingbackend.dao.CategoryDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@Autowired
	private CategoryDAO categoryDAO;
	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClicksHome", true);
		return mv;
	}
	@RequestMapping(value="/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClicksAbout", true);
		return mv;
	}
	@RequestMapping(value="/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClicksContact", true);
		return mv;
	}
	/* Method to find all products and based on id
	 * 
	 */
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "AllProducts");
		mv.addObject("categories", categoryDAO.list());    //Passing the list of Products
		mv.addObject("userClicksAllProducts", true);
		return mv;
	}
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		//Fetching a single category based on Id
		Category category = null;
		category = categoryDAO.get(id);
		mv.addObject("title", category.getName());
		mv.addObject("categories", categoryDAO.list());    //Passing the list of Products
		mv.addObject("category", category);    //Passing the single category object
		mv.addObject("userClicksCategoryProducts", true);
		return mv;
	}
}