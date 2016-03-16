/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.smsCW.DAOImpl;

import com.thiszbimal.smsCW.Entity.Student;
import com.thiszbimal.smsCW.StudentDAO.StudentDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class StudentDAOImpl implements StudentDAO{
    private List<Student> studentList;
    
    public StudentDAOImpl (List<Student> studentList){
        this.studentList=studentList;
    }

    
        

    @Override
    public void insert(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean delete(int id) {
     for(Student s: studentList){
         if(s.getId()==id){
             studentList.remove(s);
             return true;
         }
     }
     return false;
    }

    @Override
    public Student getByID(int id) {
        for(Student s: studentList){
            if(s.getId()==id){
               return s; 
            }
        }
        return null;
    }

    @Override
    public List<Student> showAll() {
       return studentList;
    }

    @Override
    public void importFromFile(Scanner scanner) {
        
    }

    @Override
    public void exportToCSV(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exportToDuplicate(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
