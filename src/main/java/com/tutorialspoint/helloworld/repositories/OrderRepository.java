package com.tutorialspoint.helloworld.repositories;

//  Created by Justin on 12/10/17   

import com.tutorialspoint.helloworld.models.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<CustomerOrder, Long> {
}
