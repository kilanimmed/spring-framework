package com.cydeo.proxy;

import com.cydeo.model.Comment;

public interface CommentNotificationProxy { // we need this interface because it will have different implementation
    // since we will be sending emails or sometimes notifications it depends : different impl
    void sendComment(Comment comment);
}
//Interfaces class no @Component annotation keep in mind that, no instances are created from Interfaces