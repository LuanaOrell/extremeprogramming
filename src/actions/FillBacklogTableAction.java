/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import javax.swing.table.DefaultTableModel;
import view.BacklogPanelView;

/**
 *
 * @author Rocio Ramirez
 */
public class FillBacklogTableAction {

    private BacklogPanelView backlog;
    
    public FillBacklogTableAction(BacklogPanelView backlog) {
        this.backlog = backlog;
        fillTable();
    }

    private void fillTable() {
        Object [] row = {"historia1","",1, 13, "IN_PROGRESS"};
        Object [] row1 = {"historia1","",1, 13, "IN_PROGRESS"};
        Object [] row2 = {"historia1","",1, 13, "IN_PROGRESS"};
        
        DefaultTableModel model = backlog.getTableModel();
        model.addRow(row);
        model.addRow(row1);
        model.addRow(row2);
        
    }
    
    
    
}
