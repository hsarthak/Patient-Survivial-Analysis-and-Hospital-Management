/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import Business.Enterprise.Enterprise;
import Business.Patient.Patients;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Chetan
 */
public class EditPatient extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Patients patients;
    /**
     * Creates new form EditPatient
     */
    public EditPatient(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Patients patients) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.patients = patients;
        valueLabel.setText(enterprise.getName());
        populateFields();
    }
    
    
    public void populateFields(){
        
        NamejTextField1.setText(patients.getName());
        AgejTextField1.setText(patients.getAge().toString());
        WeightjTextField1.setText(patients.getWeight().toString());
        PulsejTextField1.setText(patients.getVitalRecords().getPulse().toString());
        TempjTextField1.setText(patients.getVitalRecords().getTemperature().toString());
        RRatejTextField2.setText(patients.getVitalRecords().getrRate().toString());
        BPressurejTextField1.setText(patients.getVitalRecords().getBloodPreassure());
        CNSjTextField2.setText(patients.getVitalRecords().getCnsExam());
         }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BPressurejTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AgejTextField1 = new javax.swing.JTextField();
        TempjTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        WeightjTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        CNSjTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NamejTextField1 = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RRatejTextField2 = new javax.swing.JTextField();
        PulsejTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        updatejButton2 = new javax.swing.JButton();

        jLabel3.setText("Weight :");

        jLabel7.setText("Blood Pressure :");

        jLabel4.setText("Pulse :");

        jLabel6.setText("Temperature :");

        jLabel1.setText("Name :");

        jLabel2.setText("Age :");

        jLabel8.setText("CNS :");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        jLabel5.setText("Respiratory Rate :");

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        updatejButton2.setText("Update");
        updatejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updatejButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RRatejTextField2)
                                    .addComponent(TempjTextField1)
                                    .addComponent(BPressurejTextField1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(CNSjTextField2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PulsejTextField1)
                                    .addComponent(WeightjTextField1)
                                    .addComponent(AgejTextField1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(valueLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AgejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(WeightjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PulsejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RRatejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TempjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(BPressurejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CNSjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(updatejButton2))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NurseWorkAreaJPanel nwjp = (NurseWorkAreaJPanel) component;
        nwjp.populatePatientsTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updatejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButton2ActionPerformed
        // TODO add your handling code here:
       
        try{
        if(!NamejTextField1.getText().isEmpty() || !AgejTextField1.getText().isEmpty() || 
                !WeightjTextField1.getText().isEmpty() || !PulsejTextField1.getText().isEmpty() || !TempjTextField1.getText().isEmpty()
                || !RRatejTextField2.getText().isEmpty() || !BPressurejTextField1.getText().isEmpty() 
                || !CNSjTextField2.getText().isEmpty()){
              
            
        patients.setName(NamejTextField1.getText());
        patients.setAge(Integer.parseInt(AgejTextField1.getText()));
        patients.setWeight(Integer.parseInt(WeightjTextField1.getText()));
        patients.getVitalRecords().setPulse(Integer.parseInt(PulsejTextField1.getText()));
        patients.getVitalRecords().setTemperature(Integer.parseInt(TempjTextField1.getText()));
        patients.getVitalRecords().setrRate(Integer.parseInt(RRatejTextField2.getText()));
        patients.getVitalRecords().setBloodPreassure(BPressurejTextField1.getText());
        patients.getVitalRecords().setCnsExam(CNSjTextField2.getText());
        
        NamejTextField1.setText("");
        AgejTextField1.setText("");
        WeightjTextField1.setText("");
        PulsejTextField1.setText("");
        TempjTextField1.setText("");
        RRatejTextField2.setText("");
        BPressurejTextField1.setText("");
        CNSjTextField2.setText("");
       
        
        } else{
            JOptionPane.showMessageDialog(null, "Fields cannot be left blank!");
            
    }
        }
        catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Please enter values in digits where required!");
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong. Please try again!");
            
        }
    }//GEN-LAST:event_updatejButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgejTextField1;
    private javax.swing.JTextField BPressurejTextField1;
    private javax.swing.JTextField CNSjTextField2;
    private javax.swing.JTextField NamejTextField1;
    private javax.swing.JTextField PulsejTextField1;
    private javax.swing.JTextField RRatejTextField2;
    private javax.swing.JTextField TempjTextField1;
    private javax.swing.JTextField WeightjTextField1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton updatejButton2;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}