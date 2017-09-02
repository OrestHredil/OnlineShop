package net.hred.shopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.hred.shopbackend.dao.CategoryDAO;
import net.hred.shopbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List <Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is tevevisor with usb");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is mobile with touchscreen");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is laptop with mouse");
		category.setImageURL("CAT_3.png");
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
