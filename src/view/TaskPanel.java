/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import actions.SaveTaskIntoStoryAction;
import databasemanager.QueryBuilded;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Rocio Ramirez
 */
public class TaskPanel extends JPanel {

    private JButton cancelButton;
    private JLabel descriptionLabel;
    private JScrollPane descriptionScroller;
    private JLabel descriptiveLabel;
    private JTextArea descriptionTextArea;
    private JButton saveButton;
    private JTextField taskTitleField;
    private JLabel titleTaskLabel;
    private JComboBox userStoriesComboBox;
    private JLabel userStoryLabel;
    private DefaultComboBoxModel boxModel;
    
    public TaskPanel() {
        initComponents();
    }
                     
    private void initComponents() {

        titleTaskLabel = new JLabel();
        taskTitleField = new JTextField();
        descriptionLabel = new JLabel();
        descriptionScroller = new JScrollPane();
        descriptionTextArea = new JTextArea();
        descriptiveLabel = new JLabel();
        userStoryLabel = new JLabel();
        saveButton = new JButton();
        cancelButton = new JButton();

        setLayout(null);

        titleTaskLabel.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        titleTaskLabel.setText("TASK");
        add(titleTaskLabel);
        titleTaskLabel.setBounds(183, 28, 32, 17);

        taskTitleField.setText("Title");
        
        add(taskTitleField);
        taskTitleField.setBounds(36, 76, 319, 20);

        descriptionLabel.setText("Description:");
        add(descriptionLabel);
        descriptionLabel.setBounds(36, 114, 70, 19);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionScroller.setViewportView(descriptionTextArea);

        add(descriptionScroller);
        descriptionScroller.setBounds(36, 139, 319, 116);

        descriptiveLabel.setText("Select a user story to add this task");
        add(descriptiveLabel);
        descriptiveLabel.setBounds(36, 271, 230, 14);

        userStoryLabel.setText("User Story");
        add(userStoryLabel);
        userStoryLabel.setBounds(36, 308, 80, 22);

        boxModel = new DefaultComboBoxModel();
        fillModel();
        userStoriesComboBox = new JComboBox(boxModel);
        add(userStoriesComboBox);
        userStoriesComboBox.setBounds(113, 309, 242, 20);

        saveButton.setText("Save");
        saveButton.addActionListener(new SaveTaskIntoStoryAction(this));
        add(saveButton);
        saveButton.setBounds(292, 364, 77, 23);

        cancelButton.setText("Cancel");
        add(cancelButton);
        cancelButton.setBounds(197, 364, 77, 23);
    }            

    private void fillModel() {
        ResultSet stories = QueryBuilded.getInstance().getUserStories();
        try {
            while (stories.next()) {
                String currentTitle = stories.getString("title_story");
                boxModel.addElement(currentTitle);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaskPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDescriptionTextArea() {
        return descriptionTextArea.getText();
    }

    public String getTaskTitleField() {
        return taskTitleField.getText();
    }
    
    public String getSelectedStory() {
        return String.valueOf(boxModel.getSelectedItem());
    }
}
