import java.awt.image.BufferedImage;

public class WaterPerson extends Person 
{
	private BufferedImage player1;
	public WaterPerson()
	{
	}

	@Override
	public BufferedImage drawRight() 
	{
		this.player1 = getImageInfo("WaterPerson.png");
		return player1;
	}

	@Override
	public BufferedImage drawLeft() 
	{
		this.player1 = getImageInfo("WaterPersonLeft.png");
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
		return "water";
	}
}
