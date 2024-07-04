package org.example.model;

import java.util.ArrayList;
public class Course {
    String courseName;
    String courseCode;
    ArrayList<Professor> profsOfCourse = new ArrayList<>();
   public ArrayList<Student> studentsEnrolled = new ArrayList<>();
    ArrayList<Course> basicCourses = new ArrayList<>();
    int startTime=0;
    int endTime=0;
   public Course (String courseName, String courseCode, ArrayList<Course> basicCourses,ArrayList<Professor> profsOfCourse) {
       this.courseName = courseName;
       this.courseCode = courseCode;
       this.basicCourses = basicCourses;
       this.profsOfCourse = profsOfCourse;



   }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public ArrayList<Professor> getProfsOfCourse() {
        return profsOfCourse;
    }

    public void setProfsOfCourse(ArrayList<Professor> profsOfCourse) {
        this.profsOfCourse = profsOfCourse;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public ArrayList<Course> getBasicCourses() {
        return basicCourses;
    }

    public void setBasicCourses(ArrayList<Course> basicCourses) {
        this.basicCourses = basicCourses;
    }
}
