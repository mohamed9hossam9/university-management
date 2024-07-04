package org.example.dao;
import org.example.model.Student;

import java.util.List;
public interface StudentDAO {

        void setFileName(String fileName);
        void createStudent(Student student);
        void deleteStudent(Student student);
        void updateStudent(Student updatedStudent);

        static List<Student> getAllStudents() {
                return null;
        }


}
