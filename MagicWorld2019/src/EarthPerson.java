import java.awt.image.BufferedImage;
/**
 * A Concrete Component in the Decorator Pattern. See "Person" for more details.
 * @author linds
 *
 */
public class EarthPerson extends Person 
{
	private BufferedImage player1;
	public EarthPerson()
	{
	}

	@Override
	public BufferedImage drawRight() 
	{
		this.player1 = getImageInfo("EarthPerson.png");
		return player1;
	}

	@Override
	public BufferedImage drawLeft() 
	{
		this.player1 = getImageInfo("EarthPersonLeft.png");
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
		return "earth";
	}
}
