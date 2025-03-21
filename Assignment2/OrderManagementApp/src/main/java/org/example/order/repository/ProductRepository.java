package org.example.order.repository;

import org.example.order.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByOrderByIdAsc();
    List<Product> findAllByOrderByIdDesc();
}

