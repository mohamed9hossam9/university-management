package org.example.dao;

import org.example.model.Course;

import java.util.List;

public interface CourseDAO {
    void setFileName(String fileName);
    void createCourse(Course Course);
    void deleteCourse(Course Course);
    void updateCourse(Course updatedCourse);
    List<Course> getAllCourses ();

}
