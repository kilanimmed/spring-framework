package cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    @Bean()
    FullTimeMentor fullTimeMentor(){ // create a method that returns new instance
        return  new FullTimeMentor();
    }

   // @Bean(name = "p1")
    @Bean
    @Primary       //Even we have 2 partTime beans, Spring will choose the one with annotation @Primary as a default option
    PartTimeMentor partTimeMentor(){
        return  new PartTimeMentor();
    }
    //@Bean(name = "p2")
    @Bean
    PartTimeMentor partTimeMentor2(){
        return  new PartTimeMentor();
    }
}
