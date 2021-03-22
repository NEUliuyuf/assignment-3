/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

import info5100.university.example.College;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Department.Department;
import info5100.university.example.Department.DepartmentCatalog;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import javax.swing.JOptionPane;
import ui.MainJframe;

/**
 *
 * @author HYR
 */
public class AdminWorkAreaJpanel extends javax.swing.JPanel {
    MainJframe main;
    StudentDirectory studentDirectory;
    College college;
    //FacultyProfile facultyProfile;
    FacultyDirectory facultyDirectory;
    AddDepartment mdjp;
    ManageFaculty mfjp;
    AddCourse acjp;
    ManageStudent msjp;
    CourseSchedule csjp;
    Graduatestudentrank gsrjp;
    Facultyrank frjp;
    Courserank crjp;
    Course course;
   
       /**
     * Creates new form AdminWorkAreaJpanel
     */
    public AdminWorkAreaJpanel(College c, MainJframe m) {
        initComponents();      
        college = c;
        main = m;
        
        
        //facultyDirectory =fd;
        populateCmbDepartment();
        populateCmbcmbFaculty();
        populateCmbcmbCourse();
        populateCmbStudent();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdmin = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblFaculty = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        lblStudent = new javax.swing.JLabel();
        cmbDeparment = new javax.swing.JComboBox<>();
        cmbFaculty = new javax.swing.JComboBox<>();
        cmbCourse = new javax.swing.JComboBox<>();
        cmbStudent = new javax.swing.JComboBox<>();
        btmmanagedepartment = new javax.swing.JButton();
        btmManageFaculty = new javax.swing.JButton();
        btmmanagecourse = new javax.swing.JButton();
        btmdeletecourse = new javax.swing.JButton();
        btmManageStudent = new javax.swing.JButton();
        btmDeleteStudent = new javax.swing.JButton();
        btmlogout = new javax.swing.JButton();
        btmfacultyrank = new javax.swing.JButton();
        btmstudentrank1 = new javax.swing.JButton();
        btmcourserank1 = new javax.swing.JButton();
        btnDeleteDepartment = new javax.swing.JButton();
        btnDeleteFaculty = new javax.swing.JButton();
        btmSchedule = new javax.swing.JButton();
        correlationLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        lblAdmin.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        lblAdmin.setText("Admin Login");

        lblDepartment.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblDepartment.setText("Department");

        lblFaculty.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblFaculty.setText("Faculty");

        lblCourse.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblCourse.setText("Course");

        lblStudent.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblStudent.setText("Student");

        cmbDeparment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDeparment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDeparmentItemStateChanged(evt);
            }
        });
        cmbDeparment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbDeparmentMouseClicked(evt);
            }
        });
        cmbDeparment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDeparmentActionPerformed(evt);
            }
        });

        cmbFaculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFacultyActionPerformed(evt);
            }
        });

        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseActionPerformed(evt);
            }
        });

        cmbStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStudentActionPerformed(evt);
            }
        });

        btmmanagedepartment.setBackground(new java.awt.Color(0, 153, 102));
        btmmanagedepartment.setText("Add");
        btmmanagedepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmmanagedepartmentActionPerformed(evt);
            }
        });

        btmManageFaculty.setBackground(new java.awt.Color(0, 153, 102));
        btmManageFaculty.setText("Add");
        btmManageFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmManageFacultyActionPerformed(evt);
            }
        });

        btmmanagecourse.setBackground(new java.awt.Color(0, 153, 102));
        btmmanagecourse.setText("Add");
        btmmanagecourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmmanagecourseActionPerformed(evt);
            }
        });

        btmdeletecourse.setBackground(new java.awt.Color(255, 102, 102));
        btmdeletecourse.setText("Delete Course");
        btmdeletecourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmdeletecourseActionPerformed(evt);
            }
        });

        btmManageStudent.setBackground(new java.awt.Color(0, 153, 102));
        btmManageStudent.setText("Add");
        btmManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmManageStudentActionPerformed(evt);
            }
        });

        btmDeleteStudent.setBackground(new java.awt.Color(255, 102, 102));
        btmDeleteStudent.setText("Delete Student");
        btmDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmDeleteStudentActionPerformed(evt);
            }
        });

        btmlogout.setBackground(new java.awt.Color(255, 51, 0));
        btmlogout.setText("Log out");
        btmlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmlogoutActionPerformed(evt);
            }
        });

        btmfacultyrank.setBackground(new java.awt.Color(0, 153, 102));
        btmfacultyrank.setText("Course Rank");
        btmfacultyrank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmfacultyrankActionPerformed(evt);
            }
        });

        btmstudentrank1.setBackground(new java.awt.Color(0, 153, 102));
        btmstudentrank1.setText("Graduate Student Rank");
        btmstudentrank1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmstudentrank1ActionPerformed(evt);
            }
        });

        btmcourserank1.setBackground(new java.awt.Color(0, 153, 102));
        btmcourserank1.setText("Faculty Rank");
        btmcourserank1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmcourserank1ActionPerformed(evt);
            }
        });

        btnDeleteDepartment.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteDepartment.setText("Delete Department");
        btnDeleteDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDepartmentActionPerformed(evt);
            }
        });

        btnDeleteFaculty.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteFaculty.setText("Delete Faculty");
        btnDeleteFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFacultyActionPerformed(evt);
            }
        });

        btmSchedule.setBackground(new java.awt.Color(255, 255, 0));
        btmSchedule.setText("Schedule");
        btmSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmScheduleActionPerformed(evt);
            }
        });

        correlationLbl.setText("Correlation:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btmManageFaculty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btmManageStudent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btmDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btmmanagedepartment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btmstudentrank1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btmcourserank1)
                                        .addGap(253, 253, 253))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btmfacultyrank)
                                        .addGap(57, 57, 57))))
                            .addComponent(lblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDeparment, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(btmmanagecourse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btmdeletecourse, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btmSchedule))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(286, Short.MAX_VALUE)
                                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(correlationLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btmlogout)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btmlogout))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correlationLbl)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteDepartment)
                    .addComponent(btmmanagedepartment)
                    .addComponent(cmbDeparment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepartment))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteFaculty)
                    .addComponent(btmManageFaculty)
                    .addComponent(cmbFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaculty))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourse)
                    .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmmanagecourse)
                    .addComponent(btmdeletecourse)
                    .addComponent(btmSchedule))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmDeleteStudent)
                    .addComponent(btmManageStudent)
                    .addComponent(cmbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudent))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmfacultyrank)
                    .addComponent(btmcourserank1)
                    .addComponent(btmstudentrank1))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDeparmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeparmentActionPerformed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_cmbDeparmentActionPerformed

    public void populateCmbDepartment(){
        cmbDeparment.removeAllItems();
        for(Department department : college.getDepartmentCatalog().getDepartmentCatalog()){
            cmbDeparment.addItem(department.toString());
        }
    }
    public void populateCmbcmbFaculty(){
        cmbFaculty.removeAllItems();
        if(cmbDeparment.getSelectedIndex() >= 0){
            
            for(FacultyProfile fp: college.getDepartment(cmbDeparment.getSelectedItem().toString()).getFacultyDirectory().getTeacherlist()){
                cmbFaculty.addItem(fp.getPerson().getName());
            }
        }
    }
    public void populateCmbStudent(){
        cmbStudent.removeAllItems();
        if(cmbDeparment.getSelectedIndex() >= 0){
            
            for(StudentProfile sp: college.getDepartment(cmbDeparment.getSelectedItem().toString()).getstudentDirectory().getStudentlist()){
                cmbStudent.addItem(sp.getPerson().getName());
            }
        }
    }
     public void populateCmbcmbCourse() {
        cmbCourse.removeAllItems();
        if(cmbDeparment.getSelectedIndex() >= 0){
            for(Course cs: college.getDepartment(cmbDeparment.getSelectedItem().toString()).getCourseCatalog().getCourseList()){
                cmbCourse.addItem(cs.getName());
            }
        }
    }
    
    private void cmbFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFacultyActionPerformed

    private void cmbCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCourseActionPerformed

    private void cmbStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStudentActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbStudentActionPerformed

    private void btmstudentrank1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmstudentrank1ActionPerformed
        // TODO add your handling code here:
        gsrjp = new Graduatestudentrank(main,this,college);
        main.getCards().add(gsrjp);
        main.getCardLayout().next(main.getCards());
    }//GEN-LAST:event_btmstudentrank1ActionPerformed

    private void btmlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmlogoutActionPerformed
        // TODO add your handling code here:
        main.getCardLayout().previous(main.getCards());
        main.getCards().remove(main.awajp);
    }//GEN-LAST:event_btmlogoutActionPerformed

    private void btmmanagedepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmmanagedepartmentActionPerformed
        // TODO add your handling code here:
        this.mdjp = new AddDepartment(main,college,this);
        main.getCards().add(mdjp);
        main.getCardLayout().next(main.getCards());
    }//GEN-LAST:event_btmmanagedepartmentActionPerformed

    private void btmManageFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmManageFacultyActionPerformed
        // TODO add your handling code here:
        
        if(cmbDeparment.getSelectedIndex() >= 0){
            Department department = college.getDepartment(cmbDeparment.getSelectedItem().toString());
            mfjp = new ManageFaculty(main, department, this);
            main.getCards().add(mfjp);
            main.getCardLayout().next(main.getCards());
        }else{
            JOptionPane.showMessageDialog(this, "No department");
        }
        
    }//GEN-LAST:event_btmManageFacultyActionPerformed

    private void btnDeleteDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDepartmentActionPerformed
        if(cmbDeparment.getSelectedIndex() >= 0){
            String d = cmbDeparment.getSelectedItem().toString();
            college.getDepartmentCatalog().removeDepartmentByName(d);
            populateCmbDepartment();
        }else{
            JOptionPane.showMessageDialog(this, "No department");
        }
        
        
    }//GEN-LAST:event_btnDeleteDepartmentActionPerformed

    private void cmbDeparmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbDeparmentMouseClicked
        // TODO add your handling code here:
        populateCmbcmbFaculty();
    }//GEN-LAST:event_cmbDeparmentMouseClicked

    public void populateCorrelation(){
        if(cmbDeparment.getSelectedIndex()>=0){
            Department department = college.getDepartment(cmbDeparment.getSelectedItem().toString());
            double cor = Math.round(department.getstudentDirectory().correlation() * 10000.0) / 10000.0;
            correlationLbl.setText("Correlation: " + cor);
        }
    }
    private void cmbDeparmentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDeparmentItemStateChanged
        // TODO add your handling code here:
        populateCmbcmbFaculty();
        populateCmbcmbCourse();
        populateCmbStudent();
        populateCorrelation();
    }//GEN-LAST:event_cmbDeparmentItemStateChanged

    private void btmmanagecourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmmanagecourseActionPerformed
        // TODO add your handling code here:
        Department department = college.getDepartment(cmbDeparment.getSelectedItem().toString());
        this.acjp = new AddCourse(main,department,this);
        main.getCards().add(acjp);
        main.getCardLayout().next(main.getCards());
    }//GEN-LAST:event_btmmanagecourseActionPerformed

    private void btmdeletecourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmdeletecourseActionPerformed
        // TODO add your handling code here:
        if(cmbCourse.getSelectedIndex() >= 0){
            String d = cmbCourse.getSelectedItem().toString();
            college.getDepartment(cmbDeparment.getSelectedItem().toString()).getCourseCatalog().removeCourseByName(d);
            college.getDepartment(cmbDeparment.getSelectedItem().toString()).getSpring().removeCourseOfferByName(d);
            college.getDepartment(cmbDeparment.getSelectedItem().toString()).getSummer().removeCourseOfferByName(d);
            college.getDepartment(cmbDeparment.getSelectedItem().toString()).getFall().removeCourseOfferByName(d);
            populateCmbcmbCourse();
        }else{
            JOptionPane.showMessageDialog(this, "No courses");
        }
    }//GEN-LAST:event_btmdeletecourseActionPerformed

    private void btmManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmManageStudentActionPerformed
        // TODO add your handling code here:
        if(cmbDeparment.getSelectedIndex() >= 0){
            Department department = college.getDepartment(cmbDeparment.getSelectedItem().toString());

            msjp = new ManageStudent(main, department, this);
            main.getCards().add(msjp);
            main.getCardLayout().next(main.getCards());
        }else{
            JOptionPane.showMessageDialog(this, "No department");
        }
    }//GEN-LAST:event_btmManageStudentActionPerformed

    private void btmDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmDeleteStudentActionPerformed
        // TODO add your handling code here:
        if(cmbDeparment.getSelectedIndex() >= 0){
            String s = cmbStudent.getSelectedItem().toString();
            college.getDepartment(cmbDeparment.getSelectedItem().toString()).getstudentDirectory().removeStudentByName(s);
            populateCmbStudent();
        }else{
            JOptionPane.showMessageDialog(this, "No department");
        }
        
    }//GEN-LAST:event_btmDeleteStudentActionPerformed

    private void btnDeleteFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFacultyActionPerformed
        // TODO add your handling code here:
        if(cmbDeparment.getSelectedIndex() >= 0){
            if(cmbFaculty.getSelectedIndex() >= 0){
                String s = cmbFaculty.getSelectedItem().toString();
                college.getDepartment(cmbDeparment.getSelectedItem().toString()).getFacultyDirectory().removeFacultyByName(s);
                populateCmbcmbFaculty();
            }else{
                JOptionPane.showMessageDialog(this, "No Faculty");
            }         
           
        }else{
            JOptionPane.showMessageDialog(this, "No department");
        }
        
    }//GEN-LAST:event_btnDeleteFacultyActionPerformed

    private void btmScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmScheduleActionPerformed
        // TODO add your handling code here:
        Department department = college.getDepartment(cmbDeparment.getSelectedItem().toString());
        this.csjp = new CourseSchedule(department,main,this);
        main.getCards().add(csjp);
        main.getCardLayout().next(main.getCards());
    }//GEN-LAST:event_btmScheduleActionPerformed

    private void btmcourserank1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmcourserank1ActionPerformed
        // TODO add your handling code here:
        frjp = new Facultyrank(main,this,college);
        main.getCards().add(frjp);
        main.getCardLayout().next(main.getCards());
    }//GEN-LAST:event_btmcourserank1ActionPerformed

    private void btmfacultyrankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmfacultyrankActionPerformed
        // TODO add your handling code here:
        crjp = new Courserank(main,this,college);
        main.getCards().add(crjp);
        main.getCardLayout().next(main.getCards());
    }//GEN-LAST:event_btmfacultyrankActionPerformed

    @Override
    public String toString(){
        return "Admin";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmDeleteStudent;
    private javax.swing.JButton btmManageFaculty;
    private javax.swing.JButton btmManageStudent;
    private javax.swing.JButton btmSchedule;
    private javax.swing.JButton btmcourserank1;
    private javax.swing.JButton btmdeletecourse;
    private javax.swing.JButton btmfacultyrank;
    private javax.swing.JButton btmlogout;
    private javax.swing.JButton btmmanagecourse;
    private javax.swing.JButton btmmanagedepartment;
    private javax.swing.JButton btmstudentrank1;
    private javax.swing.JButton btnDeleteDepartment;
    private javax.swing.JButton btnDeleteFaculty;
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JComboBox<String> cmbDeparment;
    private javax.swing.JComboBox<String> cmbFaculty;
    private javax.swing.JComboBox<String> cmbStudent;
    private javax.swing.JLabel correlationLbl;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblFaculty;
    private javax.swing.JLabel lblStudent;
    // End of variables declaration//GEN-END:variables

   
}