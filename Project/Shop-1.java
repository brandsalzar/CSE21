import java.util.Scanner;
public class Shop {

	static String[] itemNames;
	static double[] itemPrices;
	static int[] itemAmount;
	static double[] finalPrice;

	public static void setupShop(Scanner input, String[] itemNames, double[] itemPrices, int[] itemAmount,int discAmount, double discRate, double[] finalPric,int setup) {
		input = new Scanner(System.in);

		System.out.print("Please enter the number of items: ");    
		int item = input.nextInt();  

		itemNames = new String[item];
		itemPrices = new double[item];
		itemAmount = new int[item];
		finalPrice =  new double[item];

		for(int i = 0; i < itemNames.length; i++) {
			System.out.print("Enter name of product "+ i +": "); 
			itemNames[i] = input.next();     
			System.out.print("Enter price of product "+ i +": ");
			itemPrices[i] = input.nextDouble();
		}
		System.out.print("Please enter the amount to qualify for discount: "); 
		discAmount = input.nextInt();
		System.out.print("Please enter the discount rate (0.1 for 10%): ");  
		discRate = input.nextDouble(); 
		System.out.print("\n");

		setup = 1;
	}	

	public static void buyItems(Scanner input, String[] itemNames, int[] amount, int discAmount, int setup) {
		if(setup == 0){
			System.out.print("Shop is not setup yet! \n\n");
		}else{
			input= new Scanner(System.in);
			setup = 2;

			for(int i = 0; i < amount.length; i++) {
				System.out.print("Enter the amount of " + itemNames[i]);
				amount[i] = input.nextInt();
			}
		}
	}

	public static void listItems(Scanner input, String[] itemNames, double[] itemPrices, int[] amount, int setup, double[] finalPrice) {
		if(setup == 0) {
			System.out.print("Shop is not setup yet! \n\n");
		}else{
			if(setup == 1) {
				System.out.print("Try again: You have not bought anything \n\n");
			} else {
				input= new Scanner(System.in);
				setup = 3;

				for(int i = 0; i < finalPrice.length; i++)
					finalPrice[i] = (double)(itemPrices[i]*amount[i]);

				for(int i = 0; i < amount.length; i++) {
					System.out.print(amount[i] + " count of "+ itemNames[i] + " @ "+ itemPrices[i]+" = $" + finalPrice);
					amount[i] = input.nextInt();
				}
			}
		}
	}
	/*III. List of Items
		   1) If setup is not yet done, then ask user to setup shop first
		   2) If setup is done but the customer hasn’t bought anything, then ask customer to buy first
		   3) For each item purchased (non-zero amount)
		       a) Display amount purchased and price per item0
	 */
	public static void checkOut(double[] itemPrices, int discAmount, double discRate, int setup, double[] finalPrice) {
		if(setup == 0) {
			System.out.print("Shop is not setup yet! \n\n");
		}else{
			if(setup == 1) {
				System.out.print("Try again: You have not bought anything \n\n");
			} else {
				double total= 0;
				double subtotal;

				for (int i = 1; i < itemPrices.length; i++ )
					total +=  finalPrice[i] +finalPrice[i+1];

				if(total > discAmount)
					discRate = total*discRate;

				subtotal = total - discRate;

				System.out.println("Thanks for coming! \nSub Total: $"+ total+"\n-Discount: $"+ discRate +"\nTotal: $"+subtotal);}
		}
	}
	/*IV. Check out
		   1) If setup is not yet done, then ask user to setup shop first
		   2) If setup is done but the customer hasn’t bought anything, then ask customer to buy first
		   3) Display the summary
		       a) Sub total
		       b)  Discount
		       c) Total
	       4) End the program
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int discAmount = 0;
		double discRate = 0;
		int setup = 0;
		int option;

		for(int i = 1; i > 0;){ 
			option = 0;
			System.out.print("This program supports 4 functions: \n   1. Setup Shop \n   2. Buy \n   3. List Items \n   4. Checkout \nPlease Choose the function you want: ");
			option = input.nextInt();
			System.out.print("\n");

			if(option == 4 && setup >= 3) {
				checkOut(itemPrices,discAmount,discRate, setup, finalPrice);
			}else{
				if(option == 3 && setup >= 2) {
					listItems(input, itemNames, itemPrices, itemAmount, setup, finalPrice);}else {

						if(option == 2 && setup >= 1) {
							buyItems(input, itemNames, itemAmount, discAmount, setup);}else {

								if(option == 1 && setup >= 0) {
									setupShop(input, itemNames, itemPrices, itemAmount, discAmount, discRate,finalPrice,setup);
								} else { 
									if(option == 0 || option > 4)
										System.out.println("Error: Do Not Know " + option + "\n");
								}//end loop 4
							}// end for loop3
					}//end else 2
			}//end else 1
		}//end for-loop
	}//end method
}//edn class 
