package com.farevee.shopping;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;

import com.farevee.groceries.Package;
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
	private int itemCounter; // stores the number of items in the cart
	private int entryCounter; // used for counting the number of entries
	private int totalPrice; // stores the total price for the cart
	private Weight [] cartWeight;
	private LinkedList<Item> storage = new LinkedList<Item>(); // stores items
	
	
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
		
		this.cartWeight = new Weight[]{totalPoundWeight,totalOunceWeight, totalKilogramWeight,totalGramWeight };
		return this.cartWeight;
	}
	
	/**
	 * Removes all of the products whose name exactly matches 'name'
	 * @param name the name to search for
	 * @return non
	 */
	public void remove(String name){
		int index;
		
		// loop through list 
		for(index = 0; index <= storage.size(); index++){
			Item cartItem =storage.get(index) ;
			if (name.equals(cartItem.getItemName())){
				
				/*Update cart information*/
				
				//update entryCounter and itemCounter
				if(cartItem instanceof ManyPackages){
					this.itemCounter -= ((ManyPackages) cartItem).getCount();
				}
				else {
					this.itemCounter --;
				}
				this.entryCounter --;
				
				//delete item from cart
				storage.remove(index);
			}
		}
		
		 
	}
	
	/**
	 * Merges identical items together. 
	 * <p>  Finds identical items and merges them into a single item. For example, if you have two Package items with the same name, weight, and price, 
	 * <br> both Packages are combined into a single {@link com.farevee.groceries.ManyPackages  ManyPackages} object. If you have {@link com.farevee.groceries.ManyPackages  ManyPackages} and a {@link com.farevee.groceries.Packages  Package} object of the same kind, you should combine<br>
	 *  them. Continuing, if you have two {@link com.farevee.groceries.ManyPackages  ManyPackages} objects that contain the same kind of {@link com.farevee.groceries.Packages  Package}, both are  combined  into a single {@link com.farevee.groceries.ManyPackages  ManyPackages} <br>
	 * object. Similarly, if you have two {@link com.farevee.groceries.BulkItem  BulkItem} objects with the same food and units, you should combine them into one {@link com.farevee.groceries.BulkItem  BulkItem}. However, there is no way to <br>
	 * combine {@link com.farevee.groceries.BulkContainer  BulkContainer} objects with anything. This method does not need to do anything with {@link com.farevee.groceries.NonFood  NonFood} objects.
	 * @param none
	 * @return none
	 */
	
	public void merge(){
		ArrayList<Integer> packageIndex= new ArrayList<Integer>();
		int index;
		// loop through list 
		for(index = 0; index <= storage.size(); index++){
			Item cartItem = storage.get(index);
			// if item is a Package
			if (cartItem instanceof Package){
				Package temp = (Package) cartItem;
				packageIndex.add(index);
				
			//run through the packageIndex array to check if any Index has similar as our current package
			for(Integer s : packageIndex){
				if(storage.get(s).equals(temp)){
					Package temporal = new Package(temp.getItemName(), temp.getItem(), storage.get(s).getWeight().add(temp.getWeight()) );
					
				};
			}
		
			
			}
			
		}
		
		
	}
	
	

	
	
}
