package org.example.order.controller;

import org.example.order.repository.CustomerRepository;
import org.example.order.repository.ProductRepository;
import org.example.order.repository.PurchaseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PurchaseController {

    private final PurchaseRepository purchaseRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    public PurchaseController(PurchaseRepository purchaseRepository, CustomerRepository customerRepository, ProductRepository productRepository) {
        this.purchaseRepository= purchaseRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    @GetMapping("/completeOrder")
    public String completeCart() {
        /*
        System.out.println("Product Name: " + order.getName());
        System.out.println("Price " + order.getPrice());
        System.out.println("Item ID " + order.getId());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Session ID: " + session.getId());
        */
        return "purchaseDone";
    }
}
