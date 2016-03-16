/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.smsCW.Entity;

/**
 *
 * @author admin
 */
public class Student {
    private int Id;
    private String firsrName,lastName,email,contactNo;
    private boolean status;

    public Student() {
    }

    public Student(int Id, String firsrName, String lastName, String email, String contactNo, boolean status) {
        this.Id = Id;
        this.firsrName = firsrName;
        this.lastName = lastName;
        this.email = email;
        this.contactNo = contactNo;
        this.status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFirsrName() {
        return firsrName;
    }

    public void setFirsrName(String firsrName) {
        this.firsrName = firsrName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", firsrName=" + firsrName + ", lastName=" + lastName + ", email=" + email + ", contactNo=" + contactNo + ", status=" + status + '}';
    }
    
    
//   public String toCSV(){
//       return Id + ","
//   } 
//    
    
}
