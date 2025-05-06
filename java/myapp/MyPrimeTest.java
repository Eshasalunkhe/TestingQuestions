package myapp;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MyPrimeTest {
    @Test
    public void testIsPrimeWithPrimeNumber(){
        MyPrime prime = new MyPrime();
        assertTrue("5 should be prime", prime.isPrime(5));

    }
    @Test
    public void testIsPrimeWithNonPrimeNumber(){
        MyPrime prime = new MyPrime();
        assertFalse("4 should not be prime", prime.isPrime(4));
    }
}
