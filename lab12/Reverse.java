package recursion;

public class Reverse {

	/*
	 * Now, write a recursive solution to reverse without using any helper methods.
	 * That is, reverse should only call reverse (and some string manipulation methods).
	 */


	public String reverse(String s) {

		if (s.length() <= 0) 
			return "";

		else
			return reverse(s.substring(1)) + s.substring(0,1);// the recursive case! 


	}


	//////// HELPER METHODS YOU MIGHT FIND USEFUL

	// Returns a string containing all the characters except the first
	public static String allButFirst(String s) {
		return s.substring(1);
	}

	// Returns a string containing all the characters except the last
	public static String allButLast(String s) {
		return s.substring(0, s.length());
	}	

	public static void main(String[] args) {
		Reverse s = new Reverse();
		System.out.print(s.reverse("Reverse this string"));

	}//end class

}

/*//works!!
 * public String reverse(String s) {

		if ((null == s) || (s.length() <= 1)) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);// the recursive case! 


	}
 * 
 */
