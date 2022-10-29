package recursion;

public class DigitCount {
	// Fix the bug in digitCount, so that it returns correct values.
	// You only need to change one line.
	public static int digitCount(int value) {
		if( value <= 9)//value == 0) (0 <= value && value <= 9
			return 1;
		else
			return 1 + digitCount(value/10);// changed inside the recursing method (value/10) to (value/20) and  (value/8), yielded similar results, but not the wanted ones
	}//end method
	
	public static void main(String[] args) {

		System.out.println(digitCount(0));
		System.out.println(digitCount(10));
		System.out.println(digitCount(314159));

	}//end main class
}// end java class
