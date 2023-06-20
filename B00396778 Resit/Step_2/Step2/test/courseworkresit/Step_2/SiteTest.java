/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package courseworkresit.Step_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lisad
 */
public class SiteTest {
    
    public SiteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addPage method, of class Site.
     */
    @Test
    public void testAddPage() throws Exception {
        System.out.println("addPage");
        String pageName = "";
        Site instance = new Site();
        instance.addPage(pageName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrent method, of class Site.
     */
    @Test
    public void testGetCurrent() {
        System.out.println("getCurrent");
        Site instance = new Site();
        String expResult = "";
        String result = instance.getCurrent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveDown method, of class Site.
     */
    @Test
    public void testMoveDown() throws Exception {
        System.out.println("moveDown");
        Site instance = new Site();
        Site.PageNode expResult = null;
        Site.PageNode result = instance.moveDown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveUp method, of class Site.
     */
    @Test
    public void testMoveUp() throws Exception {
        System.out.println("moveUp");
        Site instance = new Site();
        Site.PageNode expResult = null;
        Site.PageNode result = instance.moveUp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Site.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Site instance = new Site();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
