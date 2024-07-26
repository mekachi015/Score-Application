package com.example.Score.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName; //stores the first name of the player

    private String lastName; // stores the last name of the player

    private String dateOfBirth; //stores the birthdate of the player

    private Integer shirtNumber; //stores the shirt number of the player

    private String position; //stores the position in which this player plays

}
