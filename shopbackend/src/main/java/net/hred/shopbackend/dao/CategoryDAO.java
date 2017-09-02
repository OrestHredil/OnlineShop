package net.hred.shopbackend.dao;

import java.util.List;

import net.hred.shopbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
