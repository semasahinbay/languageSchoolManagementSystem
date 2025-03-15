package org.example;

public class Course {
    private String courseName;
    private String courseCode;
    private Instructor instructor;

    public Course(String courseName, String courseCode, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName + " | Course Code: " + courseCode);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
