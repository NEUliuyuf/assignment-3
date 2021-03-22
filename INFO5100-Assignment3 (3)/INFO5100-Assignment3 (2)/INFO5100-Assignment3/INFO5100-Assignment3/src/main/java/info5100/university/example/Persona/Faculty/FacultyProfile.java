/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.CourseSchedule.CourseOffer;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kal bugrara
 */
public class FacultyProfile {

    Person person;
    ArrayList <FacultyAssignment> facultyassignments; 
    double[] score;
    double averageScore;
    
    

    public FacultyProfile(Person p) {

        person = p;
        facultyassignments = new ArrayList();
        score = new double[0];
        
    }
    
    public void addScore(double score){
        this.score = Arrays.copyOf(this.score, this.score.length+1);
        this.score[this.score.length-1] = score;
    }
    
    public double getAverageScore(){
        double result = 0;
        for(double s:score){
            result += s;
        }
        averageScore = result/score.length;
        return averageScore;
    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        
        return fa;
    }
    
    public FacultyProfile getCourseOffer(String courseid){
        return null; //complete it later
    }

    public boolean isMatch(int id) {
        if (person.getId()==id) {
            return true;
        }
       return false;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<FacultyAssignment> getFacultyassignments() {
        return facultyassignments;
    }

    public void setFacultyassignments(ArrayList<FacultyAssignment> facultyassignments) {
        this.facultyassignments = facultyassignments;
    }
    
    @Override
    public String toString(){
        return String.valueOf(person.getId());
    }
      
}
