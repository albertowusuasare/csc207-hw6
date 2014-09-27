package com.farevee.groceries;

// what does the price fields mean

/**
 *  This class implements a package.
 *  <p> With this class, various items eg. {@link BulkItem} or {@link BulkContainer}, can be packaged 
 * @author albertowusu-asare
 */
public class Package implements Item {

	/*
	 * Fields
	 */
	private Item item;
	private String name;
	private Weight weight;
	private int price;
	
	/**
	 * Constructs a package given an a package name, an item and the items weight
	 * @param packageName name of the package
	 * @param item the item to be packaged
	 * @param itemWeight the weight of the item
	 */
	
	public Package (String packageName,Item item, Weight itemWeight){
		this.name = packageName;
		this.item = item;
		this.weight = itemWeight;	
		this.price = item.getPrice();
	}
	
	/**
	 * Returns  the item in this package
	 */
	public Item getItem(){
		return item;
	}
	
	/**
	 * Returns the name of this package
	 * @return
	 */
	public String getName(){
		return name;
	}
	
	@Override
	public Weight getWeight() {
		return weight;
	}
	
	

	@Override
	public int getPrice() {
		price = item.getPrice();
	
		return price;
	}
	

	/**
	 * Checks if the current Package is equal to another Package 
	 * @param obj Some object
	 * @return <code>true </code> if current Package fields are equal to obj fields ; 
	 *         <br> <code>false</code> if current Package fields are not equal to obj fields.
	 */
	
	
public boolean equals(Object obj){
		
		// check if obj is a type of BultItem
		
		if(obj instanceof Package){
			Package otherPackage = (Package) obj;
			// check to see if fields match
			if ( this.getItem().equals(otherPackage.getItem())
					&& this.getName().equals(otherPackage.getName())
					&& this.getPrice() == otherPackage.getPrice()
					&& this.getWeight().equals(otherPackage.getWeight())){
				return true;
			}
		}
		
		return false;
	}
	
/**
 *  Returns Information about this <code> Package </code>
 */
public String toString(){
	return (weight.toString() + " package of " + item) ;
}
}
