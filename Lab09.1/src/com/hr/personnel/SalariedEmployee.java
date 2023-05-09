package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //instance variables
    private double salary;

    //constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    //business methods or action methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation() {
        System.out.printf("%s is on vacation\n", getName());
    }

    //accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }

    @Override
    public void payTaxes() {
        double taxesPaid = getSalary() * SALARIED_TAX_RATE;
        System.out.printf("%s pays %s in taxes\n", getName(), taxesPaid);
    }
}
