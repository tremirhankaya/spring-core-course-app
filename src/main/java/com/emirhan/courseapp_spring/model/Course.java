package com.emirhan.courseapp_spring.model;

public class Course {
    private String title;
    private String description;
    private String instructorName;

    public Course(String title, String description, String instructorName) {
        this.title = title;
        this.description = description;
        this.instructorName = instructorName;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getInstructorName() {
        return instructorName;
    }
}
