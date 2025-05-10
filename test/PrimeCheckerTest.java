import org.junit.Test;
import static org.junit.Assert.*;
import primecheckerapp.PrimeChecker;

public class PrimeCheckerTest {

    PrimeChecker checker = new PrimeChecker();

    @Test
    public void testNegativeNumbers() {
        assertFalse(checker.isPrime(-10));
    }

    @Test
    public void testZeroAndOne() {
        assertFalse(checker.isPrime(0));
        assertFalse(checker.isPrime(1));
    }

    @Test
    public void testTwo() {
        assertTrue(checker.isPrime(2));
    }

    @Test
    public void testPrimeNumber() {
        assertTrue(checker.isPrime(7));
    }

    @Test
    public void testNonPrime() {
        assertFalse(checker.isPrime(9));
    }
}
