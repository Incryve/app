package com.filmrental.app.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "equipmentLogs")
public class Equipmentlog {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "logId")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "equipmentID", referencedColumnName = "equipmentID")
    private Equipment equipment;

    @Column(name = "logText", nullable = false)
    private String logText;

    @Column(name = "logDate", nullable = false)
    private LocalDate logDate;

    // Constructors
    public Equipmentlog() {
    }

    public Equipmentlog(Equipment equipment, String logText, LocalDate logDate) {
        this.equipment = equipment;
        this.logText = logText;
        this.logDate = logDate;
    }

    // Getters & Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getLogText() {
        return logText;
    }

    public void setLogText(String logText) {
        this.logText = logText;
    }

    public LocalDate getLogDate() {
        return logDate;
    }

    public void setLogDate(LocalDate logDate) {
        this.logDate = logDate;
    }

    // toString()

    @Override
    public String toString() {
        return "Equipmentlog{" +
                "id=" + id +
                ", equipment=" + equipment +
                ", logText='" + logText + '\'' +
                ", logDate=" + logDate +
                '}';
    }
}
