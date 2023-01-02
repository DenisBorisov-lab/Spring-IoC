package org.example.dao;

import lombok.Setter;
import org.example.domain.Person;

@Setter
public class PersonDaoSimple implements PersonDao {
    private int defaultAge;
    @Override
    public Person findByName(String name) {
        return new Person(name, defaultAge);
    }
}
