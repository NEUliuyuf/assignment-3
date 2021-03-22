/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.Persona.StudentProfile;
import java.util.Comparator;
import java.util.HashMap;

/**
 *
 * @author HYR
 */
public class UserMapComparator implements Comparator<StudentProfile>{
    HashMap<Integer,Integer>userPostMap;
    
    public UserMapComparator(HashMap<Integer, Integer> userPostMap) {
        this.userPostMap = userPostMap;
    }
    
    @Override
    public int compare(StudentProfile sp1, StudentProfile sp2) {
        return Integer.compare(
                ((userPostMap.get(sp1.getPerson().getId()) == null) ? 0 : userPostMap.get(sp1.getPerson().getId())),
                ((userPostMap.get(sp2.getPerson().getId()) == null) ? 0 : userPostMap.get(sp2.getPerson().getId()))
                );
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
