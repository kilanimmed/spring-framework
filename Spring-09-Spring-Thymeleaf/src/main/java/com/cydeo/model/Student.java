package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student { //POJO data

    private String firstName;
    private String lastName;
    private int age;
    private String state;
}