package com.thiszbimal.smsCW.IFF;


import com.thiszbimal.smsCW.Entity.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IFF {
//    
        private Scanner scanner;
        private List<Student> student;
////
        public IFF(Scanner scanner, List<Student> student) {
            this.scanner = scanner;
            this.student = student;
        }
    
    
    
    public  List<Student> iff(Scanner scanner, List<Student> studentList){ //esari list pass garna milchha???
    
        
        String line = "";
        List<Student> toAddLaterList = new ArrayList<>();
        List<Student> readList = new ArrayList<>();
        
        System.out.println("Enter the file name from ehere you want to import: ");
        String pathName = scanner.next();
        
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(pathName)));
            while ((line = br.readLine()) != null){
                
                Student s = new Student();
                
                StringTokenizer tokens = new StringTokenizer(line, ",");
                s.setId(Integer.parseInt(tokens.nextToken()));
                s.setFirsrName(tokens.nextToken());
                s.setLastName(tokens.nextToken());
                s.setEmail(tokens.nextToken());
                s.setContactNo(tokens.nextToken());
                s.setStatus(Boolean.parseBoolean(tokens.nextToken()));

                readList.add(s);
                          
            }
            
            br.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("The imported students from file are:");
        System.out.println(readList.toString());
        readList.forEach(s->{
        student.add(s);
        });
        
//        readList.forEach(st->{ 
//            
//            
//            if(studentList.isEmpty()){
//                toAddLaterList.add(st);
////                System.out.println(st.toString());
//            }
//            
//            else{
//            
//                readList.forEach(stu->{
//                
//                    if(!st.geteMail().equalsIgnoreCase(stu.geteMail())){
//
//                        toAddLaterList.add(st);
//                        System.out.println(st.toString());
//
//                    }
//
//                });
//            }    
//        });
        
        
        
        return studentList;
    }
    
//    public void displayScreen(){
//        System.out.println();
 //   }
}
