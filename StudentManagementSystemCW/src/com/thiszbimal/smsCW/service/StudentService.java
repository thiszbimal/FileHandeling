/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.smsCW.service;

import com.thiszbimal.smsCW.Entity.Student;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public interface StudentService {
    void add(Student student);
    boolean delete(int id);
    Student getById(int id);
    List<Student> showAll();
    void importFromFile(Scanner scanner);
    void exportToCsv(Scanner scanner);
    void exportDuplicate(Scanner scanner);
}
