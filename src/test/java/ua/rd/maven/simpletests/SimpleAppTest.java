package ua.rd.maven.simpletests;

import org.junit.Test;
import ua.rd.maven.App;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class SimpleAppTest {

    @Test
    public void testMain() throws Exception {
        String[] args = {"1", "2"};
        App.main(args);
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }
}
