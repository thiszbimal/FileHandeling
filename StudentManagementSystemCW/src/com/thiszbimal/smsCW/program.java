/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.smsCW;

import com.thiszbimal.smsCW.Entity.Student;
import com.thiszbimal.smsCW.IFF.IFF;
import com.thiszbimal.smsCW.UI.StudentUI;
import com.thiszbimal.smsCW.service.StudentService;
import com.thiszbimal.smsCW.serviceImpl.StudentServiceImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> student = new ArrayList<Student>();
        StudentService studentService= new StudentServiceImpl(new ArrayList<>());
        StudentUI studentUI = new StudentUI(input, studentService);
        IFF iff = new IFF(input, student);
        
        while(true){
            //Scanner input = new Scanner(System.in);
            //StudentService studentService= new StudentServiceImpl(new Vector<>());
            System.out.println("Welcome to Student Management System");
            System.out.println("====================================");
            System.out.println("1. Add Student record");
            System.out.println("2. Delete student Record");
            System.out.println("3. Get student Record By id");
            System.out.println("4. Show all student List");
            System.out.println("5. Import from file");
            System.out.println("6. Export to CSV");
            System.out.println("7. Export to Duplicate");
            System.out.println("What do you want to do?? (1-7)");
            
            
            switch(input.nextInt()){
                case 1:
                    studentUI.addScreen();
                    break;
                case 2:
                    studentUI.deleteStudent();
                    break;
                case 3:
                    studentUI.searchByIDScreen();
                    break;
                case 4:
                    studentUI.showAllScreen();
                    iff.iff(input, student);
                    break;
                case 5:
                    iff.iff(input, student);
                    
                    break;
                case 6:
                    break;
                case 7:
                    break;
                    
            }
        }
    }
    
}
