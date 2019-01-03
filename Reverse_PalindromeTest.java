package PE2;
import org.junit.Test;
import static org.junit.Assert.*;
public class Reverse_PalindromeTest {
    Reverse_Palindrome object = new Reverse_Palindrome();
    @Test
    public void ReverseInputSuccess(){
        String value="111";
        String expectedValue="111";
        String actualValue=object.Reverse_String(value);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void ReverseInputFailure(){
        String value="12345";
        String expectedValue="12345";
        String actualValue=object.Reverse_String(value);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void PalindromeCheck(){
        String value="22222";
        String expectedValue="22222 is a Palindrome";
        String actualValue=object.Palindrome(value);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void NotAPalindromeCheck(){
        String value="1234567";
        String expectedValue="1234567 is not a Palindrome";
        String actualValue=object.Palindrome(value);
        assertEquals(expectedValue,actualValue);
    }
}
