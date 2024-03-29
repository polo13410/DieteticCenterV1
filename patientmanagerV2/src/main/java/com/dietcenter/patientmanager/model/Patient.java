package com.dietcenter.patientmanager.model;

import javax.persistence.*;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String surname;
    private double weight;
    private double height;
    private double imc;
    private String colorHex;
    private String status;

    public Patient(Long id, String sName, String sSurname, double dWeight, String sColorHex, String status) {
        this.id = id;
        this.name = sName;
        this.surname = sSurname;
        this.weight = dWeight;
        this.colorHex = sColorHex;
        this.status = status;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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

    public void setName(String sName) {
        this.name = sName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String sSurname) {
        this.surname = sSurname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double dWeight) {
        this.weight = dWeight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double dHeight) {
        this.height = dHeight;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double dImc) {
        this.imc = dImc;
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColorHex(String sColorHex) {
        this.colorHex = sColorHex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
