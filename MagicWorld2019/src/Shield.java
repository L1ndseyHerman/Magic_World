import java.awt.image.BufferedImage;
/**
 * A Concrete Decorator in the Decorator Pattern. See "Person" for more details.
 * @author linds
 *
 */
public class Shield extends ItemDecorator 
{
	private BufferedImage item1;
	public Shield(Person component) 
	{
		this.component = component;
	}

	@Override
	public BufferedImage drawRight() 
	{
		this.item1 = getImageInfo("Shield.png");
		return item1;
	}

	//	Left and right are same!
	@Override
	public BufferedImage drawLeft()
	{
		this.item1 = getImageInfo("Shield.png");
		return item1;
	}

	@Override
	public int getLeftX() {
		// TODO Auto-generated method stub
		return 275;
	}

	@Override
	public int getRightX() {
		// TODO Auto-generated method stub
		return 625;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 225;
	}

	@Override
	public String getElement() {
		// TODO Auto-generated method stub
		return null;
	}
}
