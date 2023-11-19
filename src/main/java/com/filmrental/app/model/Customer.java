package com.filmrental.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerID")
    private long id;
    @Column(name = "firstName", nullable = false, length = 100)
    private String firstName;
    @Column(name = "lastName", nullable = false, length = 100)
    private String lastName;
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    @Column(name = "phone", nullable = false, length = 15)
    private String phone;

    // Constructors
    public Customer() {
    }

    public Customer(long id, String firstName, String lastName, String email, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    // Getter & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    // toString
    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
