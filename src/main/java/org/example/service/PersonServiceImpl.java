package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.example.dao.PersonDao;
import org.example.domain.Person;

//@AllArgsConstructor
@Setter
public class PersonServiceImpl implements PersonService {
    private PersonDao dao;

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
