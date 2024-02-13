package es.ieslavereda.springbootexample.controller;

import es.ieslavereda.springbootexample.model.Person;
import es.ieslavereda.springbootexample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping()
    public void addPerson(@RequestBody Person person){
        personService.create(person);
    }

}
