/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kal bugrara
 */
public class CourseOffer {

    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;
    ArrayList<Integer> facultyScoreList;

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList();
    }
    public void AssignAsTeacher(FacultyProfile fp) {
        facultyassignment = new FacultyAssignment(fp, this);
    }

    public FacultyProfile getFacultyProfile() {
        return facultyassignment.getFacultyProfile();
    }

    public String getCourseNumber() {
        return course.getCOurseNumber();
    }

    public void generatSeats(int n) {

        for (int i = 0; i < n; i++) {

            seatlist.add(new Seat(this, i));

        }

    }
    
    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }
    
    public int getEmptySeatNumber(){
        int i = 0;
        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                i+=1;
            }
        }
        return i;
        
    }

    public boolean assignEmptySeat(StudentProfile sp, String semester) {

        Seat seat = getEmptySeat();
        if (seat != null) {            
            seat.setOccupied(true);
            seat.assignStudent(sp);
            CourseLoad cl = new CourseLoad(semester,this,seat);
            sp.getTranscript().newCourseLoad(cl);
            return true;
        }else{
            return false;
        }
        
        
    }

    public void dropCourse(CourseLoad cl, StudentProfile sp, String semester){
        cl.seat.setOccupied(false);
        cl.seat.student = null;
        sp.getTranscript().removeCourseLoad(cl,semester);
    }
    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }

        }
        return sum;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(ArrayList<Seat> seatlist) {
        this.seatlist = seatlist;
    }

    public FacultyAssignment getFacultyassignment() {
        return facultyassignment;
    }

    public void setFacultyassignment(FacultyAssignment facultyassignment) {
        this.facultyassignment = facultyassignment;
    }

    public ArrayList<Integer> getRelevantScoreList() {
        return facultyScoreList;
    }

    public void setRelevantScoreList(ArrayList<Integer> relevantScoreList) {
        this.facultyScoreList = relevantScoreList;
    }
    public void addRelevantScore(int score){
        this.facultyScoreList.add(score);
    }
    
    public double getRelevanceRate(){
        int sumScore = 0;
        for(int i = 0;i<this.facultyScoreList.size();i++){
            sumScore += this.facultyScoreList.get(i);
        }
        return (double)sumScore/this.facultyScoreList.size();
    }
    
    @Override
    public String toString(){
        return course.getName();
    }
}
