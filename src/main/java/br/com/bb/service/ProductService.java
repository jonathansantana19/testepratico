package br.com.bb.service;

import java.util.List;

import br.com.bb.entity.Product;

public interface ProductService {
	
	public Product getProductById(Long productId);
	
	public List<Product> getProductCategoryId(Long categoryId);

}
