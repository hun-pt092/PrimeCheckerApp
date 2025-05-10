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
    
    // test issus 2
    @Test
    public void testPrimeWithLoopRun() {
        assertTrue(checker.isPrime(13));  // Vòng lặp chạy nhiều lần, không return false
    }
    @Test
    public void testLargeNonPrime() {
        assertFalse(checker.isPrime(100)); // vòng for lặp nhiều lần
    }

    @Test
    public void testNotPrimeWithLoopRun() {
        assertFalse(checker.isPrime(15)); // Vòng lặp chạy và return false khi chia hết
    }

    @Test
    public void testSmallestNonPrime() {
        assertFalse(checker.isPrime(1)); // n <= 1
    }

}
