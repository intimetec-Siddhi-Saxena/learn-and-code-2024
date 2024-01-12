import java.io.*;
import java.util.Arrays;

public class KaprekarConstant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a 4-dgit number with at least two different digits");
        int number = Integer.parseInt(br.readLine());
        int numberOfIterations = checkKaprekarRoutine(number);
        if(numberOfIterations != -1) {
			System.out.println("Kaprekar's constact reached in " + numberOfIterations + " iterations.");
		}
    }
    public static int[] getDigitsArray(int number) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int checkKaprekarRoutine(int number) {
        int numberOfIterations = 0;
        while (number != 6174) {
            int[] digits = getDigitsArray(number);
            Arrays.sort(digits);
            int ascendingNumber = getNumber(digits);
            int desceningNumber = getNumber(getReverseArray(digits));

            number = desceningNumber - ascendingNumber;
            numberOfIterations++;
            System.out.println(numberOfIterations + ". " + desceningNumber + " - " + ascendingNumber + " = " + number);
        }
        if(number == 6174) {
			return numberOfIterations;
        }
        else {
			return -1;
        }
    }
    public static int getNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        return number;
    }
    public static int[] getReverseArray(int[] array) {
        int[] reversedArray = new int[4];
        for (int i = 0; i < 4; i++) {
            reversedArray[i] = array[3 - i];
        }
        return reversedArray;
    }
}
