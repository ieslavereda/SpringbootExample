package es.ieslavereda.springbootexample.controller;

import es.ieslavereda.springbootexample.model.Person;
import es.ieslavereda.springbootexample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @DeleteMapping()
    public void deletePerson(@RequestParam("id") Integer id){
        personService.deletePerson(id);
    }

    @PutMapping()
    public void update(@RequestBody Person person){
        personService.updatePerson(person);
    }
}
