
package test;

import ex8.PersonDataTools;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase JUnit que sirve para testear las funciones de la aplicación
 * @author Marvin - Isaac
 * @version 1.0 07-11-17
 */
public class PersonDataToolsTest {
    
    /**
     * constructor vacio
     */
    public PersonDataToolsTest() {
    }
    
    PersonDataTools p =new PersonDataTools(); //Instacioamos el objeto
    
    //Prueba la funcion que comprueba el nombre.
    @Test
    public void onlyContainsLetters1() {
        String inputData = "Marvin";
        assertEquals(true, p.onlyContainsLetters(inputData));
    }
    
    @Test
    public void onlyContainsLetters2() {
        String inputData = "Marvin Hernandez";
        assertEquals(true, p.onlyContainsLetters(inputData));
    }
    
    @Test
    public void onlyContainsLetters3() {
        String inputData = "Marvin Hernandez 3";
        assertEquals(false, p.onlyContainsLetters(inputData));
    }
    
    //Testeamos la comprobacion del DNI
    
    @Test
    public void isDNI1() {
        String inputData = "38881771H";
        assertEquals(true, p.isDni(inputData));
    }
    
    @Test
    public void isDNI2() {
        String inputData = "71901358T";
        assertEquals(true, p.isDni(inputData));
    }
    
    @Test
    public void isDNI3() {
        String inputData = "7190135865";
        assertEquals(false, p.isDni(inputData));
    }
    
    //comprobamos los rango de las edades.
    
    @Test
    public void edadTest1() {
        int inputData = 20;
        assertEquals(true, p.isBetween(inputData,1,100));
    }
    
    @Test
    public void edadTest2() {
        int inputData = 99;
        assertEquals(true, p.isBetween(inputData,1,100));
    }
    
    @Test
    public void edadTest3() {
        int inputData = 200;
        assertEquals(false, p.isBetween(inputData,1,100));
    }
    
    
    //comprobamos los rango de peso
    
    @Test
    public void pesoTest1() {
        double inputData = 31.5;
        assertEquals(true, p.isBetween(inputData,30.00,200.00));
    }
    
    @Test
    public void pesoTest2() {
        double inputData = 199.5;
        assertEquals(true, p.isBetween(inputData,30.00,200.00));
    }
    
    @Test
    public void pesoTest3() {
        double inputData = 300.00;
        assertEquals(false, p.isBetween(inputData,30.00,200.00));
    }
    
    //comprobamos que el correo electronico es correcto
    
    @Test
    public void isEmailTest1() {
        String inputData = "marvin@correo.es";
        assertEquals(true, p.isEmail(inputData));
    }
    
    @Test
    public void isEmailTest2() {
        String inputData = "isaac@gmail.es";
        assertEquals(true, p.isEmail(inputData));
    }
    
    @Test
    public void isEmailTest3() {
        String inputData = "isaac.es";
        assertEquals(false, p.isEmail(inputData));
    }
}
