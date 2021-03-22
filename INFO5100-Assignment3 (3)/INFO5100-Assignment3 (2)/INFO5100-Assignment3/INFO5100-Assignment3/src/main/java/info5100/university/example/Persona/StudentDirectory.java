/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import info5100.university.example.Department.Department;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {

    Department department;
    ArrayList<StudentProfile> studentlist;
    double[] GPAList;
    double[] promotionsList;

    public StudentDirectory(Department department){
        this.department = department;
        this.studentlist = new ArrayList();
        this.GPAList = new double[0];
        this.promotionsList = new double[0];
        
        
    }
    public void updatePL(){
        this.promotionsList = new double[0];
        for(StudentProfile sp:department.getstudentDirectory().getStudentlist()){
            addPromotion(sp.getEmploymenthistory().getPromotionTimes());
        }
    }
    public double[] getGPAList() {
        return GPAList;
    }

    public void setGPAList(double[] GPAList) {
        this.GPAList = GPAList;
    }

    public void addPromotion(double promotion){
        this.promotionsList = Arrays.copyOf(this.promotionsList, this.promotionsList.length+1);
        this.promotionsList[this.promotionsList.length-1] = promotion;
    }
    
    public double[] getPromotionslist() {
        return promotionsList;
    }

    public void setPromotionslist(double[] promotionslist) {
        this.promotionsList = promotionslist;
    }
    
    public StudentProfile newStudentProfile(Person p) {
        
        StudentProfile sp = new StudentProfile(p,department);
        studentlist.add(sp);
        this.GPAList = Arrays.copyOf(this.GPAList, this.GPAList.length + 1);
        this.GPAList[this.GPAList.length-1] = sp.GPA;
        return sp;
    }
    

    public StudentProfile findStudent(int id) {

        for (StudentProfile sp : studentlist) {

            if (sp.person.id == id) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public void removeStudentByName(String n) {
        for(int i=0;i< studentlist.size();i++){
            if(studentlist.get(i).getPerson().getName().equals(n)){
                studentlist.remove(i);
            }
        }
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<StudentProfile> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<StudentProfile> studentlist) {
        this.studentlist = studentlist;
    }
    
    public static double covariance(double[] v1, double[] v2) {
        if (v1.length != v2.length){
            throw new IllegalArgumentException("Arrays must have the same length : " + v1.length+ ", " + v2.length);
        }
        final double m1 = mean(v1);
        final double m2 = mean(v2);
        double ans = 0.0;
        for (int i = 0; i < v1.length; i++){
            ans += (v1[i] - m1) * (v2[i] - m2);
        }
        return ans / (v1.length - 1);

    }
    public static double sum(double[] v) {
        double sum = 0.0;
        for (int k = 0; k < v.length; k++) {
            sum += v[k];
        }
        return (sum);
    }
    public static double mean(double[] v) {
        if (v.length == 0){
            throw new IllegalArgumentException("Nothing to compute! The array must have at least one element.");
        }
        return (sum(v) / (double) v.length);
    }
    
    public static double variance(double[] v) {
        if (v.length > 1) {
            final double m = mean(v);
            double ans = 0.0;
            for (int i = 0; i < v.length; i++){
                ans += (v[i] - m) * (v[i] - m);
            }
            return ans / (v.length - 1);
        } else{
            throw new IllegalArgumentException("Array length must be of 2 or greater.");
        }

    }


    public double correlation() {
         updatePL();
        double denom = Math.sqrt(variance(this.GPAList) * variance(promotionsList));

        if (denom != 0){
            return (covariance(this.GPAList, promotionsList) / denom);
        }
        else{
            if ((variance(this.GPAList) == 0) && (variance(promotionsList) == 0)){
                return (1.0);
            }

            else{
                return (0.0); 
            }
        }
    }
    
}
