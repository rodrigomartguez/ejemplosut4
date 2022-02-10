/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package es.dam.entornos.ut4.ejemplosut4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class ProfesorTest {
    
    public ProfesorTest() {
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

    @Test
    public void testPrintInformacionPersonal() {
        System.out.println("printInformacionPersonal");
        Profesor instance = new Profesor("123456789");
        instance.printInformacionPersonal();
        assertTrue(true);
    }

    @Test
    public void testPrintTodaLaInformacion() {
        System.out.println("printTodaLaInformacion");
        Profesor instance = new Profesor("123456789");
        instance.printTodaLaInformacion();
        assertTrue(true);
    }
    
}
