import java.util.Random;
import java.util.Scanner;

public class GenCheeseShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ranGen = new Random(100);

		final int MAXCHEESE = 10;
		double totalCheese = 0;
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		double[] subtotal = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

		if(MAXCHEESE > 0) {
			names[0] = "Dalaran Sharp";
			prices[0] = 1.25;}
		if(MAXCHEESE > 1) {
			names[1] = "Stormwind Brie";
			prices[1] = 10.00;}
		if(MAXCHEESE > 2) {
			names[2] = "Alterac Swiss";
			prices[2] = 40.00;}
		if(MAXCHEESE > 3 ){
			for(int i = 3; i < MAXCHEESE; i++) {
				names[i] = "Cheese Type " + (char)('A' + i);
				prices[i] = ranGen.nextInt(1000)/100.0;
				amounts[i] = 0;
			}}

		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");

		if(MAXCHEESE > 0) {
			for(int i = 0; i < MAXCHEESE; i++){
				System.out.println(names[i] +": $" + prices[i] + " per pound");
			}
		}

		if(MAXCHEESE > 0) {
			for(int i = 0; i<MAXCHEESE; i++) {
				System.out.print("Enter the amount of " + names[i] + " in lbs: ");
				amounts[i] = input.nextInt();
			}
		}
		if(MAXCHEESE > 0) {
			for(int i = 0; i<MAXCHEESE; i++) {
				subtotal[i] = (double)(amounts[i]*prices[i]);
			}
		}

		System.out.print("Display itemize list?(1 for yes):");
		int items = input.nextInt();

		if(items == 1) {
			for(int i = 0; i < MAXCHEESE; i++ ) {
				System.out.println(amounts[i]+ " lbs of " + names[i] + " @ $" + prices[i] + " = $" + subtotal[i]);}
		}

		for(int i = 0; i<MAXCHEESE; i++) {
			totalCheese += subtotal[i];
		}
		System.out.println("Sub Total: $" + totalCheese );

		if(totalCheese >= 50 && totalCheese < 100){
			totalCheese -= 10.00;
			System.out.println("-Discount: $10.00");
		}else{ 
			if(totalCheese >= 100){
				totalCheese -= 25;
				System.out.println("-Discount: $25.00");
			}else{ 
				System.out.println("-Discount: $0.00");
			}
		}

		System.out.println("Total : $"+ totalCheese);
		input.close();
	}}