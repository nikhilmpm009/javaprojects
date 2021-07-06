package hello;

public class Calculator {

	int sum(int x, int y) {

		return (x + y);
	}

	byte diff(byte a, byte b) {

		byte result = 0;
		result = (byte) (a - b);
		return result;
	}

	int mul(int f, int d) {
		int mul = 0;
		int dd = 2 * d;

		while (dd != d) {

			mul = f + mul;
			d = d + 3;
		}
		return mul;
	}
}

// TODO Auto-generated method stub
