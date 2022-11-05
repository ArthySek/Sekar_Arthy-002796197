/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.MainSystem;
import model.CredentialDirectory;
import model.Doctor;
import model.Hospital;

/**
 *
 * @author arthy
 */

public class PatientCreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientCreateJPanel
     */
    MainSystem mainSystem;
    CredentialDirectory allcredentials;
    public PatientCreateJPanel(MainSystem mainSystem,CredentialDirectory allcredentials) {
        initComponents();
        this.mainSystem = mainSystem;
        this.allcredentials = allcredentials;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearchHosp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSearchDoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSearchComm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnSearchHosp = new javax.swing.JButton();
        btnSearchDoc = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Patient");

        jLabel2.setText("Book Doctor's appointment");

        jLabel3.setText("Search Hospital");

        jLabel4.setText("Search Doctors");

        jLabel5.setText("Search Community");

        txtSearchComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCommActionPerformed(evt);
            }
        });

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hospital", "Hospital ID", "Doctor", "Doctor Speciality", "Doctor ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRecords);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSearchHosp.setBackground(new java.awt.Color(0, 0, 0));
        btnSearchHosp.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchHosp.setText("Search");
        btnSearchHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHospActionPerformed(evt);
            }
        });

        btnSearchDoc.setBackground(new java.awt.Color(0, 0, 0));
        btnSearchDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchDoc.setText("Search");
        btnSearchDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(txtSearchDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSearchComm, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSearchHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnSearchHosp)
                            .addComponent(btnSearchDoc))
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSearchComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSearchHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchHosp))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSearchDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchDoc)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCommActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    if (txtSearchComm.getText().trim().equals("")) {
    // throw errors
            JOptionPane.showMessageDialog(this, "Please enter a valid Search term");
        }else{
            ArrayList<Doctor> searchComm = new ArrayList();        
            searchComm = searchByhosp(searchBycomm(txtSearchComm.getText()));  
            System.out.println(" SIZE OF DOCTORS IN COMM " + searchComm.size());
            if(searchComm.isEmpty()){
                JOptionPane.showMessageDialog(this, "No Records matching with this Community");
            }else{
                popTable(searchComm);
            }    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHospActionPerformed
        // TODO add your handling code here:
        if (txtSearchHosp.getText().trim().equals("")) {
    // throw errors
            JOptionPane.showMessageDialog(this, "Please enter a valid Search term");
        }else{
            ArrayList<Doctor> searchComm = new ArrayList();        
            searchComm = searchByhosp(searchBycomm(txtSearchComm.getText()));  
            System.out.println(" SIZE OF DOCTORS IN COMM " + searchComm.size());
            if(searchComm.isEmpty()){
                JOptionPane.showMessageDialog(this, "No Records matching with this Community");
            }else{
                popTableHospSearch(searchComm,txtSearchHosp.getText());
            }    
        }
        
    }//GEN-LAST:event_btnSearchHospActionPerformed

    private void btnSearchDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDocActionPerformed
        // TODO add your handling code here:
        if (txtSearchHosp.getText().trim().equals("")) {
    // throw errors
            JOptionPane.showMessageDialog(this, "Please enter a valid Search term");
        }else{
            ArrayList<Doctor> searchComm = new ArrayList();        
            searchComm = searchByhosp(searchBycomm(txtSearchComm.getText()));  
            System.out.println(" SIZE OF DOCTORS IN COMM " + searchComm.size());
            if(searchComm.isEmpty()){
                JOptionPane.showMessageDialog(this, "No Records matching with this Community");
            }else{
                popTableDoctorSearch(searchComm,txtSearchDoc.getText());
            }    
        }        
    }//GEN-LAST:event_btnSearchDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchDoc;
    private javax.swing.JButton btnSearchHosp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecords;
    private javax.swing.JTextField txtSearchComm;
    private javax.swing.JTextField txtSearchDoc;
    private javax.swing.JTextField txtSearchHosp;
    // End of variables declaration//GEN-END:variables
    private void popTable(ArrayList<Doctor> searchComm) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel m1 = (DefaultTableModel)tblRecords.getModel();
        m1.setRowCount(0);
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");             
        for(Doctor Dc : searchComm){
            Object[] row = new Object[5];
            for(City ct : mainSystem.getAllcities()){
                row[1] = ct.searchHospital(Dc.getHsp().getHospitalName()).get(0).getHospitalId();
            }
            row[0] = Dc.getHsp().getHospitalName();
            row[2] = Dc.getDocname();
            row[3] = Dc.getDocspeciality();
            row[4] = Dc.getDocid();            
            m1.addRow(row);
        }
    }   

    
    private void popTableHospSearch(ArrayList<Doctor> searchComm,String searchterm) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel m1 = (DefaultTableModel)tblRecords.getModel();
        m1.setRowCount(0);
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");             
        for(Doctor Dc : searchComm){
            Object[] row = new Object[5];
            if(searchterm.equals(Dc.getHsp().getHospitalName())){
                for(City ct : mainSystem.getAllcities()){
                    row[0] = ct.searchHospital(Dc.getHsp().getHospitalName()).get(0).getHospitalId();
                }
                row[1] = Dc.getHsp().getHospitalName();
                row[2] = Dc.getDocname();
                row[3] = Dc.getDocspeciality();
                row[4] = Dc.getDocid();     
                m1.addRow(row);                
            }

        }
    }       
    
    private void popTableDoctorSearch(ArrayList<Doctor> searchComm,String searchterm) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel m1 = (DefaultTableModel)tblRecords.getModel();
        m1.setRowCount(0);
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");             
        for(Doctor Dc : searchComm){
            Object[] row = new Object[5];
            if(searchterm.equals(Dc.getDocname())){
                for(City ct : mainSystem.getAllcities()){
                    row[0] = ct.searchHospital(Dc.getHsp().getHospitalName()).get(0).getHospitalId();
                }
                row[1] = Dc.getHsp().getHospitalName();
                row[2] = Dc.getDocname();
                row[3] = Dc.getDocspeciality();
                row[4] = Dc.getDocid();         
                m1.addRow(row);
            }

        }
    }   
    
    
    private ArrayList<Hospital> searchBycomm(String name){
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<Community> searchComm = new ArrayList();  
        ArrayList<Hospital> searchHosp = new ArrayList();
        for(City ct : mainSystem.getAllcities()){
            for(Hospital hosp : ct.getAllhospitals()){
                if(hosp.getCommunity().getCommunityname().equals(name)){
                    System.out.println("WE GOT A MATCH");
                    Hospital hp = new Hospital();
                    hp.setHospitalName(hosp.getHospitalName());
                    hp.setHospitalId(hosp.getZipcode());
                    searchHosp.add(hp);
                }
            }
        }
        return searchHosp;
        //this.searchEmployee=searchEmployee;
    }



    private ArrayList<Doctor> searchByhosp(ArrayList<Hospital> searchHosp){
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ArrayList<Community> searchComm = new ArrayList();  
        ArrayList<Doctor> searchDoc = new ArrayList();
        for(Doctor doc : mainSystem.getDoctordir().getAlldoctor()){
            for(Hospital hosp : searchHosp){
                if(hosp.getHospitalName().equals(doc.getHsp().getHospitalName())){
                    System.out.println("WE GOT A MATCH "+ doc.getDocname() + " " + hosp.getHospitalName());                    
                    Doctor dc = new Doctor();    
                    Hospital hsp = new Hospital();
                    dc.setDocname(doc.getDocname());
                    dc.setDocspeciality(doc.getDocspeciality());
                    dc.setDocnos(doc.getDocnos());
                    dc.setDocid(doc.getDocid());
                    hsp.setHospitalName(hosp.getHospitalName());
                    hsp.setHospitalId(hosp.getHospitalId());
                    dc.setHsp(hsp);
                    searchDoc.add(dc);
                }
                
            }
               
        }
        return searchDoc;
        //this.searchEmployee=searchEmployee;
    }    
    
}
