/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.smsCW.StudentDAO;

import com.thiszbimal.smsCW.Entity.Student;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public interface StudentDAO {
    void insert(Student student);
    boolean delete(int id);
    Student getByID(int id);
    List<Student> showAll();
    void importFromFile(Scanner scanner);
    void exportToCSV(Scanner scanner);
    void exportToDuplicate(Scanner scanner);
    

    
}
