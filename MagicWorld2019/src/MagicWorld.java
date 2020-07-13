import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * @author linds
 * 11H, THIS SETUP IS NOT VIABLE! CHANGING TO HAVE A SEPERATE DRIVER AND PANEL!!
 *
 */
//	THIS WAS JFRAME, COULD CAUSE PROBLEMS?!
public class MagicWorld extends JPanel
{
	
	public Person player1, player2;
	//	Yes, this is how the Decorator pattern annoyingly works :(
	public Person item1, item2;
	public int clickCounter = 0;
	public JPanel panel = new JPanel();
	public JFrame f = new JFrame("Magic World");
	private JLabel player1Image, item1Image;
	//panel.setBounds(0, 0, 1000, 500);
	//panel.setBackground(Color.white);
	//panel.setLayout(null);
	//f.add(panel);
	//f.setSize(1000, 500);
	//f.setLayout(null);
	//f.setVisible(true);
	//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//Graphics2D g;
	
	//	Moving some button stuff here for method seperate from Panel
	JLabel c1 = new JLabel("Player 1, choose an element:");
	JButton b1 = new JButton("Fire");
	JButton b2 = new JButton("Water");
	JButton b3 = new JButton("Earth");
	JButton b4 = new JButton("Air");
	JButton b5 = new JButton("Dark");
	JButton b6 = new JButton("Light");
	
	public void newGame()
	{
		//	Need all game 
		//JFrame f = new JFrame("Magic World");
		//panel = new JPanel();
		panel.setBounds(0, 0, 1000, 500);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		f.add(panel);
		f.setSize(1000, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.pack();
		
		//	Label that will appear and disappear
		c1.setBounds(400, 0, 300, 50);
		//c1.setVisible(false);
		panel.add(c1);
		
		//	Buttons that may appear and disappear 
		b1.setBounds(75, 50, 100, 30);
		b1.setBackground(Color.red);
		panel.add(b1);
		
		b2.setBounds(225, 50, 100, 30);
		b2.setBackground(Color.blue);
		panel.add(b2);
		
		b3.setBounds(375, 50, 100, 30);
		b3.setBackground(Color.orange);
		panel.add(b3);
		
		b4.setBounds(525, 50, 100, 30);
		b4.setBackground(Color.green);
		panel.add(b4);
		
		b5.setBounds(675, 50, 100, 30);
		b5.setBackground(new Color(255, 0, 255));
		panel.add(b5);
		
		b6.setBounds(825, 50, 100, 30);
		b6.setBackground(Color.yellow);
		panel.add(b6);
		
		//	Labels that are actually images:
		java.net.URL imageURL = MagicWorld.class.getResource("FirePersonLeft.png");
		//imageURL = resizeImage(getImageInfo("WaterPersonLeft.png"), 200, 300);
		player1Image = new JLabel(new ImageIcon(imageURL));
		java.net.URL imageURL2 = MagicWorld.class.getResource("SwordLeft.png");
		item1Image = new JLabel(new ImageIcon(imageURL2));
		
		b1.addMouseListener(new MouseListener()
				{

					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						if (clickCounter == 0)
						{
							player1 = new FirePerson();
							firstClickStuff();
						}
						else if (clickCounter == 1)
						{
							item1 = new Sword(player1);
							secondClickStuff();
						}
						else if (clickCounter == 2)
						{
							player2 = new FirePerson();
							thirdClickStuff();
						}
						else if (clickCounter == 3)
						{
							item2 = new Sword(player2);
							fourthClickStuff();
						}
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
		b2.addMouseListener(new MouseListener()
				{

					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						if (clickCounter == 0)
						{
							player1 = new WaterPerson();
							firstClickStuff();
						}
						else if (clickCounter == 2)
						{
							player2 = new WaterPerson();
							thirdClickStuff();
						}
					}

					@Override
					public void mouseReleased(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
			
				});
		b3.addMouseListener(new MouseListener()
				{

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						if (clickCounter == 0)
						{
							player1 = new EarthPerson();
							firstClickStuff();
						}
						else if (clickCounter == 2)
						{
							player2 = new EarthPerson();
							thirdClickStuff();
						}
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
			
				});
		b4.addMouseListener(new MouseListener()
				{

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						if (clickCounter == 0)
						{
							player1 = new AirPerson();
							firstClickStuff();
						}
						else if (clickCounter == 1)
						{
							item1 = new Shield(player1);
							secondClickStuff();
						}
						else if (clickCounter == 2)
						{
							player2 = new AirPerson();
							thirdClickStuff();
						}
						else if (clickCounter == 3)
						{
							item2 = new Shield(player2);
							fourthClickStuff();
						}
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
			
				});
		b5.addMouseListener(new MouseListener()
				{

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						if (clickCounter == 0)
						{
							player1 = new DarkPerson();
							firstClickStuff();
						}
						else if (clickCounter == 2)
						{
							player2 = new DarkPerson();
							thirdClickStuff();
						}
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				});
		b6.addMouseListener(new MouseListener()
				{

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						if (clickCounter == 0)
						{
							player1 = new LightPerson();
							firstClickStuff();
						}
						else if (clickCounter == 1)
						{
							item1 = new SpellRing(player1);
							secondClickStuff();
						}
						else if (clickCounter == 2)
						{
							player2 = new LightPerson();
							thirdClickStuff();
						}
						else if (clickCounter == 3)
						{
							item2 = new SpellRing(player2);
							fourthClickStuff();
						}
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
			
				});
	}
	/*protected void paintComponent(Graphics arg0)
	{
		System.out.println("Method reached!");
		//panel.paintComponent(arg0);
		//super.paintComponent(arg0);
		Graphics2D g = (Graphics2D)arg0;
		g.draw(new Ellipse2D.Double(10,10,10,10));
		//g = (Graphics2D)arg0;
		
		//item1.display(g);
	}*/
	
	
	public void firstClickStuff()
	{
		c1.setText("Player 1, choose a profession:");
		b2.setVisible(false);
		b3.setVisible(false);
		b5.setVisible(false);
		
		b1.setText("Assassin");
		b4.setText("Bodyguard");
		b6.setText("Mage");
		clickCounter = 1;
	}
	
	public void secondClickStuff()
	{
		c1.setText("Player 2, choose an element:");
		b1.setText("Fire");
		b2.setVisible(true);
		b3.setVisible(true);
		b4.setText("Air");
		b5.setVisible(true);
		b6.setText("Light");
		clickCounter = 2;
	}
	
	public void thirdClickStuff()
	{
		c1.setText("Player 2, choose a profession:");
		b2.setVisible(false);
		b3.setVisible(false);
		b5.setVisible(false);
		
		b1.setText("Assassin");
		b4.setText("Bodyguard");
		b6.setText("Mage");
		clickCounter = 3;
	}
	
	public void fourthClickStuff()
	{
		c1.setVisible(false);
		b1.setVisible(false);
		b4.setVisible(false);
		b6.setVisible(false);
		clickCounter = 4;
		
		//	Finally displaying the labels that are actually images that were created at the beginning 
		if (player1Image != null)
		{
			panel.add(player1Image);
			//player1Image.setBounds(200, 300, 725, 200);
			player1Image.setBounds(75, 150, 200, 300);
		}
		if (item1Image != null)
		{
			panel.add(item1Image);
			item1Image.setBounds(0, 0, 100, 100);
		}
		

		//paintComponent(super.paintComponent(null););

		//player1.display();
		//	Nope, needs to be item1 :(
		//item1.display(g);
		
		//	Resizes the image to x and y sizes u type.
			//this.player1 = FirePerson.resizeImage(FirePerson.getImageInfo("FirePerson.png"), 200, 300);
			//this.sword = resizeImage(getImageInfo("Sword.png"), 200, 100);
	}
	private BufferedImage resize(BufferedImage img, int height, int width) {
		Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = resized.createGraphics();
		g2d.drawImage(tmp, 0, 0, null);
		g2d.dispose();
		return resized;
	}

	public BufferedImage getImageInfo(String imagePath) {
		try {
			//	Can't find PacHumanGame 
			//File classPathInput = new File(PacHumanGame.class.getResource(imagePath).getFile());
			File classPathInput = new File(MagicWorld.class.getResource(imagePath).getFile());
			return ImageIO.read(classPathInput);
		} catch (IOException ex) {
			return null;
		}
	}

	public BufferedImage resizeImage(BufferedImage imageToResize, int height, int width) {
		return resize(imageToResize, width, height);
	}

	
	
	public static void main(String[] args) 
	{
		new MagicWorld().newGame();
		//new MagicWorld.paintComponent()
	}
}
