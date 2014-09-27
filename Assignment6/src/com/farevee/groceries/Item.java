package com.farevee.groceries;

/**
 * This is an interface representing an abstract item
 */
public interface Item {

	/**
	 * Gets the weight of the item
	 * @return the weight of the current item
	 */
	Weight getWeight();
	
	/**
	 * Gets the Price of the item
	 * @return the price of the current item
	 */
	int getPrice();
	
	/**
	 * Prints information about the current item
	 * @return the price of an item. 
	 */
	String toString();
}