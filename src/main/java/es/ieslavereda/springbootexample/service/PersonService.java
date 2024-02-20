package es.ieslavereda.springbootexample.service;

import es.ieslavereda.springbootexample.model.Person;
import es.ieslavereda.springbootexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void create(Person person){
        personRepository.save(person);
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }

    public void updatePerson(Person person) {
        personRepository.save(person);
    }
}
