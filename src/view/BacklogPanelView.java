/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rocio Ramirez
 */
public class BacklogPanelView extends JPanel {
    
    private DefaultTableModel tableModel;
    private JScrollPane scroller;
    
    public BacklogPanelView() {
        setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tableModel = new DefaultTableModel();
        JTable backlogTable = new JTable(tableModel);
        tableModel.addColumn("Title");
        tableModel.addColumn("Description");
        tableModel.addColumn("Priority");
        tableModel.addColumn("Complexity");
        tableModel.addColumn("State");

        scroller = new JScrollPane(backlogTable);
        add(scroller);
        scroller.setViewportView(backlogTable);
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    
}
