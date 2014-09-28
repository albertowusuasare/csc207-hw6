package com.farevee.groceries;

//should supply be included in equal method?
/**
 * This class describes the BulkFood object
 * @author Albert Owusu-Asare
 * Date : Sat Sep 27 11:13:40 CDT 2014
 */

public class BulkFood {
	
	/**
	 * Fields
	 */
	private String name;
	private Units unit;
	private int pricePerUnit;
	private int supply;

	
	/**
	 * Constructs a new {@code BulkFood} with its given information
	 * @param foodName the name of the {@code BulkFood}
	 * @param perUnitPrice the price per unit of the {@code BulkFood}
	 * @param foodUnits the units associated with the {@code BulkFood}
	 * @param foodSupply the total supply of the {@code BulkFood} available
	 * 
	 */
	
	public BulkFood(String foodName ,Units foodUnits, int perUnitPrice, int foodSupply){
		this.name = foodName;
		this.pricePerUnit = perUnitPrice;
		this.unit = foodUnits;
		this.supply = foodSupply;
	}
	

	/**
	 * Sets supply of the {@code BulkFood}
	 * <p> This method will be called each time a {@code BulkFood} is added to a {@link BulkItem}
	 * @param change the quantity to reduce supply by
	 * @return void
	 */
	public void setSupply(int change){
		this.supply -= change;
	}

	/**
	 * Gets the name of the {@code BulkFood}
	 * @param none
	 * @return  the name of the {@code BulkFood}
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Gets the units of the {@code BulkFood}
	 * @param none
	 * @return the units of the {@code BulkFood}
	 */
	
	public Units getUnits(){
		return this.unit;
	}
	
	
	/**
	 * Gets the pricePerUnit of a {@code BulkFood}
	 * @param none
	 * @return the price per units of the  BulkItem
	 */
	
	public int getPricePerUnit(){
		return this.pricePerUnit;
	}
	
	/**
	 * Gets the current supply of the {@code BulkFood}
	 * @param none
	 * @return the quantity supplied of the bulk item;
	 */
	
	public int getSupply(){
		return this.supply;
	}
	
	/**
	 *  Checks if a {@code BulkFood} equals another {@code BulkFood}
	 *  <p> This method overrides the {@code equals} method in Object.
	 *  The method checks if <code>name</code>, <code>unit</code> and <code>pricePerUnit</code>
	 *  fields are equal for obj
	 *  @param obj the object to compare with
	 *  @return  <code>true</code> if equals to obj ; <br><code>false</code> if not equals to obj
	 */
	
	public boolean equals(Object obj){
		
		// check if obj is a type of BultItem
		
		if(obj instanceof BulkFood){
			BulkFood otherBulkFood = (BulkFood) obj;
			// check to see if fields match
			if (  this.name.equals(otherBulkFood.name)
					&& this.unit.equals(otherBulkFood.unit)
					&& this.pricePerUnit == otherBulkFood.pricePerUnit){
				return true;
			}
		}
		
		return false;
	}
	

}
