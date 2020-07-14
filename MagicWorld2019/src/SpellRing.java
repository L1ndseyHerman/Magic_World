import java.awt.image.BufferedImage;
/**
 * A Concrete Decorator in the Decorator Pattern. See "Person" for more details.
 * @author linds
 *
 */
public class SpellRing extends ItemDecorator 
{
	private BufferedImage item1;
	public SpellRing(Person component) 
	{
		this.component = component;
	}

	
	
	//	IMPT!! SPELLRING COLOR DEPENDS ON PERSON'S ELEMENT!!
	
	@Override
	public BufferedImage drawRight() 
	{
		if (component.getElement() == "fire")
		{
			this.item1 = getImageInfo("FireRing.png");
			return item1;
		}
		else if (component.getElement() == "water")
		{
			this.item1 = getImageInfo("WaterRing.png");
			return item1;
		}
		else if (component.getElement() == "earth")
		{
			this.item1 = getImageInfo("EarthRing.png");
			return item1;
		}
		else if (component.getElement() == "air")
		{
			this.item1 = getImageInfo("AirRing.png");
			return item1;
		}
		else if (component.getElement() == "dark")
		{
			this.item1 = getImageInfo("DarkRing.png");
			return item1;
		}
		else if (component.getElement() == "light")
		{
			this.item1 = getImageInfo("LightRing.png");
			return item1;
		}
		else 
		{
			return null;
		}
	}

	@Override
	public BufferedImage drawLeft()
	{
		if (component.getElement() == "fire")
		{
			this.item1 = getImageInfo("FireRing.png");
			return item1;
		}
		else if (component.getElement() == "water")
		{
			this.item1 = getImageInfo("WaterRing.png");
			return item1;
		}
		else if (component.getElement() == "earth")
		{
			this.item1 = getImageInfo("EarthRing.png");
			return item1;
		}
		else if (component.getElement() == "air")
		{
			this.item1 = getImageInfo("AirRing.png");
			return item1;
		}
		else if (component.getElement() == "dark")
		{
			this.item1 = getImageInfo("DarkRing.png");
			return item1;
		}
		else if (component.getElement() == "light")
		{
			this.item1 = getImageInfo("LightRing.png");
			return item1;
		}
		else 
		{
			return null;
		}
	}

	@Override
	public int getLeftX() {
		// TODO Auto-generated method stub
		return 275;
	}

	@Override
	public int getRightX() {
		// TODO Auto-generated method stub
		return 700;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	public String getElement() {
		// TODO Auto-generated method stub
		return null;
	}
}
