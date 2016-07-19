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
    void setup(){
      queryBuilded=new QueryBuilded();
    }
    @Test
    void userShouldNotBeAbleToSignIn(){
        assertFalse(queryBuilded.validateUser(" "," "));
        assertFalse(queryBuilded.validateUser(" "," "));
        assertFalse(queryBuilded.validateUser(" "," "));
    }
    @Test 
    void userShouldBeAbleToSignIn(){
        assertTrue(queryBuilded.validateUser("", ""));
        assertTrue(queryBuilded.validateUser("", ""));
        assertTrue(queryBuilded.validateUser("", ""));
    }
    @Test 
    void itShouldExistAnIdForARegistredUser(){
     
     assertEquals(1,queryBuilded.getIdUsuario("",""));
     assertEquals(2,queryBuilded.getIdUsuario(" "," " ));
     assertEquals(3,queryBuilded.getIdUsuario(" "," " ));
     assertEquals(-1,queryBuilded.getIdUsuario(" "," " ));
     assertEquals(-1,queryBuilded.getIdUsuario(" "," " ));
    }
    
    @Test
    void itShouldExistAnIdForAStoredRol(){
      assertEquals(1,queryBuilded.getIdRol(""));
      assertEquals(2,queryBuilded.getIdRol(""));
      assertEquals(3,queryBuilded.getIdRol(""));
      assertEquals(-1,queryBuilded.getIdRol(""));
      assertEquals(-1,queryBuilded.getIdRol(""));
    }
    @Test
    void itShouldExistAnIdForAStoredTask(){
        assertEquals(1, queryBuilded.getIdTask(""));
        assertEquals(2, queryBuilded.getIdTask(""));
        assertEquals(3, queryBuilded.getIdTask(""));
        assertEquals(-1, queryBuilded.getIdTask(""));
        assertEquals(-1, queryBuilded.getIdTask(""));
    
     }
    @Test
    void itShouldExistAnIdForAStoredStory(){
        assertEquals(1, queryBuilded.getIdStory(""));
        assertEquals(2, queryBuilded.getIdStory(""));
        assertEquals(4, queryBuilded.getIdStory(""));
        assertEquals(-1, queryBuilded.getIdStory(""));
        assertEquals(-1, queryBuilded.getIdStory("")); 
    }
    @Test
    void shouldBeAbloToKnowStoredTaskStatus(){
       assertEquals("", queryBuilded.getStatusTask(""));
       assertEquals(null, queryBuilded.getStatusTask(""));
       assertEquals("", queryBuilded.getStatusTask(""));
       assertEquals(null, queryBuilded.getStatusTask(""));
       assertEquals("", queryBuilded.getStatusTask(""));
    }
    void shouldBeAbleToKnowStoredStoryStatus(){
        assertEquals("", queryBuilded.getStatusStory(1));
        assertEquals("", queryBuilded.getStatusStory(1));
        assertEquals(null, queryBuilded.getStatusStory(53));
        assertEquals(null, queryBuilded.getStatusStory(78));
        assertEquals(null, queryBuilded.getStatusStory(-1));
    }
    
}

