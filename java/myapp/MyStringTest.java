package myapp;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyStringTest {
    MyString myString = new MyString();

    @Test
    public void testGetStringLength_NormalString(){
        int result = myString.getStringLength("Hello");
        assertEquals(5, result);
    }
    @Test
    public void testGetStringLength_EmptyString(){
        int result = myString.getStringLength("");
        assertEquals(0, result);

    }
    
}
