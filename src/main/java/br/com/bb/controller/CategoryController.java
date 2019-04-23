package br.com.bb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.entity.Category;
import br.com.bb.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

//	@Autowired
//	private CategoryService categoryService;
	
	@GetMapping(value = "/list" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Category getAllCategory() {
		
		Category p = new Category();
		p.setName("heelo");
		return p;
	}
	
	
	
//	public void setCategoryService(CategoryService categoryService) {
//	this.categoryService = categoryService;
//}
	
}
