/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicole
 */
public class UserStoryTest {

    public UserStoryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    private String writeCharacters(int length) {
        char s[] = new char[length];
        for (int i = 0; i < length; i++) {
            s[i] = 'a';
        }
        return new String(s);
    }

    @Test
    public void shouldNotSaveUserStoryWithNoTitle() {

        UserStory story = new UserStory("", "description", 6, 2);/// aqui creo una historia de usuario con un titulo vacio 
        UserStoryRepository repository = new UserStoryRepository();// aqui creo un repositorio osea la clase donde vamos a hacer las consultas

        boolean answer = repositoy.save(story);  ///con el metodo save guardaremos la historia y nos devuelve una respuesta si el false entonces no la guarda
        //// no debe guardar ya que el titulo esta vacio
        assertFalse(answer);  /// debe responder falso ya que el titulo esta vacio

    }

    @Test
    public void titleOfStoryShouldHaveMaximun100Char() {
        UserStory story = new UserStory(writeCharacters(100), "description", 6, 2);

        UserStoryRepository repository = new UserStoryRepository();// aqui creo un repositorio osea la clase donde vamos a hacer las consultas

        boolean answer = repositoy.save(story);  ///con el metodo save guardaremos la historia y nos devuelve una respuesta si el false entonces no la guarda
        //// no debe guardar ya que el titulo esta vacio
        assertFalse(answer);                      /// debe responder falso ya que el titulo esta vacio

    }
}

}}
     
}
