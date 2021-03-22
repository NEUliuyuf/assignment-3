/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Transcript {
    
    ArrayList<CourseLoad> allCourses;
    
    
    public Transcript(){
        allCourses = new ArrayList();
        
    }

 
    
    public void newCourseLoad(CourseLoad cl){
        allCourses.add(cl);
    }
    
    
    
    public void removeCourseLoad(CourseLoad courseLoad,String semester){
        for(int i=0; i<allCourses.size();i++){
            if(allCourses.get(i).getSemester().equals(semester)){
                if(allCourses.get(i).equals(courseLoad)){
                    allCourses.remove(i);
                }
            }
            
        }
    }
    
    public ArrayList<CourseLoad> getCourseLoadBySemester(String semester){
        ArrayList<CourseLoad> clList = new ArrayList();
        for(CourseLoad cl : allCourses){
            if(cl.getSemester().equals(semester)){
                clList.add(cl);
            }
        }
        return clList;
    }
  
    
    
    
        
    public double caculateGPA(){
        double gpa = 0;
        int credit;
        int i;
        for(i = 0;i<this.allCourses.size();i++){            
                credit = this.allCourses.get(i).getSeat().getCourseoffer().getCourse().getCredits();
                gpa += this.allCourses.get(i).getSeat().getGrade()/credit;
        }
        return gpa;
    }
    

    public ArrayList<CourseLoad> getAllCourses() {
        return allCourses;
    }

    public void setAllCourses(ArrayList<CourseLoad> allCourses) {
        this.allCourses = allCourses;
    }
}
