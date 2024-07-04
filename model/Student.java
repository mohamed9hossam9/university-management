package org.example.model;

import java.util.ArrayList;
import java.io.Serializable;

public class Student  extends User implements Serializable {
    private Department department;
    float GPA;
    ArrayList<Course> coursesFinished = new ArrayList<>();
    ArrayList<Course> coursesEnrolled= new ArrayList<>();

    public Student(String name, int idNumber, int phoneNumber, String emailAddress, String password, Department department, float GPA, ArrayList<Course> coursesFinished) {
        super(name, idNumber, phoneNumber, emailAddress, password);
        this.department = department;
        this.GPA = GPA;
        this.coursesFinished = coursesFinished;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public ArrayList<Course> getCoursesFinished() {
        return coursesFinished;
    }

    public void setCoursesFinished(ArrayList<Course> coursesFinished) {
        this.coursesFinished = coursesFinished;
    }

    @Override
    public String toString() {
        return "Student{" +
                "department=" + department +
                ", GPA=" + GPA +
                ", coursesFinished=" + coursesFinished +
                ", coursesEnrolled=" + coursesEnrolled +
                ", name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber=" + phoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
