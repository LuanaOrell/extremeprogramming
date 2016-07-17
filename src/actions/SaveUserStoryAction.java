/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import view.UserStoryFormPanel;

/**
 *
 * @author Rocio Ramirez
 */
public class SaveUserStoryAction extends AbstractAction {

    private UserStoryFormPanel form;
    
    public SaveUserStoryAction(UserStoryFormPanel form) {
        this.form = form;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String title = form.getStoryTitle();
        String description = form.getStoryDescription();
        String acceptanceCriteria = form.getCriteria();
        int priority = form.getPriority();
        int complexity = form.getComplexity();
        
        //make query to save story
    }
    
    
    
}
