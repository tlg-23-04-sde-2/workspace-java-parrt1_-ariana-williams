package com.panion;
/*
 * An immutable class.
 * More accurately its a class definition written in such a way that
 * instances of it (Person objects) can't have their properties changed
 *
 * In the code, this simply means no public setters.
 */

import java.time.LocalDate;
import java.time.Period;

class Person {
    private final String name;
    private final LocalDate birthDate;
    public Person (String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
      int years = Period.between(getBirthDate(), LocalDate.now()).getYears();
      return years;
    }

    @Override
    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", getName(), getBirthDate());
    }
}
