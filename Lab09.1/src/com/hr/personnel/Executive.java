package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee{

    // constructor
    public Executive() {
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work() {
        System.out.printf("%s is enjoying a nice round of golf", getName());
    }
}
