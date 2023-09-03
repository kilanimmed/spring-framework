package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // this is my configuration class where I can get directions to look for a bean
@ComponentScan //after Spring created a container,and after giving Spring our configuration class which ConfigCourse,
public class ConfigCourse { // then Spring will come to the package and start scanning
}
