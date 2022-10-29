package oop;

public class Runner {

	public static void main(String[] args) {
		testCounter();

		testCounter7Statements();

		testModNCounter();

		testModNCounter2();

		testDecrementableCounter();

		testSeasonCounter();
	}

	public static void testCounter() {
		System.out.println("-- testing Counter");

		Counter c = new Counter();
		c.increment();
		c.increment();
		c.increment();
		System.out.println(c.value());

	}

	public static void testCounter7Statements() {
		Counter c = new Counter();
		System.out.println("-- testing 7 statements");
		// include exactly 7 increment() and reset() statements below
		c.increment();
		c.reset();
		c.reset();
		c.increment();
		c.reset();
		c.reset();
		c.increment();
		c.reset();
		c.increment();
		c.reset();
		c.reset();
		c.increment();
		c.increment();
		c.increment();

		System.out.println("current value: " + c.value());
	}

	public static void testModNCounter() {
		System.out.println("-- testing ModNCounter");

		ModNCounter c = new ModNCounter(2);

		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		//c.increment();
	}//end Mutator Method

	public static void testModNCounter2() {
		System.out.println("-- testing ModNCounter2");

		ModNCounter2 c = new ModNCounter2(2);

		System.out.println(c.value());
		System.out.println(c.value());
		System.out.println(c.value());

	}//end Mutator Method

	public static void testDecrementableCounter(){
		System.out.println("-- testing DecrementableCounter");

		DecrementableCounter c = new DecrementableCounter();

		for(int i = 0; i < 5; i++) 
			c.increment();

		System.out.println(c.decrement());

	}//end mutator method

	public static void testSeasonCounter() {

		SeasonCounter c = new SeasonCounter();

		System.out.println("-- testing SeasonCounter");

		System.out.println(c);
		c.increment();
		System.out.println(c);
		c.increment();
		System.out.println(c);
		c.increment();
		System.out.println(c);
		c.increment();
	}//end method

}//end Class
