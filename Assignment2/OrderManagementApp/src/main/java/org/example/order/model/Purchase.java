package org.example.order.model;

import jakarta.persistence.*;

@Entity
public class Purchase {

    @Id
    @GeneratedValue()
    private Long id;

    //ID of item
    @OneToOne
    @JoinColumn(name = "product_id")
    Product product;

    //ID of customer
    @OneToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    // Local Table
    private int totalCost;
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Purchase() {

    }

    public Purchase(Long id, Product product, Customer customer, int totalCost, int quantity) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.totalCost = totalCost;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
