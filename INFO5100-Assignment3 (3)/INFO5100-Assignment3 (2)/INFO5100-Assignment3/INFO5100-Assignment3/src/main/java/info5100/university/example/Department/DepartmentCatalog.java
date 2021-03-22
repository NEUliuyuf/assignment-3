/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import java.util.ArrayList;

/**
 *
 * @author HYR
 */
public class DepartmentCatalog {
    ArrayList<Department> departmentCatalog;

    public DepartmentCatalog() {
        departmentCatalog = new ArrayList();
    }

    public ArrayList<Department> getDepartmentCatalog() {
        return departmentCatalog;
    }

    public void setDepartmentCatalog(ArrayList<Department> departmentCatalog) {
        this.departmentCatalog = departmentCatalog;
    }
    public Department addDepartment(Department d) {
        departmentCatalog.add(d);
        return d;
    }
    public void removeDepartment(Department d) {
        departmentCatalog.remove(d);
    }
    public void removeDepartmentByName(String n) {
        for(int i=0;i<departmentCatalog.size();i++){
            if(departmentCatalog.get(i).getName().equals(n)){
                departmentCatalog.remove(i);
            }
        }
    }
    
    public Department searchDepartment(String n) {

        for(Department d : departmentCatalog) {
            if(d.getName().equals(n)) {
                return d;
            }
        }
        return null;
    }
    
    
    
}
