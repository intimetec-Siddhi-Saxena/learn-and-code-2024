import org.junit.Test;
import static org.junit.Assert.*;

public class KaprekarConstantTest {

    @Test
    public void testGetDigitsArray() {
        int number = 1234;
        int[] expected = {4, 3, 2, 1};
        assertArrayEquals(expected, KaprekarConstant.getDigitsArray(number));
    }

    @Test
    public void testCheckKaprekarRoutine() {
        
        int number1 = 3524; // Valid input
        assertEquals(3, KaprekarConstant.checkKaprekarRoutine(number1));
        
        int number2 = 1111; // Invalid input
        assertEquals(-1, KaprekarConstant.checkKaprekarRoutine(number2));

    }

    @Test
    public void testGetNumber() {
        int[] digits = {4, 3, 2, 1};
        int expected = 1234;
        assertEquals(expected, KaprekarConstant.getNumber(digits));
    }

    @Test
    public void testGetReverseArray() {
        int[] array = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        assertArrayEquals(expected, KaprekarConstant.getReverseArray(array));
    }
}
