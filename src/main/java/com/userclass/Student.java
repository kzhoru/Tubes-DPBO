/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.userclass;

/**
 *
 * @author ASUS
 */
public class Student extends User{
    private String studentID;

    public Student(String studentID, String nama) {
        super(nama);
        this.studentID = studentID;
    }
}