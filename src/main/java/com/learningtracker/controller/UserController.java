package com.learningtracker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningtracker.repository.UserRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.learningtracker.model.User;

// import com.learningtracker.repository.UserRepository;
@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    @PostMapping
    public User createUser(User user) {
        return userRepository.save(user);
    }

}
