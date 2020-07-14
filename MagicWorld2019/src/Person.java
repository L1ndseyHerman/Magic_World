
import java.awt.image.BufferedImage;

/**
 * This is the Component for the Decorator design pattern.
 * A lot of these things, like "drawRight()" are the same for all of the "_Person" subclasses, but not the 
 * things that decorate them, such as "Shield", so they can't get filled in yet, must do in subclasses. 
 * 
 * If you're wondering why the class that's supposed to be the top in the Decorator Pattern UML diagram is 
 * extending something, it's because of how importing images from paint.net works. My group mate, Chase, from the 
 * Pac Human Group Project, wrote an abstract image class that I mostly copied-n-pasted for this.
 * @author linds
 *
 */
public abstract class Person extends Images
{
	//	Note: Shields and SpellRings do not have lefts and rights. 
	//	SpellRings must also know the Person's element to be drawn.
	
	/**
	 * Draws the right-facing image for if Player1 chose that Person or Item.
	 * @return
	 */
	public abstract BufferedImage drawRight();
	/**
	 * Draws the left-facing image for if Player2 chose that Person or Item.
	 * @return
	 */
	public abstract BufferedImage drawLeft();
	/**
	 * Draw the left-facing Person/Item at the location specified.
	 * @return
	 */
	public abstract int getLeftX();
	/**
	 * Draws the right-facing Person/Item at the location specified.
	 * @return
	 */
	public abstract int getRightX();
	/**
	 * The y-coordinate will be the same for left- and right-facing People and Items, but People's heads will be higher up
	 * than the Items they carry in their hands. 
	 * @return
	 */
	public abstract int getY();
	/**
	 * Different types of People have different items. For example, and AirPerson will return "air".
	 * @return
	 */
	public abstract String getElement();
}
