package com.farevee.groceries;

/**
 * Units of measurement. The primary units available at Units.GRAM,
 * Units.KILOGRAM, Units.OUNCE, and Units.POUND.
 */
public class Units {
	// +--------+------------------------------------------------------
	// | Fields |
	// +--------+

	/**
	 * The name of the unit.
	 */
	String name;

	/**
	 * The abbreviation of the unit.
	 */
	String abbrev;

	/**
	 * The plural name of the unit.
	 */
	String plural;

	// +--------------+------------------------------------------------
	// | Constructors |
	// +--------------+

	/**
	 * Create a new unit with a given name.
	 */
	private Units(String name, String abbrev, String plural) {
		this.name = name;
		this.abbrev = abbrev;
		this.plural = plural;
	} // Units(String, String, String)

	// +-----------+---------------------------------------------------
	// | Accessors |
	// +-----------+

	/**
	 * Get the unit name.
	 */
	public String toString() {
		return this.name;
	} // toString()

	/**
	 * Get the abbreviation of the unit name.
	 */
	public String abbrev() {
		return this.abbrev;
	} // abbrev()

	/**
	 * Get the plural of the unit name. (One does not always form a plural by
	 * just adding "s", so we provide this additional method.)
	 */
	public String plural() {
		return this.plural;
	} // plural

	// +-----------+---------------------------------------------------
	// | Constants |
	// +-----------+

	/**
	 * Standard unit: Pounds
	 */
	public static final Units POUND = new Units("pound", "lb.", "pounds");

	/**
	 * Standard unit: Ounces
	 */
	public static final Units OUNCE = new Units("ounce", "oz.", "ounces");

	/**
	 * Standard unit: Kilograms
	 */
	public static final Units KILOGRAM = new Units("kilogram", "kg.",
			"kilograms");

	/**
	 * Standard unit: Grams
	 */
	public static final Units GRAM = new Units("gram", "gm.", "grams");
	
	/**
	 * The method checks if the current Unit object  is equal to another unit object
	 * @param obj Some object
	 * @return true if current Unit object's  fields are equal to obj fields
	 *         false if current Unit  fields are not equal to obj fields.
	 */
	public boolean equals(Object obj){
		
		// check if obj is a type of BultItem
		
		if(obj instanceof Units){
			Units otherUnits = (Units) obj;
			// check to see if fields match
			if ( this.name.equals(otherUnits.name) 
					&& this.abbrev.equals(otherUnits.abbrev)
					&& this.plural.equals(otherUnits.plural)
					){
				return true;
			}
		}
	return false;
	}
	
	

} // class Units
