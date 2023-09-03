package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        //Create a Comment
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        //Create a container to manage beans
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //My goal is to publish comment then save in DB plus send an email or notification, also to run the application
        //I need an object which commentService
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}
