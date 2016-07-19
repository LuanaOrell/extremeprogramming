package databasemanager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
public class QueryBuilded {

    public static final QueryBuilded INSTANCE = new QueryBuilded();

    private QueryBuilded() {
    }

    public static QueryBuilded getInstance() {
        return INSTANCE;
    }

    public boolean validateUser(String login, String password) {
        boolean result = false;
        try {
            String query = String.format("SELECT validate_user('%s', '%s');", login, password);
            ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
            while (resultSet.next()) {
                result = resultSet.getBoolean(1);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return result;
    }

    public List<String> getRol() {
        try {
            String query = "SELECT get_rol();";
            ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
            List<String> result = new ArrayList<>();
            while (resultSet.next()) {
                result.add(resultSet.getString(1));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(QueryBuilded.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    public List<String> getFunctionsUser() {
        try {
            String query = "SELECT get_functions_user();";
            ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
            List<String> result = new ArrayList<>();
            while (resultSet.next()) {
                result.add(resultSet.getString(1));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(QueryBuilded.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    public void insertUser(String login, String password) {
        String query = String.format("SELECT insert_user('%s', '%s');", login, password);
        ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
    }

    public void insertarUsuarioRol(int user, int rol) {
        String query = "SELECT insertar_rol_usuario(" + user + "," + rol + ");";
        ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
    }

    public int getIdUsuario(String login, String password) {
        int result = -1;
        try {
            String query = String.format("SELECT get_id_user('%s', '%s');", login, password);
            ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
            while (resultSet.next()) {
                result = resultSet.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(QueryBuilded.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public int getIdRol(String rol) {
        int result = -1;
        try {
            String query = String.format("SELECT get_id_rol('%s');", rol);
            ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
            while (resultSet.next()) {
                result = resultSet.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(QueryBuilded.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public int getIdTask(String title) {
        int result = -1;
        try {
            String query = String.format("SELECT get_id_task('%s')", title);
            ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
            while (resultSet.next()) {
                result = resultSet.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(QueryBuilded.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public String getStatusTask(String title) {
        String result = null;
        try {
            String query = String.format("SELECT get_status_task('%s')", title);
            ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
            while (resultSet.next()) {
                result = resultSet.getString(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(QueryBuilded.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public void updateStatusStory(int idStory) {
        String query = String.format("SELECT update_status_story(%d)", idStory);
        ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
    }

    public int getIdStory(String titleStory) {
        int result = -1;
        try {
            String query = String.format("SELECT get_id_story('%s')", titleStory);
            ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
            while (resultSet.next()) {
                result = resultSet.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryBuilded.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public String getStatusStory(int idStory) {
        String result = null;
        try {
            String query = String.format("SELECT get_status_story(%d)", idStory);
            ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
            while (resultSet.next()) {
                result = resultSet.getString(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(QueryBuilded.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;
    }

    public void insertUserStory(String title, String description, String acceptanceCriteria, int priority, int complexity) {
        String query = String.format("SELECT insert_userstory('%s', '%s','%s', %d, %d);",
                title, description, acceptanceCriteria, priority, complexity);
        ResultSet resultSet = QueryManager.getInstance().executeQuery(query);
    }

}
