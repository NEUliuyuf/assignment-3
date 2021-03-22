/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kal bugrara
 */
public class EmploymentHistory {
    Random random = new Random();
    ArrayList<Employment> employments;
    ArrayList<CourseOffer> relevantcourseoffers;
    double currentSalary = random.nextInt(50000)+60000;
    double startsalary = random.nextInt(50000)+10000;
    double promotionsTimes = random.nextInt(5);
    double workyears = random.nextInt(10) + 1;
    double quality = random.nextDouble() + random.nextInt(10);

    public EmploymentHistory(){
        employments = new ArrayList();
        
    }

    public ArrayList<CourseOffer> getRelevantcourseoffers() {
        return relevantcourseoffers;
    }

    public void setRelevantcourseoffers(ArrayList<CourseOffer> relevantcourseoffers) {
        this.relevantcourseoffers = relevantcourseoffers;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    public double getStartsalary() {
        return startsalary;
    }

    public void setStartsalary(double startsalary) {
        this.startsalary = startsalary;
    }

    public double getPromotionsTimes() {
        return promotionsTimes;
    }

    public void setPromotionsTimes(double promotionsTimes) {
        this.promotionsTimes = promotionsTimes;
    }

    public double getWorkyears() {
        return workyears;
    }

    public void setWorkyears(double workyears) {
        this.workyears = workyears;
    }
    
    
    
    public ArrayList<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(ArrayList<Employment> employments) {
        this.employments = employments;
    }
    public Employment addEmployment() {
        Employment e = new Employment();
        employments.add(e);
        return e;
    }
    

    public double getPromotionTimes(){        
        return promotionsTimes;
    }
    
    public double getQuality(){
        for(Employment e : employments){
            quality += e.quality;
        }
        return quality/workyears;
    }
    
    
    
    public double getGuaduatestudentScore() {
        double guadauatestudentscore = 0;
        guadauatestudentscore = (currentSalary - startsalary)/workyears + promotionsTimes/workyears+ quality;
        return guadauatestudentscore;

    }
    
}
