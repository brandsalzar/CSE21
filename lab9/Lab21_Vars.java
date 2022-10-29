import java.util.*;

public class Lab21_Vars {

	public static void main(String[] args) {

		int i, j;
		i=j=0;
		int var0, var1;

		// Fix 1: Correctly typecast 5.0 to an int so it can assigned to var3.
		int var2 = 0, var3 =(int)(5.0); // var3 = 5.0;

		// Fix 2: Correctly declare a variable as an array.
		int[] arri0 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};//int arri0 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		double[] arrd0 = {0.0, 1.0, 2.0, 3.0, 4.0};

		// Fix 3: What's wrong with temp? Fix it.
		int temp;//added
		if(i < j) {
			temp = 0; //int temp = 0;
			System.out.println("Temp is " + temp);
		} else {
			temp = 1;
			System.out.println("Temp is " + temp);
		}

		// Fix 4: Correctly calculate square of sums and print it as total.
		int total = 0;//moved from the for-loop to the whole scope of the class
		for ( i = 0; i < 10; i++) {//deleted the "int" in the for loop; i has already been declared
			total += i*i;
		}
		System.out.println("i value is " + i);
		System.out.println("Total is " + total);

		// Fix 5: Figure out the logical error in lines 36-42, and correct it.
		//imported the Cheese.java class so that variables with data type Cheese work accordingly
		Cheese jack = new Cheese();//Cheese jack; 
		Cheese monterey = new Cheese("Monterey");
		//jack = monterey; deleted so they do not share the same pointer
		System.out.println("Monterey name is " + monterey.getName());
		jack.setName("Jack");
		System.out.println("Jack name is " + jack.getName()); 
		System.out.println("Monterey name is still " + monterey.getName());

		// Fix 6: Make the following code shorter by combining redundant 
		//        (unnecessary/duplicate) statements
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int num1 = input.nextInt();//added

		if(num1>var3) {
			System.out.println("First is greater");
		}else {
			if(num1<=var3)
				System.out.println("First is Less than or equal");
		}//end If-Else #1

		System.out.print("Enter second number: ");
		int num2 = input.nextInt();

		if(num2<var3){
			System.out.println("Second is Less than");
		}else {
			if(num2>=var3) 
				System.out.println("Second is Greater or equal");
		}//end If-Else #2

		// Fix 7: Print out the first number entered by the user
		//        (Hint - You will need to modify the above code)
		System.out.print(num1);
	}


}


