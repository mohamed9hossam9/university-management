package org.example.dao;

import org.example.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassStudentDAO {
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void createStudent(Student student) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(Student student) {
        List<Student> students = getAllStudents();
        students.removeIf(s -> s.getIdNumber()==student.getIdNumber());
        saveAllStudents(students);
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                Student student = (Student) ois.readObject();
                students.add(student);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public void updateStudent(Student updatedStudent) {
        List<Student> students = getAllStudents();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getIdNumber()==updatedStudent.getIdNumber()) {
                students.set(i, updatedStudent);
                break;
            }
        }
        saveAllStudents(students);
    }

    private void saveAllStudents(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (Student student : students) {
                oos.writeObject(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}