/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import databasemanager.QueryBuilded;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        ResultSet stories = QueryBuilded.getInstance().getUserStories();
        try {
            while (stories.next()) {
                DefaultTableModel model = backlog.getTableModel();
                Object[] row = new Object[5];
                row[0] = stories.getString(3);
                row[1] = stories.getString(4);
                row[2] = stories.getInt(6);
                row[3] = stories.getInt(7);
                row[4] = String.valueOf(stories.getInt(2));
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FillBacklogTableAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
