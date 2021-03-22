/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    String semester;
    CourseOffer courseOffer;
    Seat seat;
    double GPA;
    
    public CourseLoad(String s,CourseOffer co,Seat seat){
        semester = s;
        courseOffer = co;
        this.seat = seat;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public CourseOffer getCourseOffer() {
        return courseOffer;
    }

    public void setCourseOffer(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        seat.GPA = GPA;
        this.GPA = GPA;
    }
    
    
    @Override
    
    public String toString(){
        return courseOffer.getCourse().getName();
    }
   
}
