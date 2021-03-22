/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;



import info5100.university.example.Department.Department;
import info5100.university.example.Department.DepartmentCatalog;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author HYR
 */
public class College {
    String collegeName;
    DepartmentCatalog departmentCatalog;
    
    public College(String cn){
        collegeName = cn;
        departmentCatalog = new DepartmentCatalog();
    }

    public String getCollegename() {
        return collegeName;
    }

    public void setCollegename(String collegename) {
        this.collegeName = collegename;
    }

    public void addDepartment(Department d){
        departmentCatalog.addDepartment(d);
    }
    
    public Department getDepartment(String name){
        for(Department d : departmentCatalog.getDepartmentCatalog()){
            if (d.toString().equals(name)){
                return d;
            }
        }
        return null;
    }
    
    public StudentProfile getStudentByName(String name){
        for(Department department : departmentCatalog.getDepartmentCatalog()){
            for(StudentProfile sp : department.getstudentDirectory().getStudentlist()){
                if(sp.getPerson().getName().equals(name)){
                    return sp;
                }
            }
        }
        return null;
    }

    public DepartmentCatalog getDepartmentCatalog() {
        return departmentCatalog;
    }

    public void setDepartmentCatalog(DepartmentCatalog departmentCatalog) {
        this.departmentCatalog = departmentCatalog;
    }
    
 
}
