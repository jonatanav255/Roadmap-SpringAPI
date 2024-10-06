package com.learningtracker.learning_roadmap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningtracker.learning_roadmap.model.Category;
import com.learningtracker.learning_roadmap.model.User;

public interface CategoryRepository extends JpaRepository<User, Integer> {

    List<Category> findUserById(int userId);
}
