package com.farevee.groceries;

import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) {

		// pen for printing
		
		PrintWriter pen = new PrintWriter(System.out,true);
		
		//Test for banana BulkFood and BulkItem
		pen.println("Test for BulkFood and BulkItem");
		BulkFood banana = new BulkFood("banana", 100, Units.POUND, 100);
		BulkItem bananas = new BulkItem(banana, 5, new Weight(Units.POUND,2));
		pen.println(bananas);
		pen.println(bananas.getWeight());
		pen.println(bananas.getPrice() + " cents");
		BulkFood organicBanana = new BulkFood("banana", 100, Units.POUND, 100);
		BulkItem organicBananas = new BulkItem(organicBanana, 5, new Weight(Units.POUND,2));
		pen.println(bananas.equals(organicBananas));
		
		//Test for BulkContainer 
		pen.println();
		pen.println("Test for BulkContainer");
		BulkContainer bag = new BulkContainer("bag", banana,5, new Weight(Units.POUND,2));
		pen.println(bag);
		pen.println(bag.getWeight());
		pen.println(bag.getPrice()+ " cents");
		BulkContainer bag1 = new BulkContainer("bag", banana,5, new Weight(Units.POUND,2));
		pen.println(bag.equals(bag1));
		BulkContainer bag2 = new BulkContainer("bag", banana,5, new Weight(Units.POUND,3));
		pen.println(bag1.equals(bag2));
		
		
		//Test for Package
		pen.println();
		pen.println("Test for Package");
		Package firstPackage = new Package("fruits", bananas,new Weight(Units.POUND,4));
		pen.println(firstPackage);
		pen.println(firstPackage.getWeight());
		pen.println(firstPackage.getPrice()+ " cents");
		
		
		//Test for ManyPackages
		
		pen.println();
		pen.println("Test for ManyPackages");
		ManyPackages manyPackage = new ManyPackages(firstPackage,5);
		pen.println(manyPackage);
		pen.println(manyPackage.getWeight());
		pen.println(manyPackage.getPrice()+ " cents");
		ManyPackages manyPackages = manyPackage;
		pen.println(manyPackages.equals(manyPackage));
		
		
		//Test NonFood
		pen.println();
		pen.println("Test for NonFood");
		NonFood canOpener = new NonFood("can opener", new Weight(Units.OUNCE,2), 349);
		pen.println(canOpener);
		pen.println(canOpener.getWeight());
		pen.println(canOpener.getPrice() + " cents");
		
		
		
	}
	
	

}
