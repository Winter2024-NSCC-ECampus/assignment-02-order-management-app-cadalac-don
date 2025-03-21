package org.example.order.repository;

import org.example.order.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerByEmail(String email);
}

