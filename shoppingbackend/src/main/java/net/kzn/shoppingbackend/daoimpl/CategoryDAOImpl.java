package net.kzn.shoppingbackend.daoimpl;
import java.util.List;
import java.util.ArrayList;
import net.kzn.shoppingbackend.dto.Category;
import net.kzn.shoppingbackend.dao.CategoryDAO;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
    private static List<Category> categories = new ArrayList<Category>();
    static {
    	Category category = new Category();
    	
    	//Adding the first category to the list
    	category.setId(1);
    	category.setName("Television");
    	category.setDescription("Television Description");
    	category.setImageURL("CAT_1.png");
    	categories.add(category);
    	
    	//Adding the second category to the list
    	category = new Category();
    	category.setId(2);
    	category.setName("Mobile");
    	category.setDescription("Mobile Description");
    	category.setImageURL("CAT_2.png");
    	categories.add(category);
    	
    	//Adding the third category to the list
    	category = new Category();
    	category.setId(3);
    	category.setName("Laptop");
    	category.setDescription("Laptop Description");
    	category.setImageURL("CAT_3.png");
    	categories.add(category);
    }
	@Override
	public List<Category> list() {
		return categories;
	}
	@Override
	public Category get(int id) {
		for(Category category: categories) {
			if(category.getId() == id) return category;
		}
		return null;
	}
}