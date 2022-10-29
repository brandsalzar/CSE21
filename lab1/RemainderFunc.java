import java.util.Scanner;
public class RemainderFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner func = new Scanner(System.in);

		System.out.println("Please enter max number:");
		int max =func.nextInt();

		System.out.println("PLease enter the divisor:");
		int div = func.nextInt();

		for(int i = max - 1; i != -1; i--){
			int numRem = max - i;
			System.out.println("Num: " + numRem + " % " + div + " = " + (numRem % div) );
		}              
		func.close();
	}

}
