package edu.fatec.appxp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest
{    
    @Test
    public void testHelloWorld() {
    	App cut = new App();
    	assertEquals("Hello World!", cut.getHelloWorld());
    }
}
