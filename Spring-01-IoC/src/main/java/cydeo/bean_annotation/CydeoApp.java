package cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        // I have already created my POJO classes FullTime and PartTimeMentor
        // then I need to create Spring Container
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);// make sure you add spring-context dependency
        // we need configuration file to let Spring know which beans to manage @ Bean, then Spring will save Beans in container
        // How can will I be able to access createAccount() in FullTimeMentor? by creating object or beans

        FullTimeMentor ft = container.getBean(FullTimeMentor.class); // ft is a bean from Spring container

        PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);

        ft.createAccount();
        pt.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);


    }
}
