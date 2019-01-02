package PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class isevenTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    iseven test = new iseven();

    @Test
    public void iseven_success(){
        int i = 4;
        int j = 1296;
        String expectedValue1 = "true";
        String expectedValue2 = "true";
        String actualValue1 = test.isEven(i);
        String actualValue2 = test.isEven(j);
        assertEquals(expectedValue1,actualValue1);
        assertEquals(expectedValue2,actualValue2);
    }
    public void iseven_failure(){
        int i = 518;
        int j = 525;
        String expectedValue1 = "false";
        String expectedValue2 = "false";
        String actualValue1 = test.isEven(i);
        String actualValue2 = test.isEven(j);
        assertEquals(expectedValue1,actualValue1);
        assertEquals(expectedValue2,actualValue2);
}