package recursion;

public class Halved {

	// Return the result of dividing n by 2, ignoring any 
	// fractional parts of the result. For example, halved(6) 
	// and halved(7) should both return 3. Assume n will not 
	// be negative.
	public int halved(int n) {
		// Fill-in the test for the conditional below,
		// but don't change anything else.
		if( n == 0 || n == 1) //two that can give you error
			return 0; //base case
		else 
			return (1 + halved(n - 2));//recursion case; Provided code was: return (1 + halved(n - 2));
		
	}// end method

	public static void main(String[] args) {
		Halved s = new Halved(); 

		System.out.println(s.halved(0));
		System.out.println(s.halved(6));
		System.out.println(s.halved(7));

	}//end class


}
