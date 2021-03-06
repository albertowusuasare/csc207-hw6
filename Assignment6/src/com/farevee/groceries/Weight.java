package com.farevee.groceries;

/**
 * Implements a Weight
 * @author Albert Owusu-Asare
 * @version 1.3 of September 2014
 *
 */
public class Weight
{

  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  private Units units;
  private int amount;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +
  public Weight(Units weightUnits, int amount)
  {
    this.units = weightUnits;
    this.amount = amount;
  }// Weight(Units weightUnits, int amount)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public int getWeightAmount()
  {
    return this.amount;
  }// getWeightAmount()

  
  public Units getWeightUnits()
  {
    return this.units;
  }//getWeightUnits()

  @Override
  public String toString()
  {
    return (amount + " " + units + "(s)");
  }// toString()

  /**
   * The method checks if the current weight is equal to another weight object
   * @param obj Some object
   * @return true if current weight == obj
   *         false if current weight != obj
   */

  public boolean equals(Object obj)
  {

    // check if obj is a type of BultItem

    if (obj instanceof Weight)
      {
        Weight otherWeight = (Weight) obj;
        // check to see if fields match
        if (this.getWeightUnits().equals(otherWeight.getWeightUnits())
            && this.getWeightAmount() == otherWeight.getWeightAmount())
          {
            return true;
          }// if fields are equal
      }// if obj is an instance of Weight
    return false;
  }

  /**
   *  Add a weight to <code> this</code> weight
   *  @param otherWeight the weight to be added
   *  @return a weight that is the total sum in magnitude of the magnitude of <code>this</code> weight and otherWeight
   */

  public Weight add(Weight otherWeight)
  {
    int totalMagnitude = this.getWeightAmount()  + otherWeight.getWeightAmount();
    return new Weight(this.getWeightUnits(),totalMagnitude);
  } // add(Weight otherWeight

}// class Weight
