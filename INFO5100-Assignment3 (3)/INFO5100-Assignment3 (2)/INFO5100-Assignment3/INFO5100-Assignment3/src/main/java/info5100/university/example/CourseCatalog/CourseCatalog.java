/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseCatalog {
    Department department;
    String lastupdated;
    ArrayList<Course> courselist; 
    public CourseCatalog(Department d){
        courselist = new ArrayList();
        department = d;
    }
    
    public ArrayList<Course> getCourseList(){
        return courselist;
    }
    
    public void addCourse(Course c){
        courselist.add(c);
    }
    
    public Course getCourseByNumber(String n){
        
        for( Course c: courselist){
            
            if(c.getCOurseNumber().equals(n)) return c;
        }
        return null;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

    public ArrayList<Course> getCourselist() {
        return courselist;
    }

    public void setCourselist(ArrayList<Course> courselist) {
        this.courselist = courselist;
    }
    public void removeCourseByName(String n) {
        for(int i=0;i<courselist.size();i++){
            if(courselist.get(i).getName().equals(n)){
                courselist.remove(i);
            }
        }
    }
    
}