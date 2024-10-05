package com.learningtracker.learning_roadmap.repository;
// package com.learningtracker;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningtracker.learning_roadmap.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
