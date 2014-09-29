package com.farevee.groceries;
//probably needs a new constructor just taking in an item
public class BulkContainer extends BulkItem {

	/* 
	 * Fields
	 */
	private String name;
	
	/**
	 * Constructs a <code> BulkContainer</code>
	 * @param containerName
	 * @param food
	 * @param itemQuantity
	 * @param itemWeight
	 */
	
	public BulkContainer(String containerName,BulkFood food,Weight itemWeight,int itemQuantity){
		super(food,itemWeight,itemQuantity);
		this.name = containerName;	
	}
	

	
	/**
	 * Gets the name of this container
	 * @return the name of this  <code>BulkContainer</code>
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * The method checks if the current BulkConatiner is equal to another BulkContainer object
	 * @param obj Some object
	 * @return <code>true </code> if current BulkContainer fields are equal to obj fields ; 
	 *         <br> <code>false</code> if current BulkContainer fields are not equal to obj fields.
	 */
	
	public boolean equals(Object obj){
		
		// check if obj is a type of BultItem
		
		if(obj instanceof BulkContainer){
			BulkContainer otherBulkContainer = (BulkContainer) obj;
			// check to see if fields match
			if ( this.name.equals(otherBulkContainer.name) 
					&& super.equals(otherBulkContainer)){
				return true;
			}
		}
		
		return false;
	}
@Override 
	public String toString(){
		return name + " of " + super.toString();
	}
}
