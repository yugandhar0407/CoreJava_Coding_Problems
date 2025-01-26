package A007_Factorial;

/*
 * The factorial of a number 𝑛 n (denoted as 𝑛!n!) is the product of all positive integers less than or equal to 𝑛 n.
   For example:
5!=5×4×3×2×1=120
0!=10!=1 (by definition)
 */
public class FactorialInJava {

	public static void main(String[] args) {

		int i, fact = 1;
		
		int number = 5;

		for (i=1; i<=number; i++) {
			
			fact = fact * i;
		}
		
		System.out.println("The Factorial series is 5*4*3*2*1");

		System.out.println("The Factorial of 5 is: " + fact);
	}
}

