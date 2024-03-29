/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import model.Community;
import model.Doctor;
import model.DoctorDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import util.DataStore;

/**
 *
 * @author vrushaliphaltankar
 */
public class AddUser extends javax.swing.JFrame {

        String firstName;
        String lastName;
        String street;
        String apartment;
        String zipCode;
        String phoneNumber;
        String emailId;
        String username;
        String community;
        String type;
    /**
     * Creates new form UpdateUserForm
     */
    public AddUser()
    {
        initComponents();
        setResizable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        jLabel1.setVerticalAlignment(SwingConstants.CENTER);
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        
        txtFirstName.setText("");
        txtLastName.setText("");
        txtStreet.setText("");
        txtApartmentNumber.setText("");
        txtZipCode.setText("");
        txtPhoneNumber.setText("");
        txtEmailId.setText("");
        
        for(String community : DataStore.getInstance().getSystem().getCommunityDirectory().getCommunityNameToCommunity().keySet())
        {
        jComboBox2.addItem(community);
        }
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtApartmentNumber = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        btnUpdateUser = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Create New User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Street");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Apartment Number");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Zip Code");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Phone Number");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Email Id");

        txtFirstName.setText("jTextField1");

        txtLastName.setText("jTextField2");

        txtStreet.setText("jTextField3");
        txtStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetActionPerformed(evt);
            }
        });

        txtApartmentNumber.setText("jTextField4");
        txtApartmentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApartmentNumberActionPerformed(evt);
            }
        });

        txtZipCode.setText("jTextField5");

        txtPhoneNumber.setText("jTextField6");
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        txtEmailId.setText("jTextField7");

        btnUpdateUser.setBackground(new java.awt.Color(102, 153, 255));
        btnUpdateUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdateUser.setText("Add User");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Community");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("User Type");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "Hospital Admin", "Community Admin" }));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("User Name");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(txtLastName)
                            .addComponent(txtStreet)
                            .addComponent(txtApartmentNumber)
                            .addComponent(txtZipCode)
                            .addComponent(txtPhoneNumber)
                            .addComponent(txtEmailId)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(btnUpdateUser)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtApartmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnUpdateUser)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        this.firstName = txtFirstName.getText();
        this.lastName = txtLastName.getText();
        this.street = txtStreet.getText();
        this.apartment = txtApartmentNumber.getText();
        this.zipCode = txtZipCode.getText();
        this.phoneNumber = txtPhoneNumber.getText();
        this.emailId = txtEmailId.getText();
        this.community = jComboBox2.getSelectedItem().toString();
        this.type = jComboBox1.getSelectedItem().toString();
        this.username = jTextField2.getText();
        
        if(null == firstName || firstName.isEmpty() || null == lastName || lastName.isEmpty()
            ||null == emailId || emailId.isEmpty() || null == phoneNumber || phoneNumber.isEmpty() ||
            null == zipCode || zipCode.isEmpty() || null == apartment || apartment.isEmpty() || null == street || street.isEmpty()
            || null == username || username.isEmpty() || null == community || community.isEmpty())
        {
            JOptionPane.showMessageDialog(jPanel1, "Details cannot be empty"); 
            return;
        }
        
        if((DataStore.getInstance().getSystem().getPersonDirectory().getUsernameToUser().get(this.username)) != null)
        {
            JOptionPane.showMessageDialog(jPanel1, "User with given username already exist in the system"); 
            dispose();
            return;
        }
        
        String regex = "^[a-zA-Z]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if(!matcher.matches())
        {
            JOptionPane.showMessageDialog(jPanel1, "Invalid First Name"); 
            return;
        }
        
        matcher = pattern.matcher(lastName);
        if(!matcher.matches())
        {
            JOptionPane.showMessageDialog(jPanel1, "Invalid Last Name"); 
            return;
        }
        
        matcher = pattern.matcher(username);
        if(!matcher.matches())
        {
            JOptionPane.showMessageDialog(jPanel1, "Invalid user name"); 
            return;
        }
        
        String regexStreet = "^[a-zA-Z0-9 ]*$";
        Pattern pattern1 = Pattern.compile(regexStreet);
        matcher = pattern1.matcher(street);
        if(!matcher.matches())
        {
            JOptionPane.showMessageDialog(jPanel1, "Invalid street"); 
            return;
        }
        
        matcher = pattern1.matcher(community);
        if(!matcher.matches())
        {
            JOptionPane.showMessageDialog(jPanel1, "Invalid community"); 
            return;
        }
        
        String regexPattern = "^(.+)@(\\S+)$";
        pattern = Pattern.compile(regexPattern);
        matcher = pattern.matcher(emailId);
        if(!matcher.matches())
        {
            JOptionPane.showMessageDialog(jPanel1, "Invalid Email Id"); 
            return;
        }
        
        regexPattern = "^[0-9]*$";
        pattern = Pattern.compile(regexPattern);
        matcher = pattern.matcher(phoneNumber);
        if(!matcher.matches())
        {
            JOptionPane.showMessageDialog(jPanel1, "Invalid Phone Number"); 
            return;
        }
        
        if(phoneNumber.length() != 10) {
        
            JOptionPane.showMessageDialog(jPanel1, "Phone number must be of 10 digits"); 
            return;   
        }
        
        matcher = pattern.matcher(apartment);
        if(!matcher.matches())
        {
            JOptionPane.showMessageDialog(jPanel1, "Invalid apartment"); 
            return;
        }
        
        pattern = Pattern.compile(regexPattern);
        matcher = pattern.matcher(zipCode);
        if(!matcher.matches())
        {
            JOptionPane.showMessageDialog(jPanel1, "Invalid zip Code");
            return;
        }
        
        if(zipCode.length() != 5) {
        
            JOptionPane.showMessageDialog(jPanel1, "Zip code must be of 5 digits"); 
            return;   
        }
        
        updateAllDirectories();
        
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void txtApartmentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApartmentNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApartmentNumberActionPerformed

    private void txtStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void updateAllDirectories()
    {

        if(this.type.equals("Patient"))
        {
            Patient user = new Patient();
        user.setEmailId(this.emailId);
        user.setPhoneNumber(this.phoneNumber);
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.getAddress().setApartmentNumber(apartment);
        user.getAddress().setStreetName(this.street);
        user.getAddress().setZipcode(this.zipCode);
        
        user.setCommunity(DataStore.getInstance().getSystem().getCommunityDirectory().getCommunityNameToCommunity().get(this.community));
        user.setUserName(this.username);
            String userId = String.valueOf(Integer.valueOf(DataStore.patientId)+1);
            user.setUserId(userId);
            user.setRole(DataStore.getInstance().getRoleNameToRole().get("PatientRole"));
            updatePatientDirectories(user);
            
            this.dispose();
            new AllUsersPage().setVisible(true);
        
        }
        
        if(this.type.equals("Community Admin"))
        {
            Person user = new Person();
        user.setEmailId(this.emailId);
        user.setPhoneNumber(this.phoneNumber);
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.getAddress().setApartmentNumber(apartment);
        user.getAddress().setStreetName(this.street);
        user.getAddress().setZipcode(this.zipCode);
        
        user.setCommunity(DataStore.getInstance().getSystem().getCommunityDirectory().getCommunityNameToCommunity().get(this.community));
        user.setUserName(this.username);
            user.setRole(DataStore.getInstance().getRoleNameToRole().get("CommunityAdminRole"));
            DataStore.getInstance().getSystem().getPersonDirectory().getUsernameToUser().put(user.getUserName(), user);
        }
        
        if(this.type.equals("Hospital Admin"))
        {
            Person user = new Person();
        user.setEmailId(this.emailId);
        user.setPhoneNumber(this.phoneNumber);
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.getAddress().setApartmentNumber(apartment);
        user.getAddress().setStreetName(this.street);
        user.getAddress().setZipcode(this.zipCode);
        
        user.setCommunity(DataStore.getInstance().getSystem().getCommunityDirectory().getCommunityNameToCommunity().get(this.community));
        user.setUserName(this.username);
            user.setRole(DataStore.getInstance().getRoleNameToRole().get("HospitalAdminRole"));
            DataStore.getInstance().getSystem().getPersonDirectory().getUsernameToUser().put(user.getUserName(), user);
        }
        
        if(this.type.equals("Doctor"))
        {
            Doctor user = new Doctor();
        user.setEmailId(this.emailId);
        user.setPhoneNumber(this.phoneNumber);
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.getAddress().setApartmentNumber(apartment);
        user.getAddress().setStreetName(this.street);
        user.getAddress().setZipcode(this.zipCode);
        
        user.setCommunity(DataStore.getInstance().getSystem().getCommunityDirectory().getCommunityNameToCommunity().get(this.community));
        user.setUserName(this.username);
            String userId = String.valueOf(Integer.valueOf(DataStore.doctorId)+1);
            user.setUserId(userId);
            user.setRole(DataStore.getInstance().getRoleNameToRole().get("DoctorRole"));
            updateDoctorDirectories(user);
            new DoctorToHospital(user).setVisible(true);
            dispose();
        }
        JOptionPane.showMessageDialog(jPanel1, "User added successfully"); 
        dispose();
    }
    
    private void updateDoctorDirectories(Doctor user)
    {
        DoctorDirectory doctorDirectory = DataStore.getInstance().getSystem().getDoctorDirectory();
        doctorDirectory.getDoctorIdToDoctor().put(user.getUserId(), user);
        doctorDirectory.getDoctorNameToDoctor().put(user.getUserName(), user);
        
        CopyOnWriteArrayList<Doctor> doctorList = doctorDirectory.getCommunityNameToDoctors().get(user.getCommunity().getCommunityName());
        
        if(doctorList == null || doctorList.isEmpty())
        {
            doctorList = new CopyOnWriteArrayList<>();
            doctorList.add( user);
        }
        else
        {
            doctorList.add(user);
        }
        
        updatePersonDirectory(user);
        
        dispose();
        new AllUsersPage().setVisible(true);
    }
    
    private void updatePatientDirectories(Patient user)
    {
        
        PatientDirectory patientDirectory = DataStore.getInstance().getSystem().getPatientDirectory();
        patientDirectory.getPatientIdToPatient().put(user.getUserId(),user);
        patientDirectory.getPatientNameToPatient().put(user.getUserName(), user);
                
        updatePersonDirectory(user);
    }
    
    private void updatePersonDirectory(Person user)
    {
        PersonDirectory personDirectory = DataStore.getInstance().getSystem().getPersonDirectory();
        personDirectory.getUsernameToUser().put(user.getUserName(), user);
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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtApartmentNumber;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
