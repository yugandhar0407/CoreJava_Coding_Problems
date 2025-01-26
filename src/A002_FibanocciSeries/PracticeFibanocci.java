package A002_FibanocciSeries;

public class PracticeFibanocci {

	public static void main(String[] args) {
			
		int num1 = 0;
		int num2 = 1;
		int sumOfNum = 0;
		
		for(int i=1; i<=15; i++) {
			
			System.out.print(i+"("+sumOfNum+")" + " ");
			
			num1 = num2;
			
			num2 = sumOfNum;
			
			sumOfNum = num1+num2;
		}

	}

}
