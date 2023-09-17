package com.cydeo.controller;


import com.cydeo.boostrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  //we want to create a bean
@RequestMapping("/student") // class level:
public class StudentController {

    //    @RequestMapping(value = "/register",method = RequestMethod.GET)
    @GetMapping("/register")
    public String register(Model model){ // we need some Data by using Model interface. Data binding

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register"; //whenever I call this endpoint localhost:8080/student/register, return the view register.html
        //which is inside templates/student folder which contain register.html
    }

    //    @RequestMapping("/welcome")
    @GetMapping("/welcome")
    public String info(){

        return "student/welcome";
    }
}