package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.Complex;

public class ComplexTest {
    private Complex complex;

    @Before
    public void setUp() {
        this.complex = new Complex(1.0, 2.0);
    }

    @Test
    public void testConstructor () {
        assertEquals(1.0, complex.getRe(), 0.00001);
        assertEquals(2.0, complex.getIm(), 0.00001);
    }
}
