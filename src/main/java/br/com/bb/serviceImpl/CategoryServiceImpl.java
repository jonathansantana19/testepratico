/**
 * 
 */
/**
 * @author jonathan.santana
 *
 */
package br.com.bb.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bb.entity.Category;
import br.com.bb.repository.CategoryRepository;
import br.com.bb.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;


	@Override
	public Category getCategoryById(Long categoryId) {
		Optional<Category>obj = categoryRepository.findById(categoryId);
		return obj.get();
	}


	@Override
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}

}