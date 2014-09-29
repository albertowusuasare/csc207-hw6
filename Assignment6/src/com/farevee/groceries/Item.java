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
	 * Returns information about this <code> Item </code>
	 */
	String toString();
	
	/**
	 * Returns the name of the item
	 */
	String getItemName();
}
