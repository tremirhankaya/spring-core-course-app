package com.emirhan.courseapp_spring.instructor;

import com.emirhan.courseapp_spring.model.Instructor;
import org.springframework.stereotype.Component;

@Component
public class JavaInstructor implements Instructor {
    @Override
    public String getTeachingTopic() {
        return "Java Backend Developer";
    }
}
