/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Amit
 */
public class OptionsEmpFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddEmp
     */
    public OptionsEmpFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbAddEmp = new javax.swing.JRadioButton();
        jrbSearchEmp = new javax.swing.JRadioButton();
        jrbUpdateEmp = new javax.swing.JRadioButton();
        jrbShowAllEmp = new javax.swing.JRadioButton();
        jrbRemoveEmp = new javax.swing.JRadioButton();
        jrbQuit = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel1.setText("Select your choice");

        jrbAddEmp.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbAddEmp);
        jrbAddEmp.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jrbAddEmp.setText("Add Emp");

        jrbSearchEmp.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbSearchEmp);
        jrbSearchEmp.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jrbSearchEmp.setText("Search Emp");

        jrbUpdateEmp.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbUpdateEmp);
        jrbUpdateEmp.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jrbUpdateEmp.setText("Update Emp");

        jrbShowAllEmp.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbShowAllEmp);
        jrbShowAllEmp.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jrbShowAllEmp.setText("Show All Emp");

        jrbRemoveEmp.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbRemoveEmp);
        jrbRemoveEmp.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jrbRemoveEmp.setText("Remove Emp");

        jrbQuit.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbQuit);
        jrbQuit.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jrbQuit.setText("Quit");

        btnDoTask.setBackground(new java.awt.Color(0, 204, 204));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 0, 0));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbQuit)
                    .addComponent(jrbShowAllEmp)
                    .addComponent(jrbUpdateEmp)
                    .addComponent(jrbSearchEmp)
                    .addComponent(jrbAddEmp)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnDoTask, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbRemoveEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jrbAddEmp)
                .addGap(18, 18, 18)
                .addComponent(jrbSearchEmp)
                .addGap(16, 16, 16)
                .addComponent(jrbUpdateEmp)
                .addGap(18, 18, 18)
                .addComponent(jrbShowAllEmp)
                .addGap(18, 18, 18)
                .addComponent(jrbRemoveEmp)
                .addGap(18, 18, 18)
                .addComponent(jrbQuit)
                .addGap(28, 28, 28)
                .addComponent(btnDoTask)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        if(jrbAddEmp.isSelected())
        {
            AddEmpFrame addEmpFrame=new AddEmpFrame();
            addEmpFrame.setVisible(true);
            this.dispose();
            
        }
       else  if(jrbSearchEmp.isSelected())
        {
            SearchEmpFrame  searchEmpFrame=new  SearchEmpFrame();
             searchEmpFrame.setVisible(true);
            this.dispose();
            
        }
         else if(jrbUpdateEmp.isSelected())
        {
            UpdateEmpFrame updateEmpFrame=new UpdateEmpFrame();
            updateEmpFrame.setVisible(true);
            this.dispose();
            
        }
          else if(jrbShowAllEmp.isSelected())
        {
            ShowAllEmpFrame showAllEmpFrame=new ShowAllEmpFrame();
            showAllEmpFrame.setVisible(true);
            this.dispose();
            
        }
           else if(jrbRemoveEmp.isSelected())
        {
            DeleteEmpFrame removeEmpFrame=new DeleteEmpFrame();
            removeEmpFrame.setVisible(true);
            this.dispose();
            
        }
        else if(jrbQuit.isSelected())
        {
            int answer=JOptionPane.showConfirmDialog(null,"are you sure you want to quit ?", "Quitting ?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(answer==JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null,"Thank you for using the app");
                System.exit(0);
            }
            }
        else
        {
           JOptionPane.showMessageDialog(null,"Please make selection first"); 
        }
    }//GEN-LAST:event_btnDoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(OptionsEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and jrbAddEmporm */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsEmpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbAddEmp;
    private javax.swing.JRadioButton jrbQuit;
    private javax.swing.JRadioButton jrbRemoveEmp;
    private javax.swing.JRadioButton jrbSearchEmp;
    private javax.swing.JRadioButton jrbShowAllEmp;
    private javax.swing.JRadioButton jrbUpdateEmp;
    // End of variables declaration//GEN-END:variables
}