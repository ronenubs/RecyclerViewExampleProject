package com.example.recyclerviewexample;

public class Student {
    private String lastName;
    private String firstName;
    private int idNumber;
    private String course;
    private int year;

    public Student(String lastName, String firstName, int idNumber, String course, int year){
        this.lastName = lastName;
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.course = course;
        this.year = year;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }
}
