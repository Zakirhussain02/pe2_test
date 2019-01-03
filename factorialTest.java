package PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class factorialTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    factorial fact = new factorial();
    //for int
    @Test
    public void fact_successs(){
        int i = 7;
        int j = -7;
        int expectedValue1 = 5040 ;
        String expectedValue2 = "negative number";
        int actualValue1 = fact.fact_int(i);
        int actualValue2 = fact.fact_int(j);
        assertEquals(expectedValue1,actualValue1);
        assertEquals(expectedValue2,expectedValue2);
    }

    //for long
    @Test
    public void facts_failure(){
        long i = -7;
        long j = 0;
        long k = 12;
        long expectedValue3 = 479001600;
        long expectedValue1 = 1;
        String expectedValue2 = "negative number";
        long actualValue1 = fact.fact_long(i);
        long actualValue2 = fact.fact_long(j);
        long actualValue3 = fact.fact_long(k);
        assertEquals(expectedValue1,actualValue1);
        assertEquals(expectedValue2,actualValue2);
        assertEquals(expectedValue3,actualValue3);


    }

}