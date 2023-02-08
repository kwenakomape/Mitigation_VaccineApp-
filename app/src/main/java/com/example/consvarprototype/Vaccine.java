package com.example.consvarprototype;

public class Vaccine {
    private String noOfVaccines;
    private String typeOfVaccine;
    private String dateManufactured;
    private String expiryDate;

    public Vaccine(String noOfVaccines, String typeOfVaccine, String dateManufactured, String expiryDate) {
        this.noOfVaccines = noOfVaccines;
        this.typeOfVaccine = typeOfVaccine;
        this.dateManufactured = dateManufactured;
        this.expiryDate = expiryDate;
    }

    public String getNoOfVaccines() {
        return noOfVaccines;
    }

    public void setNoOfVaccines(String noOfVaccines) {
        this.noOfVaccines = noOfVaccines;
    }

    public String getTypeOfVaccine() {
        return typeOfVaccine;
    }

    public void setTypeOfVaccine(String typeOfVaccine) {
        this.typeOfVaccine = typeOfVaccine;
    }

    public String getDateManufactured() {
        return dateManufactured;
    }

    public void setDateManufactured(String dateManufactured) {
        this.dateManufactured = dateManufactured;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return
                "noOfVaccines='" + noOfVaccines +
                        ", typeOfVaccine='" + typeOfVaccine +
                        ", dateManufactured='" + dateManufactured +
                        ", expiryDate=" + expiryDate;
    }
}
