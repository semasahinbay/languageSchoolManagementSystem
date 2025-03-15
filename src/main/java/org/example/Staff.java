package org.example;

public class Staff extends Person {
    private String staffId;
    private String role;

    public Staff(String firstName, String lastName, int age, String staffId, String role) {
        super(firstName, lastName, age);
        this.staffId = staffId;
        this.role = role;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void displayInfo() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Role: " + role);
    }
}
