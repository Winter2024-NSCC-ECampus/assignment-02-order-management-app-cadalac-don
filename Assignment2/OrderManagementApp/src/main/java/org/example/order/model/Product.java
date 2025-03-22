package org.example.order.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Product {

    @Id
    @GeneratedValue()
    private Long id;

    private String name;
    private int quantity;
    private int price;
    private String picture;
    private String description;
    private String reviews;
    private int rating;

    public Product() {

    }

    public Product(Long id, String name, int quantity, int price, String picture,
                   String description, String reviews, int rating) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.picture = picture;
        this.description = description;
        this.reviews = reviews;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
