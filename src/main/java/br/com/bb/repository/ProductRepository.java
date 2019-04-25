package br.com.bb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.bb.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

	@Query(value = "SELECT * FROM PRODUTO " + 
			" WHERE ID_CATEGORIA =:idCategory" , nativeQuery=true)
	List<Product> getProductCategoryId(@Param("idCategory") Long categoryId);

}
