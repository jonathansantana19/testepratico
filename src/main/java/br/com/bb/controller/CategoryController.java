package br.com.bb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.entity.Category;
import br.com.bb.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(value = "/listAll" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Category> getAllCategory() {
		return categoryService.getAll();
	}
	
	
	@GetMapping(value = "/getCategoryByI/{categoryId}" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Category getCategoryById(@PathVariable(name="categoryId") Long categoryId) {
		return categoryService.getCategoryById(categoryId);
	}
	
	
	public void setCategoryService(CategoryService categoryService) {
	this.categoryService = categoryService;
}
	
}
