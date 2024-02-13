package es.ieslavereda.springbootexample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false,unique = true)
    private String username;
    @Basic
    private String name;
    private String surname;
    @Column(nullable = false,unique = true)
    private String email;

}
