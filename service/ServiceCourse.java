package org.example.service;

import org.example.model.Course;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceCourse {
    private Course course;

    public ServiceCourse(Course course) {
        this.course = course;
    }

    boolean addStudent(Student student) {
        boolean checkRegistration = false;
        for (var item : course.studentsEnrolled) {
            if (item.equals(student)) {
                System.out.println("you're already registered");
                checkRegistration = true;
                break;
            }
        }

        // if(!(checkRegistration)){ course.studentsEnrolled.add(student);System.out.println("registered");checkRegistration

    return true;
    }

    void addCourse() {
        Scanner scanner = new Scanner(System.in);
        String courseName = scanner.nextLine();
        String courseCode = scanner.nextLine();
        List<Course> basicCourses = new ArrayList<>();

//         course = new Course(courseName,courseCode,basicCourses,profsOfCourse);

        System.out.println("select which department the course" + courseName + "belongs to ");
        String departmentName = scanner.next();


    }

    boolean checkCourse(String courseName) {
        ArrayList<Course> courses = new ArrayList<>();
//        courses = getAllCourses();
    return true;
    }
//    int departmentNumber (String departmentName){
//        if (departmentName.equals )
//
//    }

}
