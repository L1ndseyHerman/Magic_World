
import java.awt.image.BufferedImage;

public class Sword extends ItemDecorator 
{
	private BufferedImage item1;
	public Sword(Person component) 
	{
		this.component = component;
	}

	@Override
	public BufferedImage drawRight() 
	{
		this.item1 = getImageInfo("Sword.png");
		return item1;
	}

	@Override
	public BufferedImage drawLeft() 
	{
		this.item1 = getImageInfo("SwordLeft.png");
		return item1;
	}

	@Override
	public int getLeftX() {
		// TODO Auto-generated method stub
		return 265;
	}

	@Override
	public int getRightX() {
		// TODO Auto-generated method stub
		return 535;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public String getElement() {
		// TODO Auto-generated method stub
		return null;
	}
}
