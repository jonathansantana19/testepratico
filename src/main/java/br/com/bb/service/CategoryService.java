package br.com.bb.service;

import org.springframework.stereotype.Service;

import br.com.bb.entity.Category;

public interface CategoryService {

	public Category getByCategory(Long categoryId);

}
