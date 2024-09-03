package com.example.springuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springuser.entity.User;
import com.example.springuser.service.UserService;

@RestController
public class UserController {
//The UserService instance is injected into the controller constructor injection
    private final UserService userService;
//The @Autowired annotation ensures that Spring automatically provides an 
    //instance of UserService when the UserController is created.
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //This annotation maps HTTP POST requests to the /addUser endpoint.
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    //This annotation maps HTTP GET requests to the /getUsers endpoint.
    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userService.getUser();
        
        
        
    }
}