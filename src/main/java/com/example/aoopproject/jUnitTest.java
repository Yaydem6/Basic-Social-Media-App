package com.example.aoopproject;

import Classes.Post;
import Classes.PrivateUser;
import Classes.UserServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class jUnitTest {

    @Test
    public void test1(){

        PrivateUser user = new PrivateUser("ali", "veli", "alii", "123");
        user.addFriend("Mehmet");
        assertTrue(user.getFriends().contains("Mehmet"));
    }

    @Test
    public void test2(){
        PrivateUser user = new PrivateUser("ali", "veli", "alii", "123");

        Post post = new Post(user, "Merhaba");

        assertEquals(post.publisher.getUserName(), user.getUserName());
    }

    @Test
    public void test3(){
        UserServiceImpl usp = new UserServiceImpl();

        usp.addUser("mhmt");

        assertTrue(usp.isUsernameTaken("mhmt"));
    }
}
