package databasemanager;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LuLu
 */
public class QueryTask {

    private final ConnectionDB connection;
    private Statement statement;
    private ResultSet resultSet;

    public QueryTask() throws ClassNotFoundException, SQLException {
        connection = ConnectionDB.getInstance();
    }

    public String getStatusTask(int id) {
        String result = "";
        try {
            statement = connection.getStatement();
            String query = "SELECT get_status_task("+id+");";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                result = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return result;
    }
}
