package databasemanager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LuLu
 */
public class ConnectionDB {

    private static final ConnectionDB INSTANCE = new ConnectionDB();
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/extremeprogramming";
    private static final String USER = "rocio";
    private static final String PASSWORD = "admin";
    private Connection connection;

    private ConnectionDB() {
    }

    public static ConnectionDB getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }

    public void start() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Statement getStatement() throws SQLException {
        return connection.createStatement();
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
