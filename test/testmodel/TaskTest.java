/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LuLu
 */
public class TaskTest {
    @Test
    public void testGetStatusTask() throws ClassNotFoundException, SQLException {
        
        Task task = new Task(1,"Crear Tabla Tarea","Crear la tabla para la base de base");
        String expected = "Done";
        QueryTask query = new QueryTask();
        String actual = query.getStatusTask(task.getId());
        assertEquals(expected, actual);
        
        task = new Task(2,"Relacionar Tarea","Crear la relacion entre una tarea e Historia");
        expected = "To Do";
        actual = query.getStatusTask(task.getId());
        assertEquals(expected, actual);
        
    }
    
    @Test(expected = DuplicateTasks.class)
    public void testRepeatedTasksNamesInAUserStory() {
        
        Task task = new Task(3, "Actualizar Estado", "Actualizar estado de una tarea");
        Task repeated = new Task(4, "Actualizar Estado", "Actualizar estado de una tarea");
        
        UserStory userStory = new UserStory(1, "HistoriaNueva", "Crear una historia nueva", 12, 13);
        userStory.addTask(task);
        userStory.addTask(repeated);        
        
        UserStoryManager manager = new UserStoryManager();
        manager.createUserStory(userStory);
    }
    
}
