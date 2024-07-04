package org.example.dao;

public interface DepartmentDAO {
    void createDepartment(String department);
    void deleteDepartment(String department);
    void updateDepartment(String department);
    void getAllDepartments ();
    void saveAllDepartments();
}
