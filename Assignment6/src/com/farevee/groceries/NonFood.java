package com.farevee.groceries;

//copying and pasting is somewhat bad
/**
 * This class implements NonFood items.
 * 
 * @author Albert Owusu-Asare
 * @version 1.3 September 2014
 *
 */
public class NonFood
    implements Item
{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  private String name;
  private Weight weight;
  private int price;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Constructs a non-Food item
   * 
   * @param name name of the item
   * @param weight weight of the item.
   * @param price the price of the item.
   */

  public NonFood(String name, Weight weight, int price)
  {
    this.name = name;
    this.weight = weight;
    this.price = price;
  }

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  @Override
  public String getItemName()
  {
    return name;
  }

  @Override
  public Weight getWeight()
  {
    return weight;
  }

  @Override
  public int getPrice()
  {
    return price;
  }

  public boolean equals(Object obj)
  {

    // check if obj is a type of BultItem

    if (obj instanceof NonFood)
      {
        NonFood otherNonFood = (NonFood) obj;
        // check to see if fields match
        if (this.getItemName().equals(otherNonFood.getItemName())
            && this.getWeight().equals(otherNonFood.getWeight())
            && this.getPrice() == otherNonFood.getPrice())
          {
            return true;
          }//if all the fields are equal
      }// if obj is an instance of NonFood

    return false;
  } // equals(Object obj)

  /**
   * Returns information about this <code>NonFood</code>
   */
  public String toString()
  {
    return name;
  }//toString()

}//class NonFood
