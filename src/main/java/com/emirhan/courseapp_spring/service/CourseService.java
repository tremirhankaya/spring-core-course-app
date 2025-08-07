package com.emirhan.courseapp_spring.service;

import com.emirhan.courseapp_spring.model.Course;
import com.emirhan.courseapp_spring.model.Instructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
public class CourseService {
    private final Instructor instructor;

    public CourseService(@Qualifier("javaInstructor") Instructor instructor) {
        this.instructor = instructor;
    }
    public String getCourse() {
        return instructor.getTeachingTopic();
    }
}
