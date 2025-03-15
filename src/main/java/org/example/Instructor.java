package org.example;

public class Instructor extends Person {
    private String instructorId;
    private String department;

    public Instructor(String firstName, String lastName, int age, String instructorId, String department) {
        super(firstName, lastName, age);
        this.instructorId = instructorId;
        this.department = department;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + department);
    }
}
