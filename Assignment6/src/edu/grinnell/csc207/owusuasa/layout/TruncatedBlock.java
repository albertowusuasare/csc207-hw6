package edu.grinnell.csc207.owusuasa.layout;

public class TruncatedBlock
implements TextBlock
{
	  /**
	   * The stuff in the box
	   */
	  TextBlock contents;
	  private int newWidth;
	  
/**
 * Create a new truncated block of the specified width.
 */
public TruncatedBlock(TextBlock tb, int width)
{
 this.contents = tb;
 this.newWidth = width;
} // TruncatedBlock(TextBlock, int)

/**
 * Get the ith row of the block.
 */
public String row(int i)
{
//  ...
	return "albert";
} // row(int)

/**
 * Determine how many rows are in the block.
 */
public int height()
{
 // ...
	return 1;
} // height()

/**
 * Determine how many columns are in the block.
 */
public int width()
{
  return this.contents.width() - newWidth;
} // width()
} // class TruncatedBlock
