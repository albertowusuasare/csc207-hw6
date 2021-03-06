package com.farevee.groceries;

/** 
 * Implements the ManyPackages
 * @author Albert Owusu-Asare
 *
 */
public class ManyPackages
    implements Item
{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  private Package pack;
  private int count;
  private Weight weight;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Constructs <code>ManyPackages </code> given its inputs
   * @param item the package
   * @param the total quantity of packages
   */

  public ManyPackages(Package pack, int quantity)
  {
    this.pack = pack;
    this.count = quantity;
  }//ManyPackages(Package pack, int quantity)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  @Override
  public String getItemName()
  {
    return pack.getItemName();
  }// getItemName()

  @Override
  public Weight getWeight()
  {
    int weightMagnitude = pack.getWeight().getWeightAmount() * count;
    Units weightUnits = pack.getWeight().getWeightUnits();
    weight = new Weight(weightUnits, weightMagnitude);
    return weight;
  } //getWeight()

  @Override
  public int getPrice()
  {
    return pack.getPrice() * count;
  }// getPrice()

  /**
   * Returns the count of total item
   */

  public int getCount()
  {
    return this.count;
  } // getCount

  /**
   * Returns information about this object
   */
  public String toString()
  {
    return (this.count + " x " + pack);
  }//toString()

  /**
   * Checks if the current Package is equal to another Package 
   * <p> Specifically, the method checks if this object and the other object 
   * occupy the same memory location.
   * @param obj Some object
   * @return <code>true </code> if this and  obj points to the same memory location ; 
   *         <br> <code>false</code> if this and other points to different memory locations
   */

  public boolean equals(Object obj)
  {

    // check if this object and obj point to the same object
    if (this == obj)
      {
        return true;
      }//if occupying the same memory location

    return false;
  }//equals(Object obj)
}//class ManyPackages 
