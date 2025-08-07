package com.emirhan.courseapp_spring.controller;

import com.emirhan.courseapp_spring.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private CourseService courseService;
    public CourseController(CourseService courseService) {
        this.courseService = courseService;

    }

    @GetMapping("/courses")
    public String getCourse() {
        return courseService.getCourse();
    }
}
