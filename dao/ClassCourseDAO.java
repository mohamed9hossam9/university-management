package org.example.dao;

import org.example.model.Course;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ClassCourseDAO {
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void createCourse(Course course) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
            oos.writeObject(course);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deleteCourse(Course course) {
        List<Course> courses = getAllCourses();
        courses.removeIf(s -> s.getCourseName() == course.getCourseName());
        saveAllCourses(courses);
    }

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                Course course = (Course) ois.readObject();
                courses.add(course);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }



    public void updateCourse(Course updatedCourse) {
        List<Course> courses = getAllCourses();
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseName() == updatedCourse.getCourseName()) {
                courses.set(i, updatedCourse);
                break;
            }
        }
        saveAllCourses(courses);
    }
    private void saveAllCourses(List<Course> courses) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (Course course : courses) {
                oos.writeObject(course);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
