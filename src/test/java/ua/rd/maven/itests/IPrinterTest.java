package ua.rd.maven.itests;

import org.junit.Test;
import ua.rd.maven.Printer;

import static org.junit.Assert.assertEquals;

public class IPrinterTest {
    @Test
    public void print2() throws Exception {
        String expected = "print 2";
        String actual = new Printer().print(2);
        assertEquals(expected, actual);
    }

    @Test
    public void print3() throws Exception {
        String expected = "print 3";
        String actual = new Printer().print(3);
        assertEquals(expected, actual);
    }

}