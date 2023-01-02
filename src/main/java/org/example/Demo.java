package org.example;

import org.example.domain.Person;
import org.example.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        PersonService service = context.getBean(PersonService.class);
        Person person = service.getByName("Иван");
        System.out.printf("name: %s age: %s%n", person.getName(), person.getAge());
    }
}
