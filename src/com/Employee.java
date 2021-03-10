package com;

import java.util.ArrayList;

public class Employee {

    private String name;
    private int age;
    private String designation;
    private double salary;

    public static String surname;

    public static void staticMethod()
    {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String desi) {
        designation = desi;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Employee.surname = surname;
    }



}
