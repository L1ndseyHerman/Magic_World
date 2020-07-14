import java.awt.Color;

import javax.swing.JFrame;

/**
 * This is the class with the main() method that creates the Panel. Dr. Kirshinbaum would always call it the "Driver" class, so I 
 * thought that it had to be called that. Even after I found out it can be named anything, I decided to keep calling it that 
 * out of habit. 
 * 
 * 18H< Health logic done, time to loose some health!
 * @author linds
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
