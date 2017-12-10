package com.tutorialspoint.helloworld.repositories;

import com.tutorialspoint.helloworld.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
