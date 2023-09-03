package com.cydeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {

    //
   // @Autowired // Field injection deprecated
    //OfficeHours officeHours;  //Java has a dependency with OfficeHours class

    //Constructor Injection
    OfficeHours officeHours;

    @Autowired // we are trying to inject OfficeHours bean into Java class
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours(){

        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}
