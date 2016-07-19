/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import actions.SaveUserStoryAction;
import databasemanager.QueryBuilded;

/**
 *
 * @author Rocio Ramirez
 */
public class UserStoryFormPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserStoryFormPanel
     */
    public UserStoryFormPanel() {
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

        description = new javax.swing.JLabel();
        criteriaLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        acceptanceScrollPane = new javax.swing.JScrollPane();
        acceptanceTextArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        priorityLabel = new javax.swing.JLabel();
        complexityLabel = new javax.swing.JLabel();
        priorityComboBox = new javax.swing.JComboBox();
        complexityComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        setLayout(null);

        description.setText("Description:");
        add(description);
        description.setBounds(30, 90, 80, 14);

        criteriaLabel.setText("Acceptance Criteria:");
        add(criteriaLabel);
        criteriaLabel.setBounds(30, 220, 120, 14);

        titleField.setText("Title");
        add(titleField);
        titleField.setBounds(30, 50, 335, 20);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        add(descriptionScrollPane);
        descriptionScrollPane.setBounds(31, 108, 335, 96);

        acceptanceTextArea.setColumns(20);
        acceptanceTextArea.setRows(5);
        acceptanceScrollPane.setViewportView(acceptanceTextArea);

        add(acceptanceScrollPane);
        acceptanceScrollPane.setBounds(31, 242, 335, 104);

        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(290, 420, 70, 23);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        add(cancelButton);
        cancelButton.setBounds(200, 420, 80, 23);

        priorityLabel.setText("Priority");
        add(priorityLabel);
        priorityLabel.setBounds(30, 370, 50, 14);

        complexityLabel.setText("Complexity");
        add(complexityLabel);
        complexityLabel.setBounds(210, 370, 70, 20);

        priorityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        add(priorityComboBox);
        priorityComboBox.setBounds(90, 370, 69, 20);

        complexityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "3", "5", "8", "13" }));
        add(complexityComboBox);
        complexityComboBox.setBounds(290, 370, 71, 20);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER STORY");
        add(jLabel1);
        jLabel1.setBounds(143, 13, 100, 21);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        String title = getStoryTitle();
        String description = getStoryDescription();
        String acceptanceCriteria = getCriteria();
        int priority = getPriority();
        int complexity = getComplexity();
        
        QueryBuilded.getInstance().insertUserStory(title, description, acceptanceCriteria,
                                                    priority, complexity);
    }//GEN-LAST:event_saveButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane acceptanceScrollPane;
    private javax.swing.JTextArea acceptanceTextArea;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox complexityComboBox;
    private javax.swing.JLabel complexityLabel;
    private javax.swing.JLabel criteriaLabel;
    private javax.swing.JLabel description;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox priorityComboBox;
    private javax.swing.JLabel priorityLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField titleField;
    // End of variables declaration//GEN-END:variables

    public String getStoryTitle() {
        return titleField.getText();
    }

    public String getStoryDescription() {
        return descriptionTextArea.getText();
    }

    public String getCriteria() {
        return acceptanceTextArea.getText();
    }

    public int getPriority() {
        Object item = priorityComboBox.getModel().getSelectedItem();
        return Integer.valueOf(item.toString());
    }

    public int getComplexity() {
        Object item = complexityComboBox.getModel().getSelectedItem();
        return Integer.valueOf(item.toString());
    }
}
