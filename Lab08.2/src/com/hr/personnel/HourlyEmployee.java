package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    //instance variables
    private double rate;
    private double hours;

    //constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }
    //business methods or action methods
    @Override
    public void pay() {
        double payment = getRate() * getHours(); // calculates the total payment for the hours worked
        System.out.println(getName() + " is paid hourly " + payment);
    }

    //accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + ", rate="
                + getRate() + ", hours=" + getHours();
    }
}
