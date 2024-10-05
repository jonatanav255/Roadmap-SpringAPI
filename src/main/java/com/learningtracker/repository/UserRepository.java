package com.learningtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningtracker.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
