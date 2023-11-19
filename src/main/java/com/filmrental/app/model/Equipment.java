package com.filmrental.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "equipment")
public class Equipment {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipmentID")
    private long id;
    @Column(name = "equipmentName", nullable = false, length = 100)
    private String equipmentName;
    @Column(name = "equipmentType", nullable = false, length = 50)
    private String equipmentType;
    @Column(name = "rentaRate", nullable = false)
    private double rentalRate;

    // Constructors
    public Equipment() {
    }

    public Equipment(long id, String equipmentName, String equipmentType, double rentalRate) {
        this.id = id;
        this.equipmentName = equipmentName;
        this.equipmentType = equipmentType;
        this.rentalRate = rentalRate;
    }

    // Getters & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // toString()

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", equipmentName='" + equipmentName + '\'' +
                ", equipmentType='" + equipmentType + '\'' +
                ", rentalRate=" + rentalRate +
                '}';
    }
}
