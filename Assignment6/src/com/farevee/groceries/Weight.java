package com.farevee.groceries;

public class Weight {

	private Units units;
	private int amount;
	
	public Weight( Units weightUnits, int amount){
		this.units = weightUnits;
		this.amount = amount;
	}
	public int getWeightAmount(){
		return this.amount;
	}
	
	public Units getWeightUnits(){
		return this.units;
	}
	
	@Override
	public String toString(){
		return (amount + " " + units + "(s)");
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
			if ( this.getWeightUnits().equals(otherWeight.getWeightUnits()) 
					&& this.getWeightAmount() == otherWeight.getWeightAmount())
				{
				return true;
			}
		}
		return false;
	}
	
	/**
	 *  Add a weight to this weight
	 */
	
	public Weight add(Weight otherweight){
		return new Weight(this.getWeightUnits(), this.getWeightAmount() + otherweight.getWeightAmount());
	}
		
}
