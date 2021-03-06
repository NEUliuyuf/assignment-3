/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

import info5100.university.example.College;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Department.Department;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import ui.MainJframe;

/**
 *
 * @author HYR
 */
public class Courserank extends javax.swing.JPanel {

    /**
     * Creates new form Courserank
     */
    MainJframe main;
    AdminWorkAreaJpanel admin;
    College college;
    public Courserank(MainJframe main, AdminWorkAreaJpanel admin, College college) {
        initComponents();
        this.main = main;
        this.admin = admin;
        this.college = college;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btmback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourserank = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        btmback.setBackground(new java.awt.Color(204, 51, 0));
        btmback.setText("back");
        btmback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmbackActionPerformed(evt);
            }
        });

        tblCourserank.setAutoCreateRowSorter(true);
        tblCourserank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Picked Num"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourserank);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btmback, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btmback, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btmbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmbackActionPerformed
        // TODO add your handling code here:
        main.getCardLayout().previous(main.getCards());
        main.getCards().remove(admin.crjp);
        
    }//GEN-LAST:event_btmbackActionPerformed

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblCourserank.getModel();
        model.setRowCount(0);  
        HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
        for(Department department: college.getDepartmentCatalog().getDepartmentCatalog()){
            for(Course course : department.getCourseCatalog().getCourseList()){
                if(hm.containsKey(course.getName())){
                    hm.put(course.getName(), course.getRelevent() + hm.get(course.getName()));
                }else{
                    hm.put(course.getName(),course.getRelevent());
                }
                
            }
        }

        
        
        Map<String, Integer> hm1 = sortByValue(hm); 
        for(Map.Entry<String, Integer> en : hm.entrySet()){
            
            Object row[] = new Object[2];
            row[0] = en.getKey();
            row[1] = en.getValue();
            model.addRow(row);
        }

        
    }
    public HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        LinkedList<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
 
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourserank;
    // End of variables declaration//GEN-END:variables
}
