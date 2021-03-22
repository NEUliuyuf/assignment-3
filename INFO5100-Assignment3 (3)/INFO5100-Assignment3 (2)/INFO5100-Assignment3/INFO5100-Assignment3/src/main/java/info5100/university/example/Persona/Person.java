/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import java.util.Date;

/**
 *
 * @author kal bugrara
 */
public class Person {
    String name;
    int age;
    String dob;
    int id;
    
    public Person (String name, int age, String dob){
        this.name = name;
        this.age = age;
        this.dob = dob;
    }
    
    public boolean isMatch(int id){
        if(this.id == id) return true;
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
    
}
