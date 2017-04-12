import javax.swing.JOptionPane;
import java.lang.Math;
/* 
 * Name: Jack Brashier
 * Date: 04/11/2017
 * Purpose: To demonstrate understanding of Java methods.
 */
public class FivePointOnePartOne {
	public static void main(String [] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Input an integer"));
		JOptionPane.showMessageDialog(null, input + " to the tenth power is " + tenthPow(input));

		int input2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input another integer"));
		JOptionPane.showMessageDialog(null, input + " + " + input2 + " = " + add(input, input2));

		int input3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a final integer"));
		JOptionPane.showMessageDialog(null, "(The square root of " + input + ") + (the absolute value of " + input2 + ") + (" + input3 + " to the " + input2 + " power) = " + customFunction(input, input2, input3));
	}
	public static int tenthPow(int x) {
	return (x*x*x*x*x*x*x*x*x*x);
	}
	public static int add(int x, int y) {
	return (x + y);
	}
        public static double pow(double base, double exponent) {
		double power = 1.0;
		for (double i = exponent; i > 0; i--) {
			power *= base;
			
		}
		return (power);
	}
	public static double sqrt(double x) {
		double root = Math.sqrt(x);
		return (root);
	}
	public static double abs(double y) {
		return ((y >= 0) ? y : (y * -1));
	}
	public static double customFunction(int x, int y, int z) {
		return (sqrt(x) + abs(y) + pow(z, y));
	}
}
