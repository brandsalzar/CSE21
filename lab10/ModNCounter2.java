package oop;

public class ModNCounter2 extends Counter {

	private int cycleLength; //instance variable

	public ModNCounter2 (int N) {//1-parameter constructor 
		cycleLength = N; 
	}  

	public int value() { //override the superclass value() method
	
		if(cycleLength != (super.value()+1))
			super.increment();
		else 
			reset();
		
		return super.value();
	}//end method
	
}//end class
