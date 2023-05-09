package com.panion;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Ariana", LocalDate.of(1992, 4, 2));
        System.out.println(p1);
        System.out.printf("%s is %s years old", p1.getName(), p1.getAge());
    }
}
