/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasemanager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rocio Ramirez
 */
public class QueryManager {
    
    private static final QueryManager INSTANCE = new QueryManager();
    
    private QueryManager() {
    }
    
    public static QueryManager getInstance() {
        return INSTANCE;
    }
    
    public ResultSet executeQuery(String query) {
        try {
            Statement stmt = ConnectionDB.getInstance().getConnection().createStatement();
            ResultSet result = stmt.executeQuery(query);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
