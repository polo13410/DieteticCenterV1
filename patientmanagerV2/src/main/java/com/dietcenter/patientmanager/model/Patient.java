package com.dietcenter.patientmanager.model;

import javax.persistence.*;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long id;
    String sName;
    String sSurname;
    double dWeight;
    String sColorHex;
    String sDreamText;

    public Patient(Long id, String sName, String sSurname, double dWeight, String sColorHex, String sDreamText) {
        this.id = id;
        this.sName = sName;
        this.sSurname = sSurname;
        this.dWeight = dWeight;
        this.sColorHex = sColorHex;
        this.sDreamText = sDreamText;
    }

    public Patient() {
    }

    @Override
    public String toString(){
        return "Patient{" +
                "id=" + id +
                ", name='" + sName + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return sName;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public String getSurname() {
        return sSurname;
    }

    public void setSurname(String sSurname) {
        this.sSurname = sSurname;
    }

    public double getWeight() {
        return dWeight;
    }

    public void setWeight(double dWeight) {
        this.dWeight = dWeight;
    }

    public String getColorHex() {
        return sColorHex;
    }

    public void setColorHex(String sColorHex) {
        this.sColorHex = sColorHex;
    }

    public String getsDreamText() {
        return sDreamText;
    }

    public void setsDreamText(String sDreamText) {
        this.sDreamText = sDreamText;
    }
}
