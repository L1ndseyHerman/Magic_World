import java.awt.image.BufferedImage;
/**
 * A Concrete Component in the Decorator Pattern. See "Person" for more details.
 * @author linds
 *
 */
public class DarkPerson extends Person 
{
	private BufferedImage player1;
	public DarkPerson()
	{
	}

	@Override
	public BufferedImage drawRight()
	{
		this.player1 = getImageInfo("DarkPerson.png");
		return player1;
	}

	@Override
	public BufferedImage drawLeft() 
	{
		this.player1 = getImageInfo("DarkPersonLeft.png");
		return player1;
	}

	@Override
	public int getLeftX() {
		// TODO Auto-generated method stub
		return 75;
	}

	@Override
	public int getRightX() {
		// TODO Auto-generated method stub
		return 725;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public String getElement() {
		// TODO Auto-generated method stub
		return "dark";
	}
}
