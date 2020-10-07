package com.example.housingapp;

public class User {

    public String name, email, dob, number,
            companyName, position, lengthOfEmployment, contractTime,
            employerName, employerContact, contractType, payRoll,
            ownerName, reasonForLeaving;


    public User() {

    }

    public User(String name, String email, String dob, String number,
                String companyName, String position, String lengthOfEmployment, String contractTime,
                String empName, String empContact, String type, String payment,
                String ownerName, String reason) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.number = number;
        this.companyName = companyName;
        this.position = position;
        this.lengthOfEmployment = lengthOfEmployment;
        this.contractTime = contractTime;
        this.employerName = empName;
        this.employerContact = empContact;
        this.contractType = type;
        this.payRoll = payment;
        this.ownerName = ownerName;
        this.reasonForLeaving = reason;
    }
}
