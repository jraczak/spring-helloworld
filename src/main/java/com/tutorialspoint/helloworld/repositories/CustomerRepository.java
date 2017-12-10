package com.tutorialspoint.helloworld.repositories;

import com.tutorialspoint.helloworld.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
