/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Department {
    
    String name;
    static int id;
    
    CourseCatalog coursecatalog;
    CourseSchedule Spring;
    CourseSchedule Summer;
    CourseSchedule Fall;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultyDirectory;
    DataStore data;
    
    
    //EmployerDirectory employerdirectory;
    ArrayList<CourseSchedule>selectedcourse;
    HashMap<String, CourseSchedule> mastercoursecatalog;

    public ArrayList<CourseSchedule> getSelectedcourse() {
        return selectedcourse;
    }

    public void setSelectedcourse(ArrayList<CourseSchedule> selectedcourse) {
        this.selectedcourse = selectedcourse;
    }
    
    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<String, CourseSchedule>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this);
        facultyDirectory = new FacultyDirectory(this);
        persondirectory = new PersonDirectory();
        Spring = new CourseSchedule("Spring",coursecatalog);
        Summer = new CourseSchedule("Summer",coursecatalog);
        Fall = new CourseSchedule("Fall",coursecatalog);
    }

    public PersonDirectory getPersonDirectory() {

        return persondirectory;

    }


    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }

    public void addCourse(Course c){
        coursecatalog.addCourse(c);
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.get(semester);

        return css.calculateTotalRevenues();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseCatalog getCoursecatalog() {
        return coursecatalog;
    }

    public void setCoursecatalog(CourseCatalog coursecatalog) {
        this.coursecatalog = coursecatalog;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public StudentDirectory getstudentDirectory() {
        return studentdirectory;
    }

    public void setStudentdirectory(StudentDirectory studentdirectory) {
        this.studentdirectory = studentdirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultydirectory) {
        this.facultyDirectory = facultydirectory;
    }

    public HashMap<String, CourseSchedule> getMastercoursecatalog() {
        return mastercoursecatalog;
    }

    public void setMastercoursecatalog(HashMap<String, CourseSchedule> mastercoursecatalog) {
        this.mastercoursecatalog = mastercoursecatalog;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Department.id = id;
    }

    public CourseSchedule getSpring() {
        return Spring;
    }

    public void setSpring(CourseSchedule Spring) {
        this.Spring = Spring;
    }

    public CourseSchedule getSummer() {
        return Summer;
    }

    public void setSummer(CourseSchedule Summer) {
        this.Summer = Summer;
    }

    public CourseSchedule getFall() {
        return Fall;
    }

    public void setFall(CourseSchedule Fall) {
        this.Fall = Fall;
    }
    
    /*
    public void getCountOfCourse(){
        DataStore data = DataStore.getInstance();
        HashMap<Integer,Integer>studentSelectedCourse =  new HashMap<Integer,Integer>();
        for(StudentProfile s : data.getStudents().values()){
           int StudentID = s.getPerson().getId();
            if(studentSelectedCourse.containsKey(StudentID)){
                studentSelectedCourse.put(StudentID, studentSelectedCourse.get(StudentID)+1);
            }else{
                studentSelectedCourse.put(StudentID, 1);
            }
        }
        ArrayList<StudentProfile>studentProfiles = new ArrayList(data.getStudents().values());
        Collections.sort(studentProfiles,new UserMapComparator(studentSelectedCourse));
        
    }
    */
    
    
    @Override
    public String toString(){
        return name;
    }
}
