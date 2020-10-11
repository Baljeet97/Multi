package com.example.housingapp;

public class User {

    public String name, email, dob, number,
            companyName, position, lengthOfEmployment,
            employerName, employerContact, payRoll,
            ownerName, reasonForLeaving, empCompanyName;


    public User() {

    }

    public User(String name, String email, String dob, String number,
                String companyName, String position, String lengthOfEmployment,
                String empName, String empContact,  String payment,
                String ownerName, String reason, String empCompanyName) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.number = number;

        this.companyName = companyName;
        this.position = position;
        this.lengthOfEmployment = lengthOfEmployment;
        this.employerName = empName;
        this.employerContact = empContact;

        this.empCompanyName = empCompanyName;
        this.payRoll = payment;

        this.ownerName = ownerName;
        this.reasonForLeaving = reason;
    }
}
