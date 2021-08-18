package GUI;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class StudentRecord extends javax.swing.JFrame {

    public StudentRecord() {
        initComponents();
    }

    public void viewData() {

        try {
            File f = new File("data.txt");
            Scanner in = new Scanner(f);
            String num = "";
            while (in.hasNext()) {
                num += in.nextLine() + "\n";
                //System.out.println(num);

            }

            jTextArea1.setText(num);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "File Not Found");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        teacherRecord = new javax.swing.JButton();
        staffRecord = new javax.swing.JButton();
        teacherForm = new javax.swing.JButton();
        staffForm = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Record");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        teacherRecord.setText("Teacher Record");
        teacherRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherRecordActionPerformed(evt);
            }
        });

        staffRecord.setText("Staff Record");
        staffRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRecordActionPerformed(evt);
            }
        });

        teacherForm.setText("Teacher Form");
        teacherForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherFormActionPerformed(evt);
            }
        });

        staffForm.setText("Staff Form");
        staffForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffFormActionPerformed(evt);
            }
        });

        jButton11.setText("Logout");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        backButton.setText("Main Menu");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(teacherRecord)
                .addGap(18, 18, 18)
                .addComponent(staffRecord)
                .addGap(18, 18, 18)
                .addComponent(teacherForm)
                .addGap(18, 18, 18)
                .addComponent(staffForm)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, jButton11, staffForm, staffRecord, teacherForm, teacherRecord});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teacherForm)
                        .addComponent(staffForm)
                        .addComponent(jButton11))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teacherRecord)
                        .addComponent(staffRecord)
                        .addComponent(backButton)))
                .addContainerGap())
        );

        jLabel1.setText("Name");

        jLabel2.setText("fathers name");

        jLabel3.setText("Date of Birth");

        jLabel4.setText("Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("View Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRecordActionPerformed
        StaffRecord record = new StaffRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_staffRecordActionPerformed

    private void teacherFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherFormActionPerformed
        TeacherForm form = new TeacherForm();
        this.hide();
        form.setVisible(true);
    }//GEN-LAST:event_teacherFormActionPerformed

    private void staffFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffFormActionPerformed
        StaffForm form = new StaffForm();
        this.hide();
        form.setVisible(true);
    }//GEN-LAST:event_staffFormActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Login login = new Login();
        this.hide();
        login.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        /*StudentForm menu=new StudentForm();
        this.hide();
        menu.setVisible(true);*/
        MainMenu m = new MainMenu();
        m.setVisible(true);
        this.hide();
    }//GEN-LAST:event_backButtonActionPerformed

    private void teacherRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherRecordActionPerformed
        TeacherRecord record = new TeacherRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_teacherRecordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        viewData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        this.hide();
        StudentForm form = new StudentForm();
        form.setVisible(true);
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
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton staffForm;
    private javax.swing.JButton staffRecord;
    private javax.swing.JButton teacherForm;
    private javax.swing.JButton teacherRecord;
    // End of variables declaration//GEN-END:variables
}
