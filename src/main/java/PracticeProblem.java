import java.io.IOError;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {

	}


	public static boolean validIndex(int[] intarray, int integer) {
		try {
			int value = intarray[integer];
			return true;
		}

		catch(ArrayIndexOutOfBoundsException error) {
			return false;
		}
	}

	public static int divide(int a, int b) {
		try {
			return a / b;
		}

		catch(ArithmeticException error) {
			return 0;
		}
	}

	public static int safeConvertStringtoInt(String string) {
		try {
			return Integer.parseInt(string);
		}

		catch(NumberFormatException error) {
			return 0;
		}
	}
}

