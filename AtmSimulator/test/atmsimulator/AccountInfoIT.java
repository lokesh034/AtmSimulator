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
public class AccountInfoIT {
    
    public AccountInfoIT() {
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
     * Test of setPB method, of class AccountInfo.
     */
    @Test
    public void testSetPB() {
        System.out.println("setPB");
        PersonalBean pb = null;
        AccountInfo instance = new AccountInfo();
        instance.setPB(pb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateCursor method, of class AccountInfo.
     */
    @Test
    public void testCreateCursor() {
        System.out.println("CreateCursor");
        AccountInfo instance = new AccountInfo();
        instance.CreateCursor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createHandCursor method, of class AccountInfo.
     */
    @Test
    public void testCreateHandCursor() {
        System.out.println("createHandCursor");
        AccountInfo instance = new AccountInfo();
        instance.createHandCursor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AccountInfo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AccountInfo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
