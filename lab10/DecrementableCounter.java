package oop;

public class DecrementableCounter extends Counter{

	public int decrement(){

		int j = value();

		reset();

		if(j != 0)
			for(int i = 1; i<j; i++)
				increment();
		
		return value(); 
	}//end Method

}//end class


/*
 * myCount = 5  
 * then reset to 0
 * increment 4 times 
 * same as 5-1 
 */