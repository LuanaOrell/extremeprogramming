/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LuLu
 */
public class ConnectionBD {

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/ExtremeProgramming";
    private final Connection connection;

    public ConnectionBD() throws ClassNotFoundException, SQLException {
        this("postgres", "floricienta");
    }

    public ConnectionBD(String user, String password) throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        connection = DriverManager.getConnection(JDBC_URL, user, password);
    }

    public Statement getStatement() throws SQLException {
        return connection.createStatement();
    }

    public void close() throws SQLException {
        connection.close();
    }
}
