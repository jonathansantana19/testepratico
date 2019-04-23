package br.com.bb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bb.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

}
