package com.capstone.realestate.controllers;

import com.capstone.realestate.models.User;
import com.capstone.realestate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/allusers")
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/usersignin")
    public User getUser(@RequestParam String username, @RequestParam String password) {
        return repository.findUser(username, password);
    }

    @PostMapping("/users")
    public String saveUser(@RequestBody User user) {
        repository.save(user);
        return "Added user with id : " + user.getId();
    }

}
