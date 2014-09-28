package com.farevee.shopping;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.farevee.groceries.Item;
import com.farevee.groceries.ManyPackages;
import com.farevee.groceries.Units;
import com.farevee.groceries.Weight;

/**
 * Implements the service of a shopping cart by adding an item to the cart, viewing the number of things <br>
 * in the cart , printing the contents of the cart, getting the total price and weight of the cart, removing <br>
 * things from the cart and merging things from the cart
 * @author Albert Owusu-Asare
 *
 */
public class Cart{

	/*
	 * Fields 
	 */
	int itemCounter; // stores the number of items in the cart
	int entryCounter; // used for counting the number of entries
	int totalPrice; // stores the total price for the cart
	LinkedList<Item> storage = new LinkedList<Item>(); // stores items
	
	/**
	 * Constructs a cart
	 * @param none
	 */
	
	public Cart(){
		this.itemCounter = 0;
		this.entryCounter = 0;
		this.totalPrice =0;
		
	}
	/**
	 * Adds an {@link Items} to the list
	 * @param item item to be added
	 * @return none
	 */
	public void addItem(Item item){
		
		// if item is of ManyPackages type
		if(item instanceof ManyPackages){
			this.itemCounter += ((ManyPackages) item).getCount();
		}
		else {
			this.itemCounter ++;
		}
		
		entryCounter ++;
		storage.add(item);
	}
	
	/**
	 * Returns the number of {@link Items} in the cart
	 */
	
	public int numThings(){
		return this.itemCounter;
	}
	
	/** 
	 * Returns the number of entries in the <code> cart </code>
	 */
	
	public int numEntries(){
		return this.entryCounter;
	}
	
	/**
	 * Prints the contents of the <code> cart </code> 
	 * @param pen , prints representation of object to an output stream
	 */
	public void printContents (PrintWriter pen){
		for(Item shopItem : storage){
			pen.println(shopItem);
		}
	}
	
	/**
	 * Returns the total price for the <code> cart </code>
	 * @return
	 */
	public int getPrice(){
		
		for(Item shopItem : storage){
			this.totalPrice += shopItem.getPrice();
		}
		
		return this.totalPrice;
	}
	
	/**
	 * Returns an array of weights representing the total of the 4 various weights: <br>
	 * {@link com.farevee.groceries.Units#POUND  POUND }, {@link com.farevee.groceries.Units#KILOGRAM  KILOGRAM },
	 * {@link com.farevee.groceries.Units#OUNCE  OUNCE },{@link com.farevee.groceries.Units#GRAM GRAM }
	 * @return weightArray, an Array of weights, where : <br>
	 *                                               <br> weightArray[0] = total pound weight<br>
	 *                                                weightArray[1] = total ounce weight<br>
	 *                                                weightArray[2] = total kilogram weight<br>
	 *                                                weightArray[3] = total gram weight<br>
	 *                                                
	 */
	
	
	
	public Weight[] getWeight(){
		
		int totalPounds = 0;
		int totalOunces = 0;
		int totalKilograms = 0;
		int totalGrams = 0;
		
		// loop through list add weight magnitude to corresponding total
		for(Item shopItem : storage){
			
			//get the units and magnitude of weight of current item
			Units itemUnit = shopItem.getWeight().getWeightUnits();
			int unitAmount = shopItem.getWeight().getWeightAmount();
			
			//if item units is POUND
			if(itemUnit.equals(Units.POUND)){
				totalPounds += unitAmount;
			}
			//if item units is OUNCE
			else if (itemUnit.equals(Units.OUNCE)){
				totalOunces += unitAmount;
			}
			//if item units is GRAM
			else if (itemUnit.equals(Units.GRAM)){
				totalGrams += unitAmount;
			}
			else if(itemUnit.equals(Units.KILOGRAM)){
				totalKilograms += unitAmount;
			}
			// if item units
		}
		Weight totalPoundWeight = new Weight(Units.POUND, totalPounds);
		Weight totalOunceWeight = new Weight(Units.OUNCE, totalOunces);
		Weight totalKilogramWeight = new Weight(Units.KILOGRAM, totalKilograms);
		Weight totalGramWeight = new Weight(Units.GRAM, totalGrams);
		
		return new Weight[]{totalPoundWeight,totalOunceWeight, totalKilogramWeight,totalGramWeight };
	}
	
	/**
	 * Removes all of the products whose name exactly matches 'name'
	 * @param name the name to search for
	 * @return non
	 */
	public void remove(String name){
		/*int counter = 0;
		for(Item shopItem : storage){
			counter++;
			if( shopItem.)
		}
		*/
	}
	
	
	
}
