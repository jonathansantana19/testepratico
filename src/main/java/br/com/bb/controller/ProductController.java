package br.com.bb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.entity.Product;
import br.com.bb.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/getProductById/{productId}")
	public Product getCategoryById(@PathVariable(name="productId") Long productId) {
		return productService.getProductById(productId);
		
	}
	
	@GetMapping("/listByCategory/{categoryId}")
	public List<Product> getListByCategory(@PathVariable(name="categoryId") Long categoryId) {
		return productService.getProductCategoryId(categoryId);
		
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	

}
