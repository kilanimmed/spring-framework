package com.cydeo.stereotype_annotation;

import org.springframework.stereotype.Component;

@Component //add this annotation for every class that needs an object created to be managed by Spring Container
public class Agile {
    public void getTeachingHours(){

        System.out.println("Total teaching hours : 15");
    }
}
