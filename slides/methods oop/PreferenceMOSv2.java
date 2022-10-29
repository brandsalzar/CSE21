import java.util.Scanner;

/* 
 * CSE21
 * Instructor: Santosh Chandrasekhar
 */

public class PreferenceMOSv2 {
	
	// Global variable shared by all methods
	public static int MAX;
	
	// Method to get sample size
	public static void getSampleSize(Scanner in) {
		System.out.print("Enter the total number of students: ");
		MAX = in.nextInt();
	}
	
	/* Method to get student choice and increment appropriate counter. 
	 * Note that this method can be re-written without the third argument by 
	 * using the global variable MAX in the for-loop instead.
	 */
	public static void tallyCounter(Scanner in, int[] tcounter, int max) {
		int choice = 0;
		for (int i = 0; i < max; i++) {
			System.out.print("Enter choice: ");
			choice = in.nextInt();
			if (choice == 1)
				tcounter[0]++;
			else if (choice == 2)
				tcounter[1]++;
			else if (choice == 3) {
				tcounter[0]++;
				tcounter[1]++;
			} else
				tcounter[2]++;
		}
			
	}
	
	// Method to display the counts.
	public static void seeCount(Scanner input, int[] tally) {
		System.out.print("See detailed count? Yes (1), or No (0): ");
		int detailed = input.nextInt();
		if (detailed == 1) {
			System.out.println("Prefer Android = " + tally[0]);
			System.out.println("Prefer iOS = " + tally[1]);
			System.out.println("Prefer Other = " + tally[2]);
		}
		
	}
	
	public static void main(String[] args) {
		// Use scanner to get user inputs
		Scanner input = new Scanner(System.in);
		
		// Initialize all tally counters, this time using an array of integers
		int tally[] = new int[3];
		tally[0] = tally[1] = tally[2] = 0;
				
		// Get sample size
		getSampleSize(input);
		
		// For each student, get choice and increment appropriate counter 
		System.out.println("Preference? Android (1), iOS (2), or Both (3).");
		tallyCounter(input, tally, MAX);
		
		// Output the counts
		seeCount(input, tally);
		input.close(); 
	}

}
