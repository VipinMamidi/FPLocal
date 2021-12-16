/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.NGORole;

import Business.EcoSystem;
import Business.NGO.NGO;
import Business.NGOVolunteer.VolRequests;
import Business.NGOVolunteer.Volunteer;
import Business.Reqorder.Reqorder;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sowmyachinimilli
 */
public class RequestsPanel extends javax.swing.JPanel {

    /**
     * Creates new form Requests
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String ngoAName;
    String ngoName="";
    public RequestsPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        ngoAName= userAcc.getEmployee().getName();
        ArrayList<NGO> ngolist = new ArrayList<NGO>();
        for(NGO ng: ngolist){
            if(ng.getNgoAgent().equals(ngoAName)){
                ngoName=ng.getNgoName();
            }
        }
        populateRTable();
        populateVTable();
        //tblV.setVisible(false);
       // btnAvail.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblR = new javax.swing.JTable();
        btnAvail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblV = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        lblAddVolTitle1 = new javax.swing.JLabel();
        lblW = new javax.swing.JLabel();
        lblAddVolTitle2 = new javax.swing.JLabel();
        lblR = new javax.swing.JLabel();

        lblAddVolTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAddVolTitle.setText("Requests from Food Cloud");

        tblR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Request", "Warehouse", "Number of Persons", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblR);

        btnAvail.setText("Make Available");
        btnAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailActionPerformed(evt);
            }
        });

        tblV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Volunteer Id", "Name", "Address", "City", "Zipcode", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblV);

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        lblAddVolTitle1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAddVolTitle1.setText("For Warehouse:");

        lblW.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblAddVolTitle2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAddVolTitle2.setText("Request ID:");

        lblR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAddVolTitle2)
                        .addGap(278, 278, 278)
                        .addComponent(btnProcess))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(lblAddVolTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lblW))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAddVolTitle1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(btnAvail)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddVolTitle)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProcess))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblAddVolTitle2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(lblR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblW)))
                        .addGap(18, 18, 18)
                        .addComponent(lblAddVolTitle1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAvail)
                .addGap(123, 123, 123))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblV.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a request");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblV.getModel();
        Volunteer selectedV = (Volunteer)model.getValueAt(selectedRowIndex, 0);
        if(selectedV.getVolAvail().equals("New")){
        selectedV.setVolAvail("Yes");
        String reqidval=lblR.getText();
        ArrayList<VolRequests> vrList=new ArrayList<VolRequests>();
        for(VolRequests vr: vrList){
            if(vr.getVolreqId().equals(reqidval)){
                vr.setVolreqStatus("Completed");
            }
        }
        JOptionPane.showMessageDialog(this, "Request Completed");
        }
        else if(selectedV.getVolAvail().equals("Yes")){
            JOptionPane.showMessageDialog(this, "This Volunteer is already available");
        }
        else if(selectedV.getVolAvail().equals("No")){
            JOptionPane.showMessageDialog(this, "This Volunteer is currently unavailable");
        }
        populateRTable();
        populateVTable();
    }//GEN-LAST:event_btnAvailActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblR.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a request");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblR.getModel();
        VolRequests selectedVR = (VolRequests)model.getValueAt(selectedRowIndex, 0);
        lblW.setText(selectedVR.getVolreqWH());
        lblR.setText(selectedVR.getVolreqId());
        tblV.setVisible(true);
        btnAvail.setVisible(true);
        populateVTable();
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvail;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddVolTitle;
    private javax.swing.JLabel lblAddVolTitle1;
    private javax.swing.JLabel lblAddVolTitle2;
    private javax.swing.JLabel lblR;
    private javax.swing.JLabel lblW;
    private javax.swing.JTable tblR;
    private javax.swing.JTable tblV;
    // End of variables declaration//GEN-END:variables

    private void populateRTable() {
        DefaultTableModel model = (DefaultTableModel) tblR.getModel();
        model.setRowCount(0);
        for(VolRequests vr: ecosystem.getVRDirectory().getVrList()){
           if(vr.getVolreqName().equals(ngoName)){
           Object[] row = new Object[6];
           row[0] =vr;
           row[1] =vr.getVolreqName();
           row[2] =vr.getVolreqWH();
           row[3] =vr.getVolreqNum();
           row[4] =vr.getVolreqStatus();
           model.addRow(row);
           }
        } 
    }

    private void populateVTable() {
        DefaultTableModel model = (DefaultTableModel) tblV.getModel();
        model.setRowCount(0);
        for(Volunteer vol: ecosystem.getVolDir().getVolunteerList()){
            if(vol.getVolNGO().equals(ngoName)){
           Object[] row = new Object[6];
           row[0] =vol;
           row[1] =vol.getVolName();
           row[2] =vol.getVolAddress();
           row[3] =vol.getVolCity();
           row[4] =vol.getVolZipcode();
           row[5] =vol.getVolAvail();
           model.addRow(row);
            }
        } 
    }
}
