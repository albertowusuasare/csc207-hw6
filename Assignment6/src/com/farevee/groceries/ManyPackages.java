package com.farevee.groceries;

/** 
 * Implements the ManyPackages
 * @author albertowusu-asare
 *
 */
public class ManyPackages implements Item {

	/*
	 * Fields 
	 */
	
	private Item item;
	private int quantity;
	private Weight weight;
	/**
	 * Constructs <code>ManyPackages </code> given its inputs
	 * @param item the package
	 * @param the total quantity of packages
	 */
	
	public ManyPackages(Item item , int quantity){
		this.item = item;
		this.quantity = quantity;
	}
	@Override
	public Weight getWeight() {
		int weightMagnitude = item.getWeight().getWeightAmount() * quantity;
		Units weightUnits = item.getWeight().getWeightUnits();
		weight = new Weight(weightMagnitude,weightUnits);
		return weight;
	}

	@Override
	public int getPrice() {
		
		return item.getPrice() * quantity;
	}

	/**
	 * Returns information about this object
	 */
	public String toString(){
		return (this.quantity + "x "+ item);
	}
	

	/**
	 * Checks if the current Package is equal to another Package 
	 * <p> Specifically, the method checks if this object and the other object 
	 * occupy the same memory location.
	 * @param obj Some object
	 * @return <code>true </code> if this and  obj points to the same memory location ; 
	 *         <br> <code>false</code> if this and other points to different memory locations
	 */
	
	
public boolean equals(Object obj){
		
		// check if obj is a type of BultItem
		
		if(obj instanceof Package){
			ManyPackages other = (ManyPackages) obj;
			// check if both objects point to the same reference
			if(this.equals(other)){
				return true;
			}
		}
		
		return false;
	}
}
