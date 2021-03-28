package taudemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithAssertionTest {

    @Test
    public void firstAssertion() {
        assertEquals(2, 2);
    }

    @Test
    public void secondAssertion() {
        assertEquals(34, 34);
    }
}
