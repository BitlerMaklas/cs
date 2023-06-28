package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16,29,3);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 841 -> 9", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesByUser2() {
        IntList lst = IntList.of(5, 3, 4, 6);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("25 -> 9 -> 4 -> 6", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesByUser1() {
        IntList lst = IntList.of(12, 3, 4, 6);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("12 -> 9 -> 4 -> 6", lst.toString());
        assertTrue(changed);

}
    @Test
    public void testSquarePrimesByUser3() {
        IntList lst = IntList.of(14, 15, 16, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 18", lst.toString());
        assertTrue(!changed);
    }
}
