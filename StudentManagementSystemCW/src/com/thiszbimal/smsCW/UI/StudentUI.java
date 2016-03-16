/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.smsCW.UI;

import com.thiszbimal.smsCW.Entity.Student;
import com.thiszbimal.smsCW.service.StudentService;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class StudentUI {
    private Scanner input;
    public StudentService studentService;

    public StudentUI(Scanner input, StudentService studentService) {
        this.input = input;
        this.studentService = studentService;
    }
    
        
    public void addScreen(){
     while(true) {
                Student student = new Student();
                System.out.println("Enter Id:");
                student.setId(input.nextInt());
                System.out.println("Enter First Name:");
                student.setFirsrName(input.next());
                System.out.println("Enter Last Name:");
                student.setLastName(input.next());
                System.out.println("Enter Contact No:");
                student.setContactNo(input.next());
                
                System.out.println("Enter Email:");
                student.setEmail(input.next());
                
                System.out.println("Enter Status:");
                student.setStatus(input.nextBoolean());

                studentService.add(student);

                System.out.println("Do you want to continue??(Y/N)");
                if(input.next().equalsIgnoreCase("n")){

                break;
                }
     }
    }
    public void showAllScreen(){
        System.out.println("Printing all Students:");
        System.out.println("======================");
        studentService.showAll().forEach(s->{
        System.out.println(s.toString());
        });
    }
    
    public void deleteStudent(){
        System.out.println("Enter id of a student that you want to delete:");
        studentService.delete(input.nextInt());
    }
    public void searchByIDScreen(){
        System.out.println("Enter id of student you want to search");
        
        System.out.println(studentService.getById(input.nextInt()).toString());
        
    }
}
