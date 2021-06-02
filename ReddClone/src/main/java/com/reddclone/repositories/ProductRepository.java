package com.reddclone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reddclone.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
