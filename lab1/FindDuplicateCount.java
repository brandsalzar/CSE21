
public class FindDuplicateCount {

	public static void main(String[] args) {

		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};

		int dupCou = 0;
		int j = 0;
		int i = 0;

		for(i = 0; i < arr.length; i++) {
			for(j = i+1; j < arr.length; j++) {

				if(arr[i] == arr[j]) 
					dupCou++;
			}
			if(dupCou ==  1) {
				System.out.println("There are " + dupCou + " more occurrences of value " + arr[i] + " starting at index " + i );
				dupCou = 0;
			} else {if(dupCou == 0) {
				System.out.println("No duplicates with value " + arr[i] + " beyond Index " + i);
				dupCou = 0;
			}else {
				System.out.println("There is only 1 more occurrence of value " + arr[i] + " starting at index " + i);
				dupCou = 0;
			}	
			}
		}
	}
}
