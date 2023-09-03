package com.cydeo.model;

import lombok.Data;

@Data
public class Comment {  //Creating a POJO class that needs to interact with DB

    private String author;
    private  String text;
}
//POJOs class no @Component annotation keep in mind that