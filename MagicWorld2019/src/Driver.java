import java.awt.Color;

import javax.swing.JFrame;
/**
 * @author linds
 * 18H, Health logic done, time to loose some health!
 *
 */
public class Driver 
{
	public static void main(String[] args) 
	{
		Panel panel = new Panel(1000, 500, Color.white);
		JFrame frame = new JFrame("Magic World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
