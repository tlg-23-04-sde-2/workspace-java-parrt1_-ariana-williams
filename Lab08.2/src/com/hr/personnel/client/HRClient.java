/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1500.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 15.50, 10.0));
        dept.addEmployee(new SalariedEmployee("Amanda", LocalDate.of(2013,8,1), 2500.0));
        dept.addEmployee(new HourlyEmployee("Kyla", LocalDate.of(2016,3,10), 12.50, 20.5));
        dept.addEmployee(new Executive("Ariana", LocalDate.of(2023, 04, 17), 250_000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //Pay all employees
        System.out.println("\nPay employees");
        dept.payEmployees();

        //forced holiday break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();

    }
}