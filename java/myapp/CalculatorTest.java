package myapp;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {
 
    Calculator calculator = new Calculator();
 
    @Test
    public void testAdd() {
 
        assertEquals(20, calculator.addNumbers(10, 10));

    }
 
}