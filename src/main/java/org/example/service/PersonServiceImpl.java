package org.example.service;

import lombok.AllArgsConstructor;
import org.example.dao.PersonDao;
import org.example.domain.Person;

@AllArgsConstructor
public class PersonServiceImpl implements PersonService {
    private PersonDao dao;

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
