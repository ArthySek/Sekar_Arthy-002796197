/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CredentialDirectory;
import model.Doctor;
import model.Encounter;
import model.EncounterHistory;
import model.MainSystem;
import model.Patient;
import model.Person;
import model.VitalSigns;
/**
 *
 * @author abhis
 */
public class DoctorPatientCreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorViewJPanel
     */
    MainSystem mainSystem;
    CredentialDirectory allcredentials;
    public DoctorPatientCreateJPanel(MainSystem mainSystem, CredentialDirectory allcredentials) {
        initComponents();
        this.mainSystem = mainSystem;
        this.allcredentials = allcredentials;
        try{
            popPatients();
        }catch(Exception e){
            System.out.print("CHILL");
        }

    }
    public boolean floatCheck(String str){
        boolean correct = str.matches("[-+]?[0-9]*\\.?[0-9]+");
        return correct;
    }
    public boolean rolecheck(){
        MainJFrame mj = new MainJFrame();
        String password;
        String username;
        String role;
        password = "fd2556b9dd";
        username = "admin";
        role = mj.getrole();
        boolean b1 =  allcredentials.checkSysAdminCred(username, password, role);
        
        return b1;
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
        jLabel5 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        txtPatientid = new javax.swing.JTextField();
        ComboBoxPatient = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtbt = new javax.swing.JTextField();
        txtrr = new javax.swing.JTextField();
        txtbp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        txtEncid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnpopulate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        datechooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel1.setText("Monitor Patients");

        jLabel2.setText("Patient Name");

        jLabel3.setText("Patient Id");

        jLabel5.setText("Contact Info");

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });

        txtPatientid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientidActionPerformed(evt);
            }
        });
        txtPatientid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPatientidKeyTyped(evt);
            }
        });

        ComboBoxPatient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Body Temperature (°C)");

        jLabel9.setText("Blood Pressure (mm Hg)");

        jLabel10.setText("Respiration Rate (Per Minute)");

        txtbt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbtKeyTyped(evt);
            }
        });

        jLabel11.setText("Encounter Date");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create or Edit Encounter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Comments");

        jLabel13.setText("Encounter Id");

        txtComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentsActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnpopulate.setBackground(new java.awt.Color(0, 0, 0));
        btnpopulate.setForeground(new java.awt.Color(255, 255, 255));
        btnpopulate.setText("Populate Table");
        btnpopulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpopulateActionPerformed(evt);
            }
        });

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "Contact Info", "Body Temp", "Respiration Rate", "Blood Pressure", "Encounter Date", "Encounter ID", "Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRecords);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPatientid, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboBoxPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtrr)
                                            .addComponent(txtbt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(89, 89, 89)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEncid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtComments, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datechooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnpopulate))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtComments, txtEncid, txtbp, txtbt, txtrr});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ComboBoxPatient, txtContact, txtPatientid});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ComboBoxPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatientid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(datechooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtEncid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addGap(18, 18, 18)
                                    .addComponent(txtrr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)))))))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpopulate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtComments, txtEncid, txtbp});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        boolean b23 = ((txtPatientid.getText().length() !=0) && (txtContact.getText().length() != 0) && (txtrr.getText().length() != 0) && (txtbp.getText().length() != 0) &&(txtbt.getText().length() != 0) &&(txtComments.getText().length() != 0));
        if(b23){
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String name = ComboBoxPatient.getSelectedItem().toString();
            int id1 = Integer.valueOf(txtPatientid.getText());
            Long con = Long.valueOf(txtContact.getText());

            Float rr = Float.valueOf(txtrr.getText());
            Float bp = Float.valueOf(txtbp.getText());
            Float bt = Float.valueOf(txtbt.getText());
            Date dt = datechooser.getDate();
            String maindate = dateFormat.format(dt);
            System.out.println("THE DATE IS "+dt);
            String co = txtComments.getText();
            int id2 = Integer.valueOf(txtEncid.getText());
            Date datex = null;
       

            if((((bp > 50) && (bp <200)) && ((rr > 0) && (rr <100)) && ((bt >= 37) && (bt <=110)))){
                if(mainSystem.getPatientdir().checkPatientd(id1)){
                    JOptionPane.showMessageDialog(this, "The Patient ID is already in use");
                }else{
    //                for(Patient pt1 : mainSystem.getPatientdir().getAllpatient()){
    //                    System.out.println(" ENCOUNTER CREATED " + " " + pt1.getName() + pt1.getContactinfo() + " " + pt1.getEncdir().get(0).getEncounterdate() + " " +  pt1.getEncdir().get(0).getVs().getBp());
    //                }   
                Patient pt = mainSystem.getPatientdir().addNewPatient();        
                pt.setContactinfo(con);
                pt.setName(name);
                pt.setPatienid(id1);

                Encounter enc = new Encounter();
                enc.setEncountercomments(co);
                enc.setEncounterdate(dt);
                enc.setEncounterid(id2);


                VitalSigns vs = new VitalSigns();
                vs.setBp(bp);
                vs.setBt(bt);
                vs.setRr(rr);        
                enc.setVs(vs);

                pt.getEncdir().add(enc);    
                datechooser.setDate(datex);
                txtPatientid.setText("");
                txtrr.setText("");
                txtbp.setText("");
                txtbt.setText("");
                txtPatientid.setText("");
                txtContact.setText("");
                txtComments.setText("");
                txtEncid.setText("");

                popPatients();

                }

            }else{
                JOptionPane.showMessageDialog(this,"The Vital Signs are Incorrect");
            }            
            
        }else{
            JOptionPane.showMessageDialog(this, "Please Fill all the fields");
        }

        

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactKeyPressed

    private void txtbtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtKeyTyped

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        
    }//GEN-LAST:event_txtContactKeyTyped

    private void txtPatientidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientidKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        
    }//GEN-LAST:event_txtPatientidKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int SelectedRow = tblRecords.getSelectedRow();
        if(SelectedRow<0){
            JOptionPane.showMessageDialog(this, "Please Select a row");
        }else{
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            DefaultTableModel m2 = (DefaultTableModel)tblRecords.getModel();
            Patient SelectedRecords = (Patient) m2.getValueAt(SelectedRow, 0);
            txtPatientid.setText(String.valueOf(SelectedRecords.getPatienid()));
            popPatients1(SelectedRecords.getName());
            mainSystem.getPatientdir().deletePatient(SelectedRecords);
            txtContact.setText(String.valueOf(SelectedRecords.getContactinfo()));
            txtrr.setText(String.valueOf(SelectedRecords.getEncdir().get(SelectedRow).getVs().getRr()));
            txtbp.setText(String.valueOf(SelectedRecords.getEncdir().get(SelectedRow).getVs().getBp()));
            txtbt.setText(String.valueOf(SelectedRecords.getEncdir().get(SelectedRow).getVs().getBt()));
            txtComments.setText(SelectedRecords.getEncdir().get(SelectedRow).getEncountercomments());
            txtEncid.setText(String.valueOf(SelectedRecords.getEncdir().get(SelectedRow).getEncounterid()));
            datechooser.setDate((SelectedRecords.getEncdir().get(SelectedRow).getEncounterdate()));
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean b1 = rolecheck();
        System.out.println("ONLY ADMIN CAN DO THIS " + b1);
        int SelectedRow = tblRecords.getSelectedRow();
        if(SelectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        if(b1){
            DefaultTableModel m2 = (DefaultTableModel)tblRecords.getModel();
            Patient SelectedRecords = (Patient) m2.getValueAt(SelectedRow, 0);
            mainSystem.getPatientdir().deletePatient(SelectedRecords);//.deleteHospital(SelectedRecords.getAllhospitals().get(SelectedRow));
            JOptionPane.showMessageDialog(this,"Selected row has been deleted");
            popTable();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnpopulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpopulateActionPerformed
        // TODO add your handling code here:
        popTable();
    }//GEN-LAST:event_btnpopulateActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtPatientidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientidActionPerformed

    private void txtCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxPatient;
    private javax.swing.JButton btnpopulate;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecords;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEncid;
    private javax.swing.JTextField txtPatientid;
    private javax.swing.JTextField txtbp;
    private javax.swing.JTextField txtbt;
    private javax.swing.JTextField txtrr;
    // End of variables declaration//GEN-END:variables
    public void popPatients(){
        ComboBoxPatient.removeAllItems();
        ComboBoxPatient.addItem("");
        for(Person ps : mainSystem.getPersondir().getAllpeople()){
            ComboBoxPatient.addItem(ps.getName());
        }
    }
    
    public void popPatients1(String name){
        ComboBoxPatient.removeAllItems();
        ComboBoxPatient.addItem(name);
        for(Person ps : mainSystem.getPersondir().getAllpeople()){
            ComboBoxPatient.addItem(ps.getName());
        }
    }
    
    private void popTable() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        tblRecords.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
        DefaultTableModel m1 = (DefaultTableModel)tblRecords.getModel();
        m1.setRowCount(0);
        for(Patient Cs: this.mainSystem.getPatientdir().getAllpatient()){
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
           Object[] row = new Object[9];
           row[0] = Cs;
           row[1] = Cs.getPatienid();
           row[2] = Cs.getContactinfo();
           for(Encounter enc : Cs.getEncdir()){
            row[3] = enc.getVs().getBt();
            row[4] = enc.getVs().getRr();
            row[5] = enc.getVs().getBp();
            row[6] = dateFormat.format(enc.getEncounterdate());
            row[7] = enc.getEncounterid();
            row[8] = enc.getEncountercomments();   
            m1.addRow(row);
           }


        }
    }
}
