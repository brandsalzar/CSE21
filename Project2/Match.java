import java.io.FileNotFoundException;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Match {
	public static void main(String[] args) {
		Student [] students = new Student[100];
		int count = 0;
		int bestScore =0;
		int bestMatch=0;
		System.out.println("Enter the name of file to open: ");
		Scanner input = new Scanner(System.in);
		try{ 
		String filename = input.next();
		Scanner fileInput = new Scanner (new FileReader(filename));
		
		while (fileInput.hasNextLine()){

			Scanner line = new Scanner(fileInput.nextLine());
			line.useDelimiter("[\t\n]");
			String name = line.next(); 
			String gender = line.next(); 
			String date = line.next();

			Scanner birthDateReader = new Scanner (date);
			birthDateReader.useDelimiter("[-]");
			int month = birthDateReader.nextInt();
			int day = birthDateReader.nextInt();
			int year = birthDateReader.nextInt();

			int quietTime = line.nextInt(); 
			int music = line.nextInt();
			int reading = line.nextInt();
			int chatting = line.nextInt(); 

			Date birthdate = new Date(month, day, year);
			Preference pref = new Preference(quietTime, music, reading, chatting);
			Student studentAdd = new Student(name, gender.charAt(0), birthdate, pref);
			students[count] = studentAdd;
			count++;
		}//end while loop
		for(int i = 0; i<count;i++) {//goes through all i for 1 j
			if(!students[i].getMatch()){
				for(int j = i+1; j<count; j++) {
					if(!students[j].getMatch()){
						int check = students[i].compare(students[j]);
						if(check>bestScore) {
							bestScore = check;
							bestMatch = j;
						}//end best score checker
					}//end 2nd student match
				}//end for loop
				if(bestScore!=0) {
					students[i].setMatch(true);
					students[bestMatch].setMatch(true);
					System.out.println(students[i].getName()+" matches with "+ students[bestMatch].getName()+ " with the score "+bestScore);
				}//end if
				else {
					if(!students[i].getMatch()) {
						System.out.println(students[i].getName()+" has no matches.");
					}//end if
				}//end else
			}//end 1st student match
			bestScore = 0;
		}//end for loop
		}catch(NoSuchElementException e) {
			System.out.println(e); 
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		/*algorithm for  matching
		 * 
		 * Your algorithm for matching should work something like this:
For(student !=currently matched){ 
Foreach rest of students NOT currently matched
currentScore = studentA.compare(studentB)
if ()the currentScore is better than MaxScore
bestMatchStudent is student
bestMatchScore is currentScore

studentA is now Matched
bestMatchStudent is now Matched
		 */
		/*studentA.compare(studentB)
		 * 
		 * if(!students[j].getMatched()) // student not matched already
currentScore = students[i].compare(students[j]);
		 */

	}//end main
}//end class match
