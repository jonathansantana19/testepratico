package br.com.bb.service;

import java.util.List;

import br.com.bb.entity.Category;

public interface CategoryService {

	public Category getCategoryById(Long categoryId);

	public List<Category> getAll();

}
