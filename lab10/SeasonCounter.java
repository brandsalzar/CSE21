package oop;

public class SeasonCounter extends ModNCounter {


	private static String[] names =  {"spring", "summer", "fall", "winter"};


	public SeasonCounter() {
		// fill-in by creating an object with 4 as the modulus
		super(4);
		ModNCounter c = new ModNCounter(4); 
		c.toString();
	}


	@Override
	public String toString() {
		// fill-in so it returns the season name
		int i = value();

		if(i<4) {
			return names[i];
		}else {
			return "";
		}//end loop
	}//end Method

}//end class