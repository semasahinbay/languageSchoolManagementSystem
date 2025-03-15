package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department implements IDepartmentOperations {
    private String departmentName;
    private List<Course> courses;
    private List<Instructor> instructors;
    public List<Course> getCourses() {
        return courses;

    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.courses = new ArrayList<>();
        this.instructors = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + departmentName);
        System.out.println("Courses offered:");
        for (Course course : courses) {
            course.displayCourseInfo();  // Dersleri detaylı gösterir.
        }
        System.out.println("Instructors:");
        for (Instructor instructor : instructors) {
            System.out.println("- " + instructor.getFirstName() + " " + instructor.getLastName());
        }
    }

}
