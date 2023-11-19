package com.filmrental.app.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "rentals")
public class Rental {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rentalID")
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerID", referencedColumnName = "customerID")
    private Customer customer;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipmentID", referencedColumnName = "equipmentID")
    private Equipment equipment;
    @Column(name = "rentalDate", nullable = false)
    private LocalDate rentalDate;
    @Column(name = "duelDate", nullable = false)
    private LocalDate dueDate;
    @Column(name = "returnDate")
    private LocalDate returnDate;

    // Constructors
    public Rental() {
    }
    public Rental(Customer customer, Equipment equipment, LocalDate rentalDate, LocalDate dueDate, LocalDate returnDate) {
        this.customer = customer;
        this.equipment = equipment;
        this.rentalDate = rentalDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
    }

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    // toString()

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", customer=" + customer +
                ", equipment=" + equipment +
                ", rentalDate=" + rentalDate +
                ", dueDate=" + dueDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
