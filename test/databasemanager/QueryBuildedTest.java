/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasemanager;

/**
 *
 * @author Carla
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Carla
 */
public class QueryBuildedTest {

    private QueryBuilded queryBuilded;

    @Before
    public void setup() {
        ConnectionDB.getInstance().start();
        queryBuilded = QueryBuilded.getInstance();
    }

    @Test
    public void userShouldNotBeAbleToSignIn() {
        assertFalse(queryBuilded.validateUser("andres24", "andy24"));
        assertFalse(queryBuilded.validateUser("lucas", "luke56"));
        assertFalse(queryBuilded.validateUser("camila", "cami29"));
    }

    @Test
    public void userShouldBeAbleToSignIn() {
        assertTrue(queryBuilded.validateUser("luana", "floricienta"));
        assertTrue(queryBuilded.validateUser("jessica", "flores"));
        assertTrue(queryBuilded.validateUser("melody", "maldonado"));
    }

    @Test
    public void itShouldExistAnIdForARegistredUser() {
        assertEquals(1, queryBuilded.getIdUsuario("jessica", "flores"));
        assertEquals(2, queryBuilded.getIdUsuario("melody", "maldonado"));
        assertEquals(3, queryBuilded.getIdUsuario("rocio", "ramirez"));
        assertEquals(-1, queryBuilded.getIdUsuario("rocio", "chucamani"));
        assertEquals(-1, queryBuilded.getIdUsuario("luana", "orellana"));
    }

    @Test
    public void itShouldExistAnIdForAStoredRol() {
        assertEquals(1, queryBuilded.getIdRol("Administrador"));
        assertEquals(2, queryBuilded.getIdRol("Product owner"));
        assertEquals(3, queryBuilded.getIdRol("Developer"));
        assertEquals(-1, queryBuilded.getIdRol("Scrum Master"));
        assertEquals(-1, queryBuilded.getIdRol("Cajero"));
    }

//    @Test
//    public void itShouldExistAnIdForAStoredTask() {
//        assertEquals(1, queryBuilded.getIdTask("Crear Tabla Tarea"));
//        assertEquals(2, queryBuilded.getIdTask("Relacionar Tarea"));
//        assertEquals(3, queryBuilded.getIdTask("Crear Tabla Proyecto"));
//        assertEquals(-1, queryBuilded.getIdTask("Crear Iteracion"));
//        assertEquals(-1, queryBuilded.getIdTask("Crear Historia"));
//
//    }

    @Test
    public void itShouldExistAnIdForAStoredStory() {
        assertEquals(1, queryBuilded.getIdStory("Registrar Tarea"));
        assertEquals(2, queryBuilded.getIdStory("Crear Proyecto"));
        assertEquals(4, queryBuilded.getIdStory("Crear Usuario"));
        assertEquals(-1, queryBuilded.getIdStory("Crear Tarea"));
        assertEquals(-1, queryBuilded.getIdStory("Crear Iteracion"));
    }

    @Test
    public void shouldBeAbloToKnowStoredTaskStatus() {
        assertEquals("", queryBuilded.getStatusTask(""));
        assertEquals(null, queryBuilded.getStatusTask(""));
        assertEquals("", queryBuilded.getStatusTask(""));
        assertEquals(null, queryBuilded.getStatusTask(""));
        assertEquals("", queryBuilded.getStatusTask(""));
    }

    public void shouldBeAbleToKnowStoredStoryStatus() {
        assertEquals("", queryBuilded.getStatusStory(1));
        assertEquals("", queryBuilded.getStatusStory(1));
        assertEquals(null, queryBuilded.getStatusStory(53));
        assertEquals(null, queryBuilded.getStatusStory(78));
        assertEquals(null, queryBuilded.getStatusStory(-1));
    }

}
