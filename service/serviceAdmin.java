package org.example.service;
import org.example.dao.StudentDAO;
import org.example.model.Student;
import java.util.ArrayList;
public class serviceAdmin  {
    void findStudent(int Id){
        ArrayList<Student> students= (ArrayList<Student>) StudentDAO.getAllStudents();

    }
    void findStudent(String Name){


    }
}
