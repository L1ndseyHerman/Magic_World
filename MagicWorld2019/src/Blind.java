import java.awt.image.BufferedImage;
/**
 * A Concrete Decorator, not in use yet.
 * @author linds
 *
 */
public class Blind extends StatusDecorator 
{
	public Blind(Person component) 
	{
		this.component = component;
	}

	@Override
	public BufferedImage drawRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage drawLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLeftX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRightX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getElement() {
		// TODO Auto-generated method stub
		return null;
	}
}
