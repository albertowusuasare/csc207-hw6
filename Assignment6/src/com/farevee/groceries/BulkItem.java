package com.farevee.groceries;
/**
 *  A class to describe the bulk item object
 * @author: Albert Owusu-Asare 
 */
public class BulkItem implements Item {

	/*
	 * Fields
	 */
	protected BulkFood food;
	protected Units unit; 
	protected int amount; // amount of the bulk food
	protected int price; // the price of the bulk food
	protected Weight weight;
	
	/**
	 *  Constructs a <code>BulkItem</code> given sets inputs
	 *  @param bulkFood the {@link BulkFood } 
	 *  @param itemQuantity the quantity of the the bulkFood
	 *  @param weight the  {@link Weight} of the foodItem 
	 */
	
	public BulkItem(BulkFood bulkFood,Weight itemWeight, int itemQuantity){
		
		this.food = bulkFood;
		this.amount = itemQuantity;
		this.unit = food.getUnits();
		this.weight = itemWeight;
		
		 //decrement supply of foodItem
		bulkFood.setSupply(itemQuantity);
	}
	
	@Override
	public Weight getWeight() {
		return this.weight;
	}

	@Override
	public int getPrice() {
		// price per unit of bulk food
		//calculate the price of the BulkItem
		int pricePerUnit =  food.getPricePerUnit() ;
		
		// check if units match. if they dont do useful convertion or throu exception
		int weightAmount = weight.getWeightAmount();
		this.price = pricePerUnit * weightAmount*amount;
		return this.price;
	}
	
	public String getItemName(){
		return food.getName();
	}
	
	/**
	 *  Returns Information about this <code> Item </code>
	 */
	public String toString(){
		return this.amount + " " + unit + "(s) of " + food.getName();
	}
	
	/**
	 * The method checks if the current BulkItem is equal to another BulkItem object
	 * 
	 * @param obj Some object
	 * @return <code>true </code> if current BulkItem fields are equal to obj field ; 
	 *         <br> <code>false</code> if current BulkItem fields are not equal to obj fields.
	 */
	public boolean equals(Object obj){
		
		// check if obj is a type of BultItem
		
		if(obj instanceof BulkItem){
			BulkItem otherBulkItem = (BulkItem) obj;
			// check to see if fields match
			if ( this.food.equals(otherBulkItem.food) 
					&& this.unit.equals(otherBulkItem.unit)
					&& this.amount == otherBulkItem.amount
					&& this.getPrice() == otherBulkItem.getPrice()
					&& this.weight.equals(otherBulkItem.weight))
			{
				return true;
			}
		}
		
		return false;
	}
	

}
