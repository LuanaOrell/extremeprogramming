/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import databasemanager.ConnectionDB;
import databasemanager.QueryBuilded;
import model.UserStory;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author LuanaOrellana
 */
public class UserStoryTest {

    @Before
    public void setUp() {
        ConnectionDB.getInstance().start();
    }

    @Test
    public void testGetStatusUserStory() {

        UserStory story = new UserStory("Registrar Tarea", "Se guarden los siguientes datos:"
                + "ID_Tarea,Nombre,Descripcion,Historia a la que pertenece", 300, 3);
        String expected = "In Progress";
        int idStory = QueryBuilded.getInstance().getIdStory(story.getTitleStory());
        QueryBuilded.getInstance().updateStatusStory(idStory);
        String actual = QueryBuilded.getInstance().getStatusStory(idStory);

        assertEquals(expected, actual);
    }
}
