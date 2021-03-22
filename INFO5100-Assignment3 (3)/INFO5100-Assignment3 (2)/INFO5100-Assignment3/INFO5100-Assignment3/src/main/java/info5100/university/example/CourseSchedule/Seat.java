/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Seat {
    
    Boolean occupied; 
    int number;
    CourseOffer courseoffer;
    double GPA = 0;
    StudentProfile student;
    
    public void assignStudent(StudentProfile sp){
        student= sp;
    }
    public double getGrade() {
        return GPA;
    }

    public void setGrade(double GPA) {
        this.GPA = GPA;
    }
    
    
    public Seat (CourseOffer co, int n){
        courseoffer = co;
        number = n;
        occupied = false;
        
    }
    
    public Boolean isOccupied(){
        return occupied;

    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }

    public void setCourseoffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }
    
    
}
