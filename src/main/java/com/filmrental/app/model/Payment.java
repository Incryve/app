package com.filmrental.app.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {
    //Attributes
    private long id;
    private Rental rental;
    private BigDecimal amount;
    private LocalDate paymentDate;

    // Constructors

    public Payment() {
    }

    public Payment(Rental rental, BigDecimal amount, LocalDate paymentDate) {
        this.rental = rental;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Getters & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    // toString()

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", rental=" + rental +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
