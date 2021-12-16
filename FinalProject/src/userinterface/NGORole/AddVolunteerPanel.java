/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.NGOVolunteer.Volunteer;
import Business.NGOVolunteer.VolunteerDirectory;
import Business.Role.DeliveryVolunteer;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aravindasagiraju
 */
public class AddVolunteerPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddVolunteerPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory uad;
    VolunteerDirectory vold;
    String ngoName;
    public AddVolunteerPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if(ecosystem.getVolDir() == null){
              ecosystem.setVolDir(new VolunteerDirectory());
          }
        setBG();
        ngoName=userAcc.getEmployee().getName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddVolTitle = new javax.swing.JLabel();
        lblVolname = new javax.swing.JLabel();
        txtVolname = new javax.swing.JTextField();
        lblVolPhno = new javax.swing.JLabel();
        txtVolPhno = new javax.swing.JTextField();
        lblVolAdd = new javax.swing.JLabel();
        txtVolAdd = new javax.swing.JTextField();
        lblVolCity = new javax.swing.JLabel();
        txtVolCity = new javax.swing.JTextField();
        lblVolState = new javax.swing.JLabel();
        txtVolState = new javax.swing.JTextField();
        lblVolZip = new javax.swing.JLabel();
        txtVolZip = new javax.swing.JTextField();
        lblVolExp = new javax.swing.JLabel();
        txtVolExp = new javax.swing.JTextField();
        lblVoluname = new javax.swing.JLabel();
        txtVoluname = new javax.swing.JTextField();
        lblVolpwd = new javax.swing.JLabel();
        txtVolpwd = new javax.swing.JTextField();
        lblVolcopwd1 = new javax.swing.JLabel();
        txtVolcopwd1 = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblVolid = new javax.swing.JLabel();
        txtVolid = new javax.swing.JTextField();
        lblVolage = new javax.swing.JLabel();
        txtVolage = new javax.swing.JTextField();
        lblVolid2 = new javax.swing.JLabel();
        lblVolname1 = new javax.swing.JLabel();
        lblVolPhno1 = new javax.swing.JLabel();
        lblVolZip1 = new javax.swing.JLabel();
        lblVolpwd2 = new javax.swing.JLabel();
        lblVolAdmin1 = new javax.swing.JLabel();
        LabelImg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddVolTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblAddVolTitle.setForeground(new java.awt.Color(51, 153, 255));
        lblAddVolTitle.setText("Add Volunteer");
        add(lblAddVolTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 6, -1, -1));

        lblVolname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolname.setText("Volunteer Name");
        add(lblVolname, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 104, -1, -1));

        txtVolname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolnameFocusLost(evt);
            }
        });
        txtVolname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolnameActionPerformed(evt);
            }
        });
        add(txtVolname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 137, -1));

        lblVolPhno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolPhno.setText("Phone Number");
        add(lblVolPhno, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 190, -1, -1));

        txtVolPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolPhno.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolPhno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolPhnoFocusLost(evt);
            }
        });
        add(txtVolPhno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 186, 137, -1));

        lblVolAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolAdd.setText("Address");
        add(lblVolAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 233, -1, -1));

        txtVolAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolAddActionPerformed(evt);
            }
        });
        add(txtVolAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 229, 137, -1));

        lblVolCity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolCity.setText("City");
        add(lblVolCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 276, -1, -1));

        txtVolCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 272, 137, -1));

        lblVolState.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolState.setText("State");
        add(lblVolState, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 319, -1, -1));

        txtVolState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolState, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 315, 137, -1));

        lblVolZip.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolZip.setText("Zipcode");
        add(lblVolZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 362, -1, -1));

        txtVolZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolZipFocusLost(evt);
            }
        });
        add(txtVolZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 358, 137, -1));

        lblVolExp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolExp.setText("Volunteer Experience");
        add(lblVolExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 405, -1, -1));

        txtVolExp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolExp.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolExp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolExpFocusLost(evt);
            }
        });
        txtVolExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolExpActionPerformed(evt);
            }
        });
        add(txtVolExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 401, 137, -1));

        lblVoluname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVoluname.setText("Volunteer Username");
        add(lblVoluname, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 448, -1, -1));

        txtVoluname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVoluname.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVoluname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 444, 137, -1));

        lblVolpwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolpwd.setText("Password");
        add(lblVolpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 491, -1, -1));

        txtVolpwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 487, 137, -1));

        lblVolcopwd1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolcopwd1.setText("Confirm Password");
        add(lblVolcopwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 534, -1, -1));

        txtVolcopwd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolcopwd1.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolcopwd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolcopwd1FocusLost(evt);
            }
        });
        add(txtVolcopwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 137, -1));

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 573, -1, -1));

        lblVolid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolid.setText("Volunteer Id");
        add(lblVolid, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 61, -1, -1));

        txtVolid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolid.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolidFocusLost(evt);
            }
        });
        txtVolid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVolidKeyReleased(evt);
            }
        });
        add(txtVolid, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 57, 134, -1));

        lblVolage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolage.setText("Volunteer Age");
        add(lblVolage, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 147, -1, -1));

        txtVolage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolage.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolageFocusLost(evt);
            }
        });
        add(txtVolage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 143, 137, -1));
        add(lblVolid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 57, -1, -1));
        add(lblVolname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 100, -1, -1));
        add(lblVolPhno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 186, -1, -1));
        add(lblVolZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 358, -1, -1));
        add(lblVolpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 530, -1, -1));
        add(lblVolAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 401, -1, -1));
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 6, 1390, 790));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1650, 850, java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(AddVolunteerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtVolnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolnameFocusLost
        // TODO add your handling code here:
        if(!(txtVolname.getText().matches("^[a-zA-Z]*$"))){
            lblVolname1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblVolname1.setText("");
        }
    }//GEN-LAST:event_txtVolnameFocusLost

    private void txtVolPhnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolPhnoFocusLost
        // TODO add your handling code here:
        if(!(txtVolPhno.getText().matches("^[0-9]*$")) || !(txtVolPhno.getText().length()==10)) {
            lblVolPhno1.setText("Please enter a valid phone number");
        }
        else{
            lblVolPhno1.setText("");

        }
    }//GEN-LAST:event_txtVolPhnoFocusLost

    private void txtVolAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolAddActionPerformed

    private void txtVolZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolZipFocusLost
        // TODO add your handling code here:
        if((txtVolZip.getText().matches("^[a-zA-Z]*$"))){
            lblVolZip1.setText("Invalid input. Please enter only numbers");
        }
        else{
            lblVolZip1.setText("");
        }
    }//GEN-LAST:event_txtVolZipFocusLost

    private void txtVolExpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolExpFocusLost
        // TODO add your handling code here:
//        if(!(txtVolExp.getText().matches("^[a-zA-Z]*$"))){
//            lblVolAdmin1.setText("Invalid input. Please enter only alphabets.");
//        }
//        else{
//            lblVolAdmin1.setText("");
//        }
    }//GEN-LAST:event_txtVolExpFocusLost

    private void txtVolcopwd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolcopwd1FocusLost
        // TODO add your handling code here:
//        if(!(txtVolpwd.getText().equals(txtVolcopwd1.getText()))){
//            lblVolpwd2.setText("Password Mismatch. Please verify the password entered.");
//        }
//        else{
//            lblVolpwd2.setText("");
//        }
    }//GEN-LAST:event_txtVolcopwd1FocusLost

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
            if(chkpwd()){
            UserAccountDirectory uaList = ecosystem.getUserAccountDirectory();
            Employee employee = new Employee();
            employee.setName(txtVolname.getText());
            String role = "Volunteer";
            Volunteer vol = new Volunteer();
            vol.setVolId("volunteer"+txtVolid.getText());
            vol.setVolName(txtVolname.getText());
            vol.setVolAge(txtVolage.getText());
            vol.setVolPhno(txtVolPhno.getText());
            vol.setVolAddress(txtVolAdd.getText());
            vol.setVolCity(txtVolCity.getText());
            vol.setVolState(txtVolState.getText());
            vol.setVolZipcode(txtVolZip.getText());
            vol.setVolExp(txtVolExp.getText());
            UserAccount volAccount=new UserAccount();
            volAccount.setUsername(txtVoluname.getText());
            volAccount.setPassword(txtVolpwd.getText());
            // uaList.createUserAccount(txtFCAuname.getText(), txtFCApwd.getText(), employee, new FCAdminRole());
            //                ua = usersList.getUserAccount(txtUserName.getText());

            volAccount.setRole(new DeliveryVolunteer());
            volAccount.setEmployee(employee);
            vol.setVolAvail("New");
            vol.setVolNGO(ngoName);
            uad=ecosystem.getUserAccountDirectory();
            uad.createUserAccount(txtVoluname.getText(), txtVolpwd.getText(), employee, new DeliveryVolunteer());
            ecosystem.setUserAccountDirectory(uad);
            vol.setVolAccount(volAccount);
            vold = ecosystem.getVolDir();
            vold.addNewVolunteer(vol);
            ecosystem.setVolDir(vold);
            JOptionPane.showMessageDialog(this, "Volunteer added successfully!");
            clearfields();
            }
            else{
                JOptionPane.showMessageDialog(this, "Password Mismatch. Please verify the password entered.");  
              txtVolcopwd1.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtVolidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolidFocusLost
        // TODO add your handling code here:
        if((txtVolid.getText().matches("^[a-zA-Z]*$"))){
            lblVolid2.setText("Invalid input. Please enter only numbers");
        }
        else{
            lblVolid2.setText("");
        }
    }//GEN-LAST:event_txtVolidFocusLost

    private void txtVolidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVolidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolidKeyReleased

    private void txtVolageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolageFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolageFocusLost

    private void txtVolExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolExpActionPerformed

    private void txtVolnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolnameActionPerformed
 
    private boolean nullCheck() {
        if(txtVolid.getText().length()!=0 && txtVolname.getText().length()!=0 && 
                txtVolPhno.getText().length()!=0 && txtVolAdd.getText().length()!=0 && txtVolCity.getText().length()!=0 && 
                txtVolState.getText().length()!=0 && txtVolZip.getText().length()!=0 && txtVolExp.getText().length()!=0 && 
                txtVoluname.getText().length()!=0 && txtVolpwd.getText().length()!=0 && txtVolcopwd1.getText().length()!=0)
            {
                return false;
            }
            else return true;
     }
    
    private void clearfields() {
        txtVolname.setText("");
        txtVolPhno.setText("");
        txtVolAdd.setText("");
        txtVolCity.setText("");
        txtVolState.setText("");
        txtVolZip.setText("");
        txtVolExp.setText("");
        txtVoluname.setText("");
        txtVolage.setText("");
        txtVolpwd.setText("");
        txtVolcopwd1.setText("");
        txtVolid.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAddVolTitle;
    private javax.swing.JLabel lblVolAdd;
    private javax.swing.JLabel lblVolAdmin1;
    private javax.swing.JLabel lblVolCity;
    private javax.swing.JLabel lblVolExp;
    private javax.swing.JLabel lblVolPhno;
    private javax.swing.JLabel lblVolPhno1;
    private javax.swing.JLabel lblVolState;
    private javax.swing.JLabel lblVolZip;
    private javax.swing.JLabel lblVolZip1;
    private javax.swing.JLabel lblVolage;
    private javax.swing.JLabel lblVolcopwd1;
    private javax.swing.JLabel lblVolid;
    private javax.swing.JLabel lblVolid2;
    private javax.swing.JLabel lblVolname;
    private javax.swing.JLabel lblVolname1;
    private javax.swing.JLabel lblVolpwd;
    private javax.swing.JLabel lblVolpwd2;
    private javax.swing.JLabel lblVoluname;
    private javax.swing.JTextField txtVolAdd;
    private javax.swing.JTextField txtVolCity;
    private javax.swing.JTextField txtVolExp;
    private javax.swing.JTextField txtVolPhno;
    private javax.swing.JTextField txtVolState;
    private javax.swing.JTextField txtVolZip;
    private javax.swing.JTextField txtVolage;
    private javax.swing.JTextField txtVolcopwd1;
    private javax.swing.JTextField txtVolid;
    private javax.swing.JTextField txtVolname;
    private javax.swing.JTextField txtVolpwd;
    private javax.swing.JTextField txtVoluname;
    // End of variables declaration//GEN-END:variables

    private boolean chkpwd() {
        if(txtVolpwd.getText().equals(txtVolcopwd1.getText())){
            return true;
        }
        else{
            return false;
        }
    }
}
