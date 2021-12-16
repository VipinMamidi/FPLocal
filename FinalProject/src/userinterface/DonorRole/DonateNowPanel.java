/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DonorRole;

import Business.Donation.Donation;
import Business.Donation.DonationDirectory;
import Business.Donor.Donor;
import Business.EcoSystem;
import Business.FCWarehouse.FCWarehouse;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sowmyachinimilli
 */
public class DonateNowPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonateNowPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String donUName;
    String donName;
    String donState;
    DonationDirectory donatD;
    public DonateNowPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem =ecosystem;
        this.userAcc = userAcc;
        donUName = userAcc.getUsername();
        donName  = userAcc.getEmployee().getName();
        if(ecosystem.getDonatDirectory()== null){
         ecosystem.setDonatDirectory(new DonationDirectory());
        }
        String donState = ecosystem.getDonDir().getdonState(donUName);
        ArrayList<String> CityList = new ArrayList<String>();
        for (FCWarehouse fcw : ecosystem.getFCWDirectory().getFcwList()){
            if(fcw.getFcwState().equals(donState)){
                CityList.add(fcw.getFcwCity());
            }
        }         
        cbCity.setModel(new DefaultComboBoxModel<String>(CityList.toArray(new String[0])));
        
        setBG();
        setLogo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDonProfileTitle = new javax.swing.JLabel();
        lblDfditem = new javax.swing.JLabel();
        lblDfdquan = new javax.swing.JLabel();
        txtDfditem = new javax.swing.JTextField();
        sdQuan = new javax.swing.JSlider();
        lblDonProfileTitle1 = new javax.swing.JLabel();
        chkAdd = new javax.swing.JCheckBox();
        lblDadd = new javax.swing.JLabel();
        txtDadd = new javax.swing.JTextField();
        lblDcity = new javax.swing.JLabel();
        txtDcity = new javax.swing.JTextField();
        lblDstate = new javax.swing.JLabel();
        txtDstate = new javax.swing.JTextField();
        lblDzip = new javax.swing.JLabel();
        txtDzip = new javax.swing.JTextField();
        lblDfdquan2 = new javax.swing.JLabel();
        cbCity = new javax.swing.JComboBox<>();
        lblDfdquan3 = new javax.swing.JLabel();
        cbWH = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        lblDfdquan1 = new javax.swing.JLabel();
        lblDfdquan4 = new javax.swing.JLabel();
        lblDfdquan5 = new javax.swing.JLabel();
        logoImage = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDonProfileTitle.setFont(new java.awt.Font("Georgia", 1, 29)); // NOI18N
        lblDonProfileTitle.setForeground(new java.awt.Color(51, 153, 255));
        lblDonProfileTitle.setText("Donate Food ");
        add(lblDonProfileTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        lblDfditem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDfditem.setText("Food Item :");
        add(lblDfditem, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 151, -1, -1));

        lblDfdquan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDfdquan.setText("Quantity :");
        add(lblDfdquan, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 199, -1, -1));

        txtDfditem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDfditem.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDfditem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDfditemFocusLost(evt);
            }
        });
        add(txtDfditem, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 147, 137, -1));

        sdQuan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sdQuan.setMajorTickSpacing(10);
        sdQuan.setMinimum(10);
        sdQuan.setPaintTicks(true);
        sdQuan.setAutoscrolls(true);
        add(sdQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 190, -1, -1));

        lblDonProfileTitle1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDonProfileTitle1.setText("Pickup Address");
        add(lblDonProfileTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        chkAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chkAdd.setText("Same Address as in Profile");
        chkAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAddActionPerformed(evt);
            }
        });
        add(chkAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        lblDadd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDadd.setText("Address :");
        add(lblDadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, -1, -1));

        txtDadd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDadd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDaddFocusLost(evt);
            }
        });
        add(txtDadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 137, -1));

        lblDcity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDcity.setText("City :");
        add(lblDcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        txtDcity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDcity.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDcity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDcityFocusLost(evt);
            }
        });
        add(txtDcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 137, -1));

        lblDstate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDstate.setText("State :");
        add(lblDstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        txtDstate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDstate.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDstate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDstateFocusLost(evt);
            }
        });
        add(txtDstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 137, -1));

        lblDzip.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDzip.setText("Zipcode :");
        add(lblDzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

        txtDzip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDzip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDzip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDzipFocusLost(evt);
            }
        });
        add(txtDzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 137, -1));

        lblDfdquan2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDfdquan2.setText("City :");
        add(lblDfdquan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        cbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCityActionPerformed(evt);
            }
        });
        add(cbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 150, -1));

        lblDfdquan3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDfdquan3.setText("Nearest Warehouse :");
        add(lblDfdquan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        cbWH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbWH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbWHActionPerformed(evt);
            }
        });
        add(cbWH, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 150, -1));

        btnSubmit.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnSubmit.setText("Donate");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));

        lblDfdquan1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDfdquan1.setText("Min 10");
        add(lblDfdquan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 230, -1, -1));

        lblDfdquan4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDfdquan4.setText("Max 100");
        add(lblDfdquan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 230, -1, -1));

        lblDfdquan5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDfdquan5.setText("persons");
        add(lblDfdquan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 199, -1, -1));
        add(logoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 18, 102, 104));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 850));
    }// </editor-fold>//GEN-END:initComponents

      public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(1500, 1000));
            LabelImage.setPreferredSize(new Dimension(1500, 1000));
            LabelImage.setMaximumSize(new Dimension(1500, 1000));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(2500, 1000, java.awt.Image.SCALE_SMOOTH);
            LabelImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setLogo() {
        try {
            logoImage.setMinimumSize(new Dimension(100, 100));
            logoImage.setPreferredSize(new Dimension(100, 100));
            logoImage.setMaximumSize(new Dimension(100, 100));

            Image img = ImageIO.read(getClass().getResource("/Images/cmnlogo.jpeg"));

            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            logoImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtDfditemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDfditemFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDfditemFocusLost

    private void txtDaddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDaddFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtDaddFocusLost

    private void txtDcityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDcityFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtDcityFocusLost

    private void txtDstateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDstateFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtDstateFocusLost

    private void txtDzipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDzipFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtDzipFocusLost

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
            Donation dt= new Donation();
            dt.setDonatId("1");
            dt.setDonatDname(donName);
            dt.setDonatFooditem(txtDfditem.getText());
            dt.setDonatFoodQuant(String.valueOf(sdQuan.getValue()));
            dt.setDonatPickuptype("Pick up");
            dt.setDonatStatus("Requested");
            dt.setDonatWHname(cbWH.getSelectedItem().toString());
            UserAccount ua=new UserAccount();
            ua.setUsername(userAcc.getUsername());
            ua.setPassword(userAcc.getPassword());
            dt.setDonatDonorAcc(ua);
            dt.setDonatAdd(txtDadd.getText());
            dt.setDonatCity(txtDcity.getText());
            donatD = ecosystem.getDonatDirectory();
            donatD.addNewDonation(dt);
            ecosystem.setDonatDirectory(donatD);

            JOptionPane.showMessageDialog(this, "Thank you for your Donation! \n Your request has been placed. ");
            clearfields();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCityActionPerformed
        // TODO add your handling code here:
        String city=cbCity.getSelectedItem().toString();
        ArrayList<String> whList = new ArrayList<String>();
        for (FCWarehouse fcw : ecosystem.getFCWDirectory().getFcwList()){
            if(fcw.getFcwCity().equals(city)){
                whList.add(fcw.getFcwName());
            }
        }         
        cbWH.setModel(new DefaultComboBoxModel<String>(whList.toArray(new String[0])));
    }//GEN-LAST:event_cbCityActionPerformed

    private void chkAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAddActionPerformed
        // TODO add your handling code here:
        if(chkAdd.isSelected()){
            for(Donor d: ecosystem.getDonDir().getDonorList()){
                if(d.getDonUserName().equals(donUName)){
                    txtDadd.setText(d.getDonorAddres());
                    txtDcity.setText(d.getDonorCity());
                    txtDstate.setText(d.getDonorState());
                    txtDzip.setText(d.getDonorZipcode());
                }
            }
        }
        else{
            txtDadd.setText("");
            txtDcity.setText("");
            txtDstate.setText("");
            txtDzip.setText("");
        }
    }//GEN-LAST:event_chkAddActionPerformed

    private void cbWHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbWHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbWHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbCity;
    private javax.swing.JComboBox<String> cbWH;
    private javax.swing.JCheckBox chkAdd;
    private javax.swing.JLabel lblDadd;
    private javax.swing.JLabel lblDcity;
    private javax.swing.JLabel lblDfditem;
    private javax.swing.JLabel lblDfdquan;
    private javax.swing.JLabel lblDfdquan1;
    private javax.swing.JLabel lblDfdquan2;
    private javax.swing.JLabel lblDfdquan3;
    private javax.swing.JLabel lblDfdquan4;
    private javax.swing.JLabel lblDfdquan5;
    private javax.swing.JLabel lblDonProfileTitle;
    private javax.swing.JLabel lblDonProfileTitle1;
    private javax.swing.JLabel lblDstate;
    private javax.swing.JLabel lblDzip;
    private javax.swing.JLabel logoImage;
    private javax.swing.JSlider sdQuan;
    private javax.swing.JTextField txtDadd;
    private javax.swing.JTextField txtDcity;
    private javax.swing.JTextField txtDfditem;
    private javax.swing.JTextField txtDstate;
    private javax.swing.JTextField txtDzip;
    // End of variables declaration//GEN-END:variables

    private boolean nullCheck() {
        if(txtDfditem.getText().length()!=0 && txtDadd.getText().length()!=0 && txtDcity.getText().length()!=0 && 
                txtDstate.getText().length()!=0 && txtDzip.getText().length()!=0 )
        {
            return false;
        }
        else return true;
    }

    private void clearfields() {
        txtDfditem.setText("");
        txtDadd.setText("");
        txtDcity.setText("");
        txtDstate.setText("");
        txtDzip.setText("");
        cbCity.setSelectedIndex(0);
        cbWH.setSelectedIndex(0);
        sdQuan.setExtent(0);
        chkAdd.setSelected(false);
        cbCity.setSelectedIndex(0);
        cbWH.setSelectedIndex(0);
    }
}
