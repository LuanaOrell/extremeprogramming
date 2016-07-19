/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import databasemanager.QueryBuilded;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TaskPanel;

/**
 *
 * @author Rocio Ramirez
 */
public class SaveTaskIntoStoryAction implements ActionListener {

    private TaskPanel view;
    
    public SaveTaskIntoStoryAction(TaskPanel view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String title = view.getTaskTitleField();
        String description = view.getDescriptionTextArea();
        int defaultState = 1;//To Do
        QueryBuilded.getInstance().saveTask(defaultState, title, description);
        //Creating Relation user storytask
        int storyId = QueryBuilded.getInstance().getIdStory(view.getSelectedStory());
        int taskId = QueryBuilded.getInstance().getIdTask(title);
        
        QueryBuilded.getInstance().saveTaskIntoStory(storyId, taskId);
    }
    
}
