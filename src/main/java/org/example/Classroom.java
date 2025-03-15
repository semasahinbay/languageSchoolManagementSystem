package org.example;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String roomNumber;
    private int capacity;
    private List<Instructor> instructors;

    public Classroom(String roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.instructors = new ArrayList<>();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void displayClassroomInfo() {
        System.out.println("Classroom: " + roomNumber + " | Capacity: " + capacity);
        System.out.println("Instructors:");
        for (Instructor instructor : instructors) {
            System.out.println("- " + instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}

