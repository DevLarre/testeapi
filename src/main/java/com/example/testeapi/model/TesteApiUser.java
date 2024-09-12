package com.example.testeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "apiTestConsumo")
public class TesteApiUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gender;
    private String name;
    private String city;
    private String state;
    private String country;
    private String email;
    private String username;
    private String dateOfBirth;
    private int age;
    private int ageRegistred;
    private String cell;
    private String picturePerson;
}
