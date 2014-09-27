package edu.grinnell.csc207.owusuasa.layout;

public class Grid implements TextBlock {
	
	
	  /**
	   * Get one row from the block.
	   * 
	   * @pre i < this.height()
	   * @exception Exception
	   *              if the row number is invalid.
	   */
	  public String row(int i)
	    throws Exception{
		  return "";
	  }

	  /**
	   * Determine how many rows are in the block.
	   */
	  public int height(){
		  return 1;
	  }

	  /**
	   * Determine how many columns are in the block.
	   */
	  public int width(){
		  return 1;
	  }


}
