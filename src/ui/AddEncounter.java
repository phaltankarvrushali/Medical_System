/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import model.Doctor;
import model.Encounter;
import model.Patient;
import util.DataStore;

/**
 *
 * @author vrushaliphaltankar
 */
public class AddEncounter extends javax.swing.JFrame {

    Patient patient;
    Doctor doctor;
    /**
     * Creates new form AddEncounter
     */
    public AddEncounter() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    public AddEncounter(Doctor doctor, Patient patient) {
        this.patient = patient;
        this.doctor = doctor;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jLabel1.setVerticalAlignment(SwingConstants.CENTER);
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Add an Encounter for Mr/Ms." + patient.getFirstName() + " "+ patient.getLastName());
        
        txtBpm.setText("");
        txtDiastolicPressure.setText("");
        txtSystolicPressure.setText("");
        txtWeight.setText("");
        txttemperature.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBpm = new javax.swing.JTextField();
        txtSystolicPressure = new javax.swing.JTextField();
        txtDiastolicPressure = new javax.swing.JTextField();
        txttemperature = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Heart Rate");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Systolic Pressure");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Diastolic Pressure");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Temperature");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Weight");

        txtBpm.setText("jTextField1");

        txtSystolicPressure.setText("jTextField2");

        txtDiastolicPressure.setText("jTextField3");

        txttemperature.setText("jTextField4");

        txtWeight.setText("jTextField5");

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Add Encounter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBpm, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(txtSystolicPressure)
                            .addComponent(txtDiastolicPressure)
                            .addComponent(txttemperature)
                            .addComponent(txtWeight)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jButton1)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBpm, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSystolicPressure, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiastolicPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String regex = "[0-9]*\\.?[0-9]*";
       Pattern pattern = Pattern.compile(regex);
       
       String bpm = txtBpm.getText();
       Matcher matcher = pattern.matcher(bpm);
       if(null == bpm || bpm.isEmpty())
       {
           JOptionPane.showMessageDialog(jPanel1, "It is a mandatory field");  
           cleartxtField();
           return;
            
       }
       if(!matcher.matches())
       {
            JOptionPane.showMessageDialog(jPanel1, "Heart rate cannot have any Alphabets");  
            cleartxtField();
            return;
       }
       String diasPressure = txtDiastolicPressure.getText();
       matcher = pattern.matcher(diasPressure);
       if(null == diasPressure || diasPressure.isEmpty())
       {
           JOptionPane.showMessageDialog(jPanel1, "It is a mandatory field");  
           cleartxtField();
           return;
            
       }
       if(!matcher.matches())
       {
            JOptionPane.showMessageDialog(jPanel1, "Blood Pressure cannot have any Alphabets");  
            cleartxtField();
            return;
       }
       
       String sysPressure = txtSystolicPressure.getText();
       matcher = pattern.matcher(sysPressure);
       if(null == sysPressure || sysPressure.isEmpty())
       {
           JOptionPane.showMessageDialog(jPanel1, "It is a mandatory field");  
           cleartxtField();
           return;
            
       }
       if(!matcher.matches())
       {
            JOptionPane.showMessageDialog(jPanel1, "Blood Pressure cannot have any Alphabets");  
            cleartxtField();
            return;
       }
       
       String temperature = txttemperature.getText();
       matcher = pattern.matcher(temperature);
       if(null == temperature || temperature.isEmpty())
       {
           JOptionPane.showMessageDialog(jPanel1, "It is a mandatory field");  
           cleartxtField();
           return;
            
       }
       if(!matcher.matches())
       {
            JOptionPane.showMessageDialog(jPanel1, "temperature cannot have any Alphabets");  
            cleartxtField();
            return;
       }
       
       String weight = txtWeight.getText();
       matcher = pattern.matcher(weight);
       if(null == weight || weight.isEmpty())
       {
           JOptionPane.showMessageDialog(jPanel1, "It is a mandatory field");  
           cleartxtField();
           return;
            
       }
       if(!matcher.matches())
       {
            JOptionPane.showMessageDialog(jPanel1, "weight cannot have any Alphabets");  
            cleartxtField();
            return;
       }
       
        Encounter encounter = new Encounter();
        encounter.setBpm(bpm);
        encounter.setDiastolic(diasPressure);
        encounter.setSystolic(sysPressure);
        encounter.setWeight(weight);
        encounter.setTemperature(temperature);
        encounter.setEncounterDate(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));
        
        if(null == patient.getEncounterHistory().getDoctorToEncounterList().get(doctor) || patient.getEncounterHistory().getDoctorToEncounterList().get(doctor).isEmpty())
        {
            CopyOnWriteArrayList <Encounter> encounterList = new CopyOnWriteArrayList <>();
            encounterList.add(encounter);
            
            patient.getEncounterHistory().getDoctorToEncounterList().put(doctor, encounterList);
            
        }
        else
        {
            int id = (new Integer(patient.getEncounterHistory().getDoctorToEncounterList()
                    .get(doctor).get(patient.getEncounterHistory().getDoctorToEncounterList()
                    .get(doctor).size()-1).getId())+1);
            
            encounter.setId(String.valueOf(id));
            DataStore.getInstance().getEncounterIdToEncouter().put(encounter.getId(), encounter);
            patient.getEncounterHistory().getDoctorToEncounterList().get(doctor).add(encounter);
        }
        
        JOptionPane.showMessageDialog(jPanel1, "Encounter Added successfully");
        
        this.setVisible(false);
        new PatientForm(patient, doctor).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cleartxtField()
    {
        txtBpm.setText("");
        txtDiastolicPressure.setText("");
        txtSystolicPressure.setText("");
        txtWeight.setText("");
        txttemperature.setText("");
        
    }
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
            java.util.logging.Logger.getLogger(AddEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEncounter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBpm;
    private javax.swing.JTextField txtDiastolicPressure;
    private javax.swing.JTextField txtSystolicPressure;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txttemperature;
    // End of variables declaration//GEN-END:variables
}
