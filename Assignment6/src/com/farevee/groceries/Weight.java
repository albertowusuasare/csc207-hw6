package com.farevee.groceries;

public class Weight {

	private Units unit;
	private int amount;
	
	public Weight(int amount, Units units){
		this.unit = unit;
		this.amount = amount;
	}
	public int getWeightAmount(){
		return this.amount;
	}
	
	public Units getWeightUnits(){
		return this.unit;
	}
	
	/**
	 * The method checks if the current weight is equal to another weight object
	 * @param obj Some object
	 * @return true if current weight == obj
	 *         false if current weight != obj
	 */
	
	public boolean equals(Object obj){
		
		// check if obj is a type of BultItem
		
		if(obj instanceof Weight){
			Weight otherWeight = (Weight) obj;
			// check to see if fields match
			if ( this.unit.equals(otherWeight.unit) 
					&& this.amount == otherWeight.amount)
				{
				return true;
			}
		}
		return false;
	}
		
}
