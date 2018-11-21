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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ltriv
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({atmsimulator.PinMsgIT.class, atmsimulator.AtmSimulatorIT.class, atmsimulator.AccountInfoIT.class, atmsimulator.BalanceEIT.class, atmsimulator.WithdrowMsgIT.class, atmsimulator.WithdrowIT.class, atmsimulator.HomeIT.class, atmsimulator.DipositeIT.class, atmsimulator.DipositeMsgIT.class, atmsimulator.PinChangeIT.class, atmsimulator.MiniStatementIT.class, atmsimulator.ConnectionsIT.class, atmsimulator.UIIT.class, atmsimulator.LogInIT.class, atmsimulator.AdditionalIT.class, atmsimulator.PersonalDetailIT.class, atmsimulator.FastCashIT.class, atmsimulator.PersonalBeanIT.class})
public class AtmsimulatorITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
