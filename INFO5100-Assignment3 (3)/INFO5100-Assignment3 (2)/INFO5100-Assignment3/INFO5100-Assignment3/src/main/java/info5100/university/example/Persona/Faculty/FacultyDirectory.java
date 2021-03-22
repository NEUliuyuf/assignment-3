/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {

    Department department;
    ArrayList<FacultyProfile> teacherlist;

    public FacultyDirectory(Department d) {

        department = d;
        teacherlist = new ArrayList();

    }

    public FacultyProfile newFaculty(Person p) {

        FacultyProfile fp = new FacultyProfile(p);
        teacherlist.add(fp);
        return fp;
    }

    public void removeFacultyByName(String name){
        for(int i=0;i<teacherlist.size();i++){
            if(teacherlist.get(i).getPerson().getName().equals(name)){
                teacherlist.remove(i);
            }
        }
    }
    
    public FacultyProfile findTeachingFaculty(int id) {

        for (FacultyProfile sp : teacherlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public FacultyProfile findFacultyByName(String name) {

        for (FacultyProfile fp : teacherlist) {

            if (fp.getPerson().getName().equals(name)) {
                return fp;
            }
        }
            return null; //not found after going through the whole list
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<FacultyProfile> getTeacherlist() {
        return teacherlist;
    }

    public void setTeacherlist(ArrayList<FacultyProfile> teacherlist) {
        this.teacherlist = teacherlist;
    }
    
}
