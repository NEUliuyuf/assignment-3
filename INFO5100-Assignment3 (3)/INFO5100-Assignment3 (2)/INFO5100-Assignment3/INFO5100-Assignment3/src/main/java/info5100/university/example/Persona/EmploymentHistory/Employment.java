/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kal bugrara
 */
public class Employment {    
    int weight;
    int quality;
    String job;    
    double workyears;

    public double getWorkyears() {
        return workyears;
    }

    public void setWorkyears(double workyears) {
        this.workyears = workyears;
    }
    
    public Employment(/*String j*/){
        //this.job = j;
        Random random = new Random();
        quality = random.nextInt(10);
        
    }

    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

 
}
