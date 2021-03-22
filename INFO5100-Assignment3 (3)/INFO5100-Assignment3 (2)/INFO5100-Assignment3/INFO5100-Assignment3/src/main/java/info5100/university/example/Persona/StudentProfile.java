/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistory;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile{
    
    Person person;
    Transcript transcript;
    Random random = new Random();
    double GPA = random.nextDouble() + random.nextInt(5) + 0.1;
    EmploymentHistory employmenthistory;
    Department department;
    ArrayList<CourseOffer> relevent;
    double score = 0;

    public StudentProfile(Person p, Department department) {
        this.person = p;
        transcript = new Transcript();
        employmenthistory = new EmploymentHistory();
        this.department = department;
        relevent = new ArrayList();
    }

    public ArrayList<CourseOffer> getRelevent() {
        return relevent;
    }

    public void setRelevent(ArrayList<CourseOffer> relevent) {
        this.relevent = relevent;
    }

    
    public boolean isMatch(int id) {
        if (person.getId() == id) {
            return true;
        }
        return false;
    }

    public ArrayList<CourseLoad> getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public EmploymentHistory getEmploymenthistory() {
        return employmenthistory;
    }

    public void setEmploymenthistory(EmploymentHistory employmenthistory) {
        this.employmenthistory = employmenthistory;
    }
    
    
    public double getGPA(){
        return this.transcript.caculateGPA();
    }
    

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    
    
    @Override
    public String toString(){
        return String.valueOf(person.getId());
    }
    
    
    
}
