package com.learningtracker.learning_roadmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.learningtracker.learning_roadmap"})
public class LearningRoadmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningRoadmapApplication.class, args);
    }

}
