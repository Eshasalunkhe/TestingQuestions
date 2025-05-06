package myapp;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberUtilsTest {
    @Test
    public void testIsEvenNumber(){
        NumberUtils util = new NumberUtils();
        assertTrue("4 should be even", util.isEven(4));
    }
    @Test
    public void testIsEven_withOddNumber(){
        NumberUtils util = new NumberUtils();
        assertFalse("5 should be odd", util.isEven(5));

    }
    @Test
    public void testIsEven_withZero(){
        NumberUtils util = new NumberUtils();
        assertTrue("0 should be even", util.isEven(0));

    }
}
