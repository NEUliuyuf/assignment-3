/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentProfile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HYR
 */
public class DataStore {
    

    private Map<Integer,StudentProfile> students; 
    private Map<Integer, FacultyProfile> facultys;
    
    
    private DataStore(){
        students = new HashMap<>();
        facultys = new HashMap<>();
        
    }
    
    public Map<Integer, StudentProfile> getStudents() {
        return students;
    }

    public void setStudents(Map<Integer, StudentProfile> students) {
        this.students = students;
    }

    public Map<Integer, FacultyProfile> getFacultys() {
        return facultys;
    }

    public void setFacultys(Map<Integer, FacultyProfile> facultys) {
        this.facultys = facultys;
    }
    
}
