package com.studyingjava.demo.entities;


public class Employee {
    private String name;
    private Double grossSalary;

    public Employee() {}

    public Employee(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void getGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
