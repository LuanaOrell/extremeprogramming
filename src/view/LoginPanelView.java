/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import databasemanager.ConnectionDB;
import databasemanager.QueryBuilded;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocio Ramirez
 */
public class LoginPanelView extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanelView
     */
    public LoginPanelView() {
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

        labelScrum = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        loginText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();

        setLayout(null);

        labelScrum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelScrum.setText("EXTREME PROGRAMMING");
        add(labelScrum);
        labelScrum.setBounds(100, 30, 210, 22);

        buttonLogin.setText("Log in");
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLoginMouseClicked(evt);
            }
        });
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        add(buttonLogin);
        buttonLogin.setBounds(160, 260, 70, 23);
        add(loginText);
        loginText.setBounds(100, 100, 241, 30);

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        add(passwordText);
        passwordText.setBounds(100, 180, 241, 30);

        userLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/girl_login.png"))); // NOI18N
        add(userLabel);
        userLabel.setBounds(20, 80, 80, 70);

        passwordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/padlock.png"))); // NOI18N
        add(passwordLabel);
        passwordLabel.setBounds(20, 160, 70, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseClicked

    }//GEN-LAST:event_buttonLoginMouseClicked

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        ConnectionDB.getInstance().start();
        String login = loginText.getText();
        String password = String.valueOf(passwordText.getPassword());
        boolean isUser = QueryBuilded.getInstance().validateUser(login, password);
        if (isUser) {
            JDialog dialog = new JDialog();
            MainPanelView mainPanel = new MainPanelView();
            dialog.getContentPane().add(mainPanel);
            dialog.setSize(750, 550);
            dialog.setResizable(false);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "User not registered");
        }
        
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel labelScrum;
    private javax.swing.JTextField loginText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
