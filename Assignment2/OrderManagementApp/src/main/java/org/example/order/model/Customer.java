package org.example.order.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue()
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String pin;
    private String street;
    private String city;
    private String state;
    private String landmarks;
    private String creditCardInfo;
    private String creditCardPostalCode;

    public Customer(Long id, String firstName, String lastName, String email, String phoneNumber,
                    String pin, String street, String city, String state, String landmarks,
                    String creditCardInfo, String creditCardPostalCode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
        this.street = street;
        this.city = city;
        this.state = state;
        this.landmarks = landmarks;
        this.creditCardInfo = creditCardInfo;
        this.creditCardPostalCode = creditCardPostalCode;
    }

    public Customer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLandmarks() {
        return landmarks;
    }

    public void setLandmarks(String landmarks) {
        this.landmarks = landmarks;
    }

    public String getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(String creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    public String getCreditCardPostalCode() {
        return creditCardPostalCode;
    }

    public void setCreditCardPostalCode(String creditCardPostalCode) {
        this.creditCardPostalCode = creditCardPostalCode;
    }
}
