package arraylist;

import java.util.ArrayList;

public class ArrayListRunner {
	
	// Use this class to run your code

	public static void main(String[] args) {
		
		testArrayList();
		//TrackedArrayList c = new TrackedArrayList(); //added
	
	}

	
	
	public static void testArrayList() {
		
		TrackedArrayList<String> words = new TrackedArrayList<String>();//this changed
		words.add ("a");   //[a]
		words.add ("b");   //[a, b]
		words.add ("c")  ; //[a, b, c]
		words.remove ("b");//[a, c]
		
		System.out.println(words.maxSizeSoFar());//added
		
		words.add ("d");   //[a, c, d]
		words.remove ("a");//[c, d]
		words.add ("e");   //[c, d, e]
		words.remove ("b");//[c, d, e]
		words.add ("d");   //[c, d, e, d]
		words.remove ("c");//[d, e, d]
		
		System.out.println(words.maxSizeSoFar());
		
		words.remove ("d");//[e, d]
		
		System.out.println(words.toString());
	}
}
