/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import databasemanager.ConnectionDB;
import databasemanager.QueryBuilded;
import model.Task;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author LuLu
 */
public class TaskTest {

    @Before
    public void setUp() {
        ConnectionDB.getInstance().start();
    }

    @Test
    public void testGetStatusTask() throws ClassNotFoundException, SQLException {

        Task task = new Task("Crear Tabla Tarea", "Crear la tabla para la base de base");
        String expected = "Done";
        String actual = QueryBuilded.getInstance().getStatusTask(task.getTitle());
        assertEquals(expected, actual);

        task = new Task("Relacionar Tarea", "Crear la relacion entre una tarea e Historia");
        expected = "In Progress";
        actual = QueryBuilded.getInstance().getStatusTask(task.getTitle());
        assertEquals(expected, actual);

    }
}
