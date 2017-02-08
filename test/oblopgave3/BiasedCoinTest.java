/*
 */
package oblopgave3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author flyberson
 */
public class BiasedCoinTest {
    
    public BiasedCoinTest() {
    }

    /**
     * Test of flip method, of class BiasedCoin.
     */
    @Test
    public void testFlip() {
        System.out.println("flip");
        BiasedCoin instance = new BiasedCoin();
        instance.flip();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHeads method, of class BiasedCoin.
     */
    @Test
    public void testIsHeads() {
        System.out.println("isHeads");
        BiasedCoin instance = new BiasedCoin();
        boolean expResult = false;
        boolean result = instance.isHeads();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BiasedCoin.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BiasedCoin instance = new BiasedCoin();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
