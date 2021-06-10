package com.reddclone.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reddclone.domain.Product;
import com.reddclone.domain.User;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	/* select Product and associated User */
	@Query("select p from Product p join fetch p.user where p.id = :id")
	Optional<Product> findByIdWithUser(Long id);
	
	List<Product> findByUser(User user);
	
	Optional<Product> findByName(String name);
}
