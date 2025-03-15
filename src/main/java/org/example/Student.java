package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private Department department;
    private List<Course> enrolledCourses;

    public Student(String firstName, String lastName, int age, String studentId, Department department) {
        super(firstName, lastName, age);
        this.studentId = studentId;
        this.department = department;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (department.getCourses().contains(course)) {
            enrolledCourses.add(course);
            System.out.println("Successfully enrolled in course: " + course.getCourseName());
        } else {
            System.out.println("Course not found in the department.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Enrolled Courses: ");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName() + " (" + course.getCourseCode() + ")");
        }
    }
}
