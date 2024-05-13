package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
    private String name;

    private String email;
    private int rollNo;
    private  Address address;

//    public String getName() {
//        return name;
//    }
//    public  Student(){}
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//

    public Student(String name, String email, int rollNo, Address address) {
        this.name = name;
        this.email = email;
        this.rollNo = rollNo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNo=" + rollNo +
                ", address=" + address +
                '}';
    }
}
