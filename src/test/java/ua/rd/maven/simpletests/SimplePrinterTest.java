package ua.rd.maven.simpletests;

import org.junit.Test;
import ua.rd.maven.Printer;

import static org.junit.Assert.*;

public class SimplePrinterTest {
    @Test
    public void print1() throws Exception {
        String expected = "print 1";
        String actual = new Printer().print(1);
        assertEquals(expected, actual);
    }
}