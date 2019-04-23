package br.com.bb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	
//	http://localhost:8080/api/category/listAll
//		http://localhost:8080/api/product/listByCategory/{categoryId}
	
	
	
	@GetMapping("/listByCategory/{idCategory}")
	public Product getByCategory(@PathVariable(name="idCategory") Long categoryId) {
		
		Product p = new Product();
		p.setName("ok");
		return p;
		
	}

//

	

}
