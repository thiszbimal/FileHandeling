/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.smsCW.serviceImpl;

import com.thiszbimal.smsCW.DAOImpl.StudentDAOImpl;
import com.thiszbimal.smsCW.Entity.Student;
import com.thiszbimal.smsCW.StudentDAO.StudentDAO;
import com.thiszbimal.smsCW.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class StudentServiceImpl implements StudentService{
    
    private StudentDAO studentDAO; 

    public StudentServiceImpl(List<Student> student) {
     studentDAO= new StudentDAOImpl(student);
    }
    

    
    
    
    @Override
    public void add(Student student) {
        studentDAO.insert(student);
        
    }

    @Override
    public boolean delete(int id) {
        return studentDAO.delete(id);
    }

    @Override
    public Student getById(int id) {
        return studentDAO.getByID(id);
    }

    @Override
    public List<Student> showAll() {
        return studentDAO.showAll();
    }

    @Override
    public void importFromFile(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exportToCsv(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exportDuplicate(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
