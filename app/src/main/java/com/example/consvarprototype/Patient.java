package com.example.consvarprototype;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private int ID;
    private String Address;
    private String medicalAidNumber;
    private String dateOfBirth;
    private int Age;
    private String centerName;
    ArrayList<Patient> patients;


    public Patient(String name, String lastName, String CenterName) {
        super(name, lastName);
        this.patients = new ArrayList<>();
        this.centerName = CenterName;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {

        this.patients = patients;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMedicalAidNumber() {
        return medicalAidNumber;
    }

    public void setMedicalAidNumber(String medicalAidNumber) {
        this.medicalAidNumber = medicalAidNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return
                "Congratulations " + getName() + " " + getLastName() + " You have now registered for South African COVID-19 Vaccination Programme at " + getCenterName() +
                        "\nSummary of what to expect next:\n" +
                        " \n"+
                        " 1.You will receive a notification on your app within 24hours confirming successful registration for vaccination, you will have accept or decline " +
                        " the offer on the app\n" +

                        " 2. Offers not accepted within two days after confirmation will be withdrawn";
    }
}
