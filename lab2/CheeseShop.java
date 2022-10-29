import java.util.Scanner;
public class CheeseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cheese = new Scanner(System.in);

		double sharp = 1.25;
		double brie = 10.00;
		double swiss = 40.00;

		System.out.println("We sell 3 kinds of Cheese");
		System.out.println("Dalaran Sharp: $1.25 per pound");
		System.out.println("Stormwind Brie: $10.00 per pound");
		System.out.println("Alterac Swiss: $40.00 per pound");

		System.out.println("Enter the amount of Sharp in lbs: ");
		int sharpLb = cheese.nextInt();
		System.out.println("Enter the amount of Brie in lbs: ");
		int brieLb = cheese.nextInt();
		System.out.println("Enter the amount of Swiss in lbs: ");
		int swissLb = cheese.nextInt();

		double sharpSale = (double)(sharpLb*sharp);
		double brieSale = (double)(brieLb*brie);
		double swissSale = (double)(swissLb*swiss);

		System.out.println("Display the itemized list? (1 for yes)"); 
		int items = cheese.nextInt();

		if(items == 1){
			if(sharpLb != 0){
				System.out.println(sharpLb + " lbs of Sharp @ $1.25 = $" + sharpSale);}
			if(brieLb != 0){
				System.out.println(brieLb + " lbs of Brie @ $10.00 = $" + brieSale);}
			if(swissLb != 0){
				System.out.println(swissLb + " lbs of Swiss @ $40.00 = $" + swissSale);}
		}

		double totalCheese = sharpSale + brieSale + swissSale;  

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

		cheese.close();
	}
}


