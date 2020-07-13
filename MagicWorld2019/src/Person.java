
import java.awt.image.BufferedImage;

public abstract class Person extends Images
{
	//	Note: Shields and SpellRings do not have lefts and rights. 
	//	SpellRings must also know the Person's element to be drawn.
	public abstract BufferedImage drawRight();
	public abstract BufferedImage drawLeft();
	public abstract int getLeftX();
	public abstract int getRightX();
	public abstract int getY();
	public abstract String getElement();
}
