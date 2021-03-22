/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import com.github.javafaker.Faker;
import info5100.university.example.College;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.admin.AdminWorkAreaJpanel;
import ui.student.StudentManage;


/**
 *
 * @author Yufeng
 */
public class MainJframe extends javax.swing.JFrame {
    JPanel mainWorkArea;
    public AdminWorkAreaJpanel awajp;
    public StudentManage smjp;
    StudentDirectory studentDirectory;
    College college;
    FacultyDirectory facultyDirectory;
    Department department;
    StudentProfile selectedStudent = null;
    /**
     * Creates new form MainJFrame
     */
    CardLayout cardLayout;
    public MainJframe() {
        initComponents();
        cardLayout = (CardLayout)(cards.getLayout());
        cardLayout.show(cards, "login");
        // create college
        college = new College("College of Enginnering");
        
        Faker faker = new Faker();
        Random random = new Random();
        
        // create departments 
        Department IS = new Department("Information System");
        college.addDepartment(IS);
        Department Bio = new Department("Bioengineering");
        college.addDepartment(Bio);
        Department CE = new Department("Chemical Engineering");
        college.addDepartment(CE);
        Department ES = new Department("Energy System");
        college.addDepartment(ES);
        
        // Create faculties
        for(int i=0;i<5;i++){
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            Date date = faker.date().birthday();
            Person person = new Person(faker.name().fullName(),random.nextInt(30) ,sdf.format(date));
            IS.getPersonDirectory().newPerson(person);
            IS.getFacultyDirectory().newFaculty(person);
        }
        for(int i=0;i<5;i++){
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            Date date = faker.date().birthday();
            Person person = new Person(faker.name().fullName(),random.nextInt(30) ,sdf.format(date));
            Bio.getPersonDirectory().newPerson(person);
            Bio.getFacultyDirectory().newFaculty(person);
        }
        for(int i=0;i<5;i++){
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            Date date = faker.date().birthday();
            Person person = new Person(faker.name().fullName(),random.nextInt(30) ,sdf.format(date));
            CE.getPersonDirectory().newPerson(person);
            CE.getFacultyDirectory().newFaculty(person);
        }
        for(int i=0;i<5;i++){
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            Date date = faker.date().birthday();
            Person person = new Person(faker.name().fullName(),random.nextInt(30) ,sdf.format(date));
            ES.getPersonDirectory().newPerson(person);
            ES.getFacultyDirectory().newFaculty(person);
        }
        
        // Create Students
        for(int i=0;i<50;i++){
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            Date date = faker.date().birthday();
            Person person = new Person(faker.name().fullName(),random.nextInt(30) ,sdf.format(date));
            IS.getPersonDirectory().newPerson(person);
            IS.getstudentDirectory().newStudentProfile(person);
        }
        for(int i=0;i<50;i++){
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            Date date = faker.date().birthday();
            Person person = new Person(faker.name().fullName(),random.nextInt(30) ,sdf.format(date));
            Bio.getPersonDirectory().newPerson(person);
            Bio.getstudentDirectory().newStudentProfile(person);
        }
        for(int i=0;i<50;i++){
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            Date date = faker.date().birthday();
            Person person = new Person(faker.name().fullName(),random.nextInt(30) ,sdf.format(date));
            CE.getPersonDirectory().newPerson(person);
            CE.getstudentDirectory().newStudentProfile(person);
        }
        for(int i=0;i<50;i++){
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            Date date = faker.date().birthday();
            Person person = new Person(faker.name().fullName(),random.nextInt(30) ,sdf.format(date));
            ES.getPersonDirectory().newPerson(person);
            ES.getstudentDirectory().newStudentProfile(person);
        }
        
        // Create Course
        for(int i=0;i<10;i++){
            Course course = new Course(faker.job().position(),String.valueOf(5000 + random.nextInt(3000)) ,random.nextInt(4)+1);
            IS.addCourse(course);

            int faculty = random.nextInt(5);
            FacultyProfile fp= IS.getFacultyDirectory().getTeacherlist().get(faculty);
            int seatNum = random.nextInt(100);
            
            int r = random.nextInt(4);
            if(r == 1){
                IS.getSpring().addCourseOffer(course,fp,seatNum);
            }else if(r == 2){
                IS.getSummer().addCourseOffer(course, fp, seatNum);
            }else if(r == 3){
                IS.getFall().addCourseOffer(course, fp, seatNum);
            }
            
            
            

            
            
        }
        for(int i=0;i<10;i++){
            Course course = new Course(faker.job().position(),String.valueOf(5000 + random.nextInt(3000)) ,random.nextInt(4)+1);
            Bio.addCourse(course);
            
            int faculty = random.nextInt(5);
            FacultyProfile fp= Bio.getFacultyDirectory().getTeacherlist().get(faculty);
            int seatNum = random.nextInt(100);
            int r = random.nextInt(4);
            if(r == 1){
                Bio.getSpring().addCourseOffer(course,fp,seatNum);
            }else if(r == 2){
                Bio.getSummer().addCourseOffer(course, fp, seatNum);
            }else if(r == 3){
                Bio.getFall().addCourseOffer(course, fp, seatNum);
            }
        }
        for(int i=0;i<10;i++){
            Course course = new Course(faker.job().position(),String.valueOf(5000 + random.nextInt(3000)) ,random.nextInt(4)+1);
            CE.addCourse(course);
            
            int faculty = random.nextInt(5);
            FacultyProfile fp= CE.getFacultyDirectory().getTeacherlist().get(faculty);
            int seatNum = random.nextInt(100);
            int r = random.nextInt(4);
            if(r == 1){
                CE.getSpring().addCourseOffer(course,fp,seatNum);
            }else if(r == 2){
                CE.getSummer().addCourseOffer(course, fp, seatNum);
            }else if(r == 3){
                CE.getFall().addCourseOffer(course, fp, seatNum);
            }
        }
        for(int i=0;i<10;i++){
            Course course = new Course(faker.job().position(),String.valueOf(5000 + random.nextInt(3000)) ,random.nextInt(4)+1);
            ES.addCourse(course);
            
            int faculty = random.nextInt(5);
            FacultyProfile fp= ES.getFacultyDirectory().getTeacherlist().get(faculty);
            int seatNum = random.nextInt(100);
            int r = random.nextInt(4);
            if(r == 1){
                ES.getSpring().addCourseOffer(course,fp,seatNum);
            }else if(r == 2){
                ES.getSummer().addCourseOffer(course, fp, seatNum);
            }else if(r == 3){
                ES.getFall().addCourseOffer(course, fp, seatNum);
            }
        }
        
        
        
        
       
        populateRoleCombo();
        populateStudentCombo();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cards = new javax.swing.JPanel();
        loginPane = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        cmbStudent = new javax.swing.JComboBox<>();
        lblStudentname = new javax.swing.JLabel();
        cmbRoles = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cards.setLayout(new java.awt.CardLayout());

        loginPane.setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setBackground(new java.awt.Color(184, 181, 255));
        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Welcome to University System");
        lblTitle.setToolTipText("");
        lblTitle.setOpaque(true);

        lblRole.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("Choose Role:");

        btnLogin.setBackground(new java.awt.Color(0, 153, 102));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setAlignmentY(0.0F);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        cmbStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStudentActionPerformed(evt);
            }
        });

        lblStudentname.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblStudentname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentname.setText("Student name:");

        cmbRoles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRolesItemStateChanged(evt);
            }
        });
        cmbRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPaneLayout = new javax.swing.GroupLayout(loginPane);
        loginPane.setLayout(loginPaneLayout);
        loginPaneLayout.setHorizontalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPaneLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRole)
                    .addComponent(lblStudentname))
                .addGap(100, 100, 100)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(193, 193, 193))
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPaneLayout.setVerticalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPaneLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole))
                .addGap(76, 76, 76)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudentname))
                .addGap(115, 115, 115)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        cards.add(loginPane, "login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String selectedPanel = cmbRoles.getSelectedItem().toString();
        
        if(selectedPanel.equals("Student")){
            if(cmbStudent.getSelectedItem() == null){
                JOptionPane.showMessageDialog(this, "Please select a student to login under student role.");
            }else{
                String selectedStudent = cmbStudent.getSelectedItem().toString();
                StudentProfile student = college.getStudentByName(selectedStudent);
                
                smjp = new StudentManage(student.getDepartment(),this,student);
                cards.add(smjp);
                cardLayout.next(cards);
            }
        }else{
            awajp = new AdminWorkAreaJpanel(college,this);
            cards.add(awajp);
            cardLayout.next(cards);
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cmbStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStudentActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_cmbStudentActionPerformed

    private void cmbRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolesActionPerformed
        // TODO add your handling code here:
        updateStudentVisibility();
    }//GEN-LAST:event_cmbRolesActionPerformed

    private void cmbRolesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRolesItemStateChanged
        // TODO add your handling code here:
        populateStudentCombo();
    }//GEN-LAST:event_cmbRolesItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel cards;
    private javax.swing.JComboBox<Object> cmbRoles;
    private javax.swing.JComboBox<String> cmbStudent;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblStudentname;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel loginPane;
    // End of variables declaration//GEN-END:variables

    private void updateStudentVisibility() {
        
        if(cmbRoles.getSelectedItem().equals("Admin")){
            selectedStudent = null;
            lblStudentname.setVisible(false);
            cmbStudent.setVisible(false);
        }
        if(cmbRoles.getSelectedItem().equals("Student")){
            lblStudentname.setVisible(true);
            cmbStudent.setVisible(true);
        }
    }

    private void populateRoleCombo() {
        cmbRoles.removeAllItems();
        String admin = "Admin";
        String student = "Student";
        cmbRoles.addItem(admin);
        cmbRoles.addItem(student);
    }

    public void populateStudentCombo() {
        cmbStudent.removeAllItems();
        for(Department department : college.getDepartmentCatalog().getDepartmentCatalog()){
            for(StudentProfile sp: department.getstudentDirectory().getStudentlist()){
                cmbStudent.addItem(sp.getPerson().getName());
            }
        }
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public JPanel getCards() {
        return cards;
    }
    
    
}
