package org.example.guilhermezuriel.userdpt.controllers;


import org.example.guilhermezuriel.userdpt.entities.User;
import org.example.guilhermezuriel.userdpt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/all")
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = repository.findById(id).get();
        return user;
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }

}
