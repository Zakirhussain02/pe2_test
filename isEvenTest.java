package PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class isEvenTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    iseven test = new iseven();

    @Test
    public void iseven_success() {
        int i = 4;
        int j = 1296;
        boolean expectedValue1 = true;
        boolean expectedValue2 = true;
        boolean actualValue1 = test.isEven(i);
        boolean actualValue2 = test.isEven(j);
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
    }

    public void iseven_failure() {
        int i = 518;
        int j = 525;
        boolean expectedValue1 = false;
        boolean expectedValue2 = false;
        boolean actualValue1 = test.isEven(i);
        boolean actualValue2 = test.isEven(j);
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
    }
}