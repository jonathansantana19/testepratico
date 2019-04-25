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

import br.com.bb.entity.Product;
import br.com.bb.repository.ProductRepository;
import br.com.bb.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;



	@Override
	public Product getProductById(Long productId) {
		Optional<Product>obj = productRepository.findById(productId);
		return obj.get();
	}



	@Override
	public List<Product> getProductCategoryId(Long categoryId) {
		return productRepository.getProductCategoryId(categoryId);
	}

}