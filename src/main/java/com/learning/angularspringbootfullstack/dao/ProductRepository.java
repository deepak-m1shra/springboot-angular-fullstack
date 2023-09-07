package com.learning.angularspringbootfullstack.dao;

import com.learning.angularspringbootfullstack.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
