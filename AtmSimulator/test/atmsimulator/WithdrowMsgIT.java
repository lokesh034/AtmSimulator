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
public class WithdrowMsgIT {
    
    public WithdrowMsgIT() {
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
     * Test of setM method, of class WithdrowMsg.
     */
    @Test
    public void testSetM() {
        System.out.println("setM");
        String m = "";
        WithdrowMsg instance = new WithdrowMsg();
        instance.setM(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateCursor method, of class WithdrowMsg.
     */
    @Test
    public void testCreateCursor() {
        System.out.println("CreateCursor");
        WithdrowMsg instance = new WithdrowMsg();
        instance.CreateCursor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createHandCursor method, of class WithdrowMsg.
     */
    @Test
    public void testCreateHandCursor() {
        System.out.println("createHandCursor");
        WithdrowMsg instance = new WithdrowMsg();
        instance.createHandCursor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class WithdrowMsg.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        WithdrowMsg.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
