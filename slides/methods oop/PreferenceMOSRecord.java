import java.util.Scanner;

/* 
 * CSE21
 * Instructor: Santosh Chandrasekhar
 */

public class PreferenceMOSRecord {
	public static void main(String[] args) {
		// Use scanner to get user inputs
		Scanner input = new Scanner(System.in);

		// Get sample size
		System.out.print("Enter the total number of students: ");
		final int MAX = input.nextInt();
	
		// Initialize all tally counters
		int android, ios, other;
		android = ios = other = 0;
		
		// Keep track of student choices in array 
		int choices[] = new int[MAX];
			
		// For each student, store choice in array and increment appropriate counter
		System.out.println("Preference? Android (1), iOS (2), or Both (3). ");
		for (int i = 0; i < MAX; i++) {
			System.out.print("Enter choice: ");
			choices[i] = input.nextInt();
			if (choices[i] == 1)
				android++;
			else if (choices[i] == 2)
				ios++;
			else if (choices[i] == 3) {
				android++;
				ios++;
			} else
				other++;
		}
		
		// Output the counts
		System.out.print("\nSee detailed count? Yes (1), or No (0): ");
		int detailed = input.nextInt();
		if (detailed == 1) {
			System.out.println("Prefer Android = " + android);
			System.out.println("Prefer iOS = " + ios);
			System.out.println("Prefer Other = " + other);
		}
		
		// Count students who exclusively prefer Android and not iOS
		int i; 
		int androidOnly = 0;
		for (i = 0; i < choices.length; i++) {
			if (choices[i] == 1)
				androidOnly++;
		}
		System.out.println("\nPrefer Android only = " + androidOnly);

		// Check to see if there are any students who prefer both
		boolean preferBoth= false;
		for (i = 0; i < choices.length; i++) {
			if (choices[i] == 3) {
				preferBoth = true;
				break; // Just need one person
			}
		}
		if (!preferBoth) // This is True when preferBoth is False
			System.out.println("No one prefers both!");
		else
			System.out.println("There are students who prefer both Android and iOS");
		
		input.close();
	}
}
