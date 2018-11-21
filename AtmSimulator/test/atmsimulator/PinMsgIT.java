/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsimulator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ltriv
 */
public class PinMsgIT {
    
    public PinMsgIT() {
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

    /**
     * Test of setM method, of class PinMsg.
     */
    @Test
    public void testSetM() {
        System.out.println("setM");
        String m = "";
        PinMsg instance = new PinMsg();
        instance.setM(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateCursor method, of class PinMsg.
     */
    @Test
    public void testCreateCursor() {
        System.out.println("CreateCursor");
        PinMsg instance = new PinMsg();
        instance.CreateCursor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createHandCursor method, of class PinMsg.
     */
    @Test
    public void testCreateHandCursor() {
        System.out.println("createHandCursor");
        PinMsg instance = new PinMsg();
        instance.createHandCursor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PinMsg.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PinMsg.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
