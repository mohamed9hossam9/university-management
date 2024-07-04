package org.example.model;

import java.util.*;

public class Department {
    String departmentName;
    String departmentCode;
    public List<Course> coursesOffered = new ArrayList<>();
    public Set<Professor> departmentProfessors = new HashSet<>();

    public Department(String departmentName, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;

    }

    public static void departmentAndCourses() {
        System.out.println("if you want to add a new course press 1 and if you don't press 0");
        int addCourse = 0;
//
//            if (addCourse ) {
//                coursesOffered.add(new Course(departmentName, departmentCode));
//            }
        Scanner scanner = new Scanner(System.in);
        addCourse = scanner.nextInt();





    }


}
