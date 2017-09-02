package net.hred.shopbackend.dao;

import java.util.List;

import net.hred.shopbackend.dto.Category;

public interface CategoryDAO {

	boolean add(Category category);
	
	List<Category> list();
	Category get(int id);
}
