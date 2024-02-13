package es.ieslavereda.springbootexample.controller;

import es.ieslavereda.springbootexample.model.Person;
import es.ieslavereda.springbootexample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping()
    public void addPerson(@RequestBody Person person){
        personService.create(person);
    }

    @GetMapping()
    public Person getPersonByUsername(@RequestParam(value = "username") String username){
        return personService.getUserByUsername(username);
    }
}
