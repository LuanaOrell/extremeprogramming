/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import actions.FillBacklogTableAction;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Rocio Ramirez
 */
public class MainPanelView extends javax.swing.JPanel {

    /**
     * Creates new form NewPanel
     */
    public MainPanelView() {
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
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

        createStoriesPanel = new javax.swing.JPanel();
        createStoryLabel = new javax.swing.JLabel();
        createStoryButton = new javax.swing.JButton();
        tasksPanel = new javax.swing.JPanel();
        taskLabel = new javax.swing.JLabel();
        taskButton = new javax.swing.JButton();
        logStoryPanel = new javax.swing.JPanel();
        logLabel = new javax.swing.JLabel();
        viewLogButton = new javax.swing.JButton();
        backlogPanel = new javax.swing.JPanel();
        backlogLabel = new javax.swing.JLabel();
        backlogButton = new javax.swing.JButton();
        taskBoardPanel = new javax.swing.JPanel();
        taskBoardLabel = new javax.swing.JLabel();
        viewTaskBoardButton = new javax.swing.JButton();
        calendarPanel = new javax.swing.JPanel();
        calendarLabel = new javax.swing.JLabel();
        viewCalendarButton = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(2, 3, 10, 10));

        createStoriesPanel.setBackground(new java.awt.Color(255, 255, 255));
        createStoriesPanel.setLayout(null);

        createStoryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/files.png"))); // NOI18N
        createStoriesPanel.add(createStoryLabel);
        createStoryLabel.setBounds(50, 30, 130, 130);

        createStoryButton.setText("Create User Story");
        createStoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStoryButtonActionPerformed(evt);
            }
        });
        createStoriesPanel.add(createStoryButton);
        createStoryButton.setBounds(50, 180, 140, 23);

        add(createStoriesPanel);

        tasksPanel.setBackground(new java.awt.Color(255, 255, 255));
        tasksPanel.setLayout(null);

        taskLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notebook.png"))); // NOI18N
        tasksPanel.add(taskLabel);
        taskLabel.setBounds(50, 27, 130, 130);

        taskButton.setText("Create Task");
        taskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskButtonActionPerformed(evt);
            }
        });
        tasksPanel.add(taskButton);
        taskButton.setBounds(60, 180, 110, 23);

        add(tasksPanel);

        logStoryPanel.setBackground(new java.awt.Color(255, 255, 255));
        logStoryPanel.setLayout(null);

        logLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/documentation.png"))); // NOI18N
        logStoryPanel.add(logLabel);
        logLabel.setBounds(54, 31, 130, 130);

        viewLogButton.setText("User Stories Log");
        viewLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLogButtonActionPerformed(evt);
            }
        });
        logStoryPanel.add(viewLogButton);
        viewLogButton.setBounds(50, 180, 130, 23);

        add(logStoryPanel);

        backlogPanel.setBackground(new java.awt.Color(255, 255, 255));
        backlogPanel.setLayout(null);

        backlogLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folders.png"))); // NOI18N
        backlogPanel.add(backlogLabel);
        backlogLabel.setBounds(50, 25, 130, 130);

        backlogButton.setText("Backlog");
        backlogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backlogButtonActionPerformed(evt);
            }
        });
        backlogPanel.add(backlogButton);
        backlogButton.setBounds(70, 180, 80, 23);

        add(backlogPanel);

        taskBoardPanel.setBackground(new java.awt.Color(255, 255, 255));
        taskBoardPanel.setLayout(null);

        taskBoardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/monitor.png"))); // NOI18N
        taskBoardPanel.add(taskBoardLabel);
        taskBoardLabel.setBounds(49, 20, 130, 130);

        viewTaskBoardButton.setText("Task Board");
        viewTaskBoardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskBoardButtonActionPerformed(evt);
            }
        });
        taskBoardPanel.add(viewTaskBoardButton);
        viewTaskBoardButton.setBounds(70, 180, 100, 23);

        add(taskBoardPanel);

        calendarPanel.setBackground(new java.awt.Color(255, 255, 255));
        calendarPanel.setLayout(null);

        calendarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar.png"))); // NOI18N
        calendarPanel.add(calendarLabel);
        calendarLabel.setBounds(54, 23, 130, 130);

        viewCalendarButton.setText("Calendar");
        viewCalendarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCalendarButtonActionPerformed(evt);
            }
        });
        calendarPanel.add(viewCalendarButton);
        viewCalendarButton.setBounds(70, 180, 100, 23);

        add(calendarPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void createStoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStoryButtonActionPerformed
        UserStoryFormPanel panel  = new UserStoryFormPanel();
        JDialog storyDialog = new JDialog();
        storyDialog.getContentPane().add(panel);
        storyDialog.setSize(410, 495);
        storyDialog.setResizable(false);
        storyDialog.setLocationRelativeTo(null);
        storyDialog.setVisible(true);
    }//GEN-LAST:event_createStoryButtonActionPerformed

    private void viewCalendarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCalendarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewCalendarButtonActionPerformed

    private void viewTaskBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskBoardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTaskBoardButtonActionPerformed

    private void taskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskButtonActionPerformed

    private void viewLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLogButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewLogButtonActionPerformed

    private void backlogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backlogButtonActionPerformed
        JDialog dialog = new JDialog();
        dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BacklogPanelView backlog = new BacklogPanelView();
        FillBacklogTableAction fillTable = new FillBacklogTableAction(backlog);// this will fill the table
        dialog.getContentPane().add(backlog);
        dialog.setSize(500, 500);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_backlogButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backlogButton;
    private javax.swing.JLabel backlogLabel;
    private javax.swing.JPanel backlogPanel;
    private javax.swing.JLabel calendarLabel;
    private javax.swing.JPanel calendarPanel;
    private javax.swing.JPanel createStoriesPanel;
    private javax.swing.JButton createStoryButton;
    private javax.swing.JLabel createStoryLabel;
    private javax.swing.JLabel logLabel;
    private javax.swing.JPanel logStoryPanel;
    private javax.swing.JLabel taskBoardLabel;
    private javax.swing.JPanel taskBoardPanel;
    private javax.swing.JButton taskButton;
    private javax.swing.JLabel taskLabel;
    private javax.swing.JPanel tasksPanel;
    private javax.swing.JButton viewCalendarButton;
    private javax.swing.JButton viewLogButton;
    private javax.swing.JButton viewTaskBoardButton;
    // End of variables declaration//GEN-END:variables
}
