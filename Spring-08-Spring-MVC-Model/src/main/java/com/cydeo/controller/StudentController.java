package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){

        //my goal here is to be able to call Model's methods, I need to pass Model as parameter
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");


        return "student/welcome"; //no need to add .html bcs this is a Thymeleaf template
    }
}
