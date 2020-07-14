import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * This is the class that calls all of the other classes. 
 * @author linds
 *
 */
public class Panel extends JPanel
{
	private Person player1, player2;
	//	Yes, this is how the Decorator pattern annoyingly works :(  People are items....
	private Person item1, item2;
	//	Declare the images to be shown later.
	private BufferedImage player1Image, item1Image, player2Image, item2Image;
	//	Starting off the game with these labels and buttons
	private int clickCounter = 0;
	JLabel c1 = new JLabel("Player 1, choose an element:");
	JButton b1 = new JButton("Fire");
	JButton b2 = new JButton("Water");
	JButton b3 = new JButton("Earth");
	JButton b4 = new JButton("Air");
	JButton b5 = new JButton("Dark");
	JButton b6 = new JButton("Light");
	
	//	Then don't make the last one that player clicked an option
	JButton player1Nope = new JButton("This text should never show");
	JButton player2Nope = new JButton("This text should never show either");
	
	//	And since the health has to be a String, here is the int version:
	int p1Health = 100;
	int p2Health = 100;
	//	These show up when the game begins (Player1FirstTurn())
	JLabel player1Health = new JLabel("Health: " + p1Health);
	JLabel player2Health = new JLabel("Health: " + p2Health);


	public Panel(int width, int height, Color bgColor)
	{
		//	Every. MyPanel. Ever.
		setPreferredSize(new Dimension(width, height));
		setBackground(bgColor);
		
		//	FIXES THE LABELS ALL IN A LINE PROBLEM!!
		setLayout(null);
		
		//	Label that will appear and disappear
		c1.setBounds(400, 0, 300, 50);
		//	DO THIS.ADD INSTEAD OF PANEL.ADD!!
		//panel.add(c1);
		this.add(c1);
		
		//	Buttons that may appear and disappear 
		b1.setBounds(75, 50, 100, 30);
		b1.setBackground(Color.red);
		this.add(b1);
			
		b2.setBounds(225, 50, 100, 30);
		b2.setBackground(Color.blue);
		this.add(b2);
			
		b3.setBounds(375, 50, 100, 30);
		b3.setBackground(Color.orange);
		this.add(b3);
			
		b4.setBounds(525, 50, 100, 30);
		b4.setBackground(Color.green);
		this.add(b4);
			
		//	Purple should be a color :S
		//	It's my favorite color, why is it not pre-coded? Lol.
		b5.setBounds(675, 50, 100, 30);
		b5.setBackground(new Color(255, 0, 255));
		this.add(b5);
			
		b6.setBounds(825, 50, 100, 30);
		b6.setBackground(Color.yellow);
		this.add(b6);		
		//	Resizes the image to x and y sizes u type.
		//	DON'T NEED, RESIZED IN PAINT.NET!!
		
		
		//	Invisible until set to one of the three in-game buttons
		player1Nope.setVisible(false);
		player2Nope.setVisible(false);
		
		
		//	Also
		player1Health.setBounds(125, 125, 100, 50);
		this.add(player1Health);
		player1Health.setVisible(false);
		
		player2Health.setBounds(800, 125, 100, 50);
		this.add(player2Health);
		player2Health.setVisible(false);

		
		//	The things for each button are separate from the other buttons. Grouped by button, not click number.
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
				else if (clickCounter == 4)
				{
					player1Nope = b1;
					player1FirstTurn();
				}
				else if (clickCounter == 5)
				{
					player2Nope = b1;
					player2FirstTurn();
				}
				else if (clickCounter >= 6 && clickCounter % 2 == 0)
				{
					player1Nope.setVisible(true);
					player1Nope = b1;
					player1Turn();
				}
				else if (clickCounter >= 6 && clickCounter % 2 == 1)
				{
					player2Nope.setVisible(true);
					player2Nope = b1;
					player2Turn();
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
				else if (clickCounter == 4)
				{
					player1Nope = b4;
					player1FirstTurn();
				}
				else if (clickCounter == 5)
				{
					player2Nope = b4;
					player2FirstTurn();
				}
				else if (clickCounter >= 6 && clickCounter % 2 == 0)
				{
					player1Nope.setVisible(true);
					player1Nope = b4;
					player1Turn();
				}
				else if (clickCounter >= 6 && clickCounter % 2 == 1)
				{
					player2Nope.setVisible(true);
					player2Nope = b4;
					player2Turn();
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
				else if (clickCounter == 4)
				{
					player1Nope = b6;
					player1FirstTurn();
				}
				else if (clickCounter == 5)
				{
					player2Nope = b6;
					player2FirstTurn();
				}
				else if (clickCounter >= 6 && clickCounter % 2 == 0)
				{
					player1Nope.setVisible(true);
					player1Nope = b6;
					player1Turn();
				}
				else if (clickCounter >= 6 && clickCounter % 2 == 1)
				{
					player2Nope.setVisible(true);
					player2Nope = b6;
					player2Turn();
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	
		});
	}
	
	
	
	
	
	public void firstClickStuff()
	{
		c1.setText("Player 1, choose a profession:");
		b2.setVisible(false);
		b3.setVisible(false);
		b5.setVisible(false);
		
		b1.setText("Assassin");
		b4.setText("Bodyguard");
		b6.setText("Mage");
		
		player1Image = player1.drawLeft();
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
		
		item1Image = item1.drawLeft();
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
		
		player2Image = player2.drawRight();
		clickCounter = 3;
	}
	
	public void fourthClickStuff()
	{
		c1.setText("Player1, what will you do?");
		b1.setText("Attack");
		b4.setText("Defend");
		b6.setText("Cast Spell");
		
		item2Image = item2.drawRight();
		
		player1Health.setVisible(true);
		player2Health.setVisible(true);
		
		clickCounter = 4;
	}
	
	
	//	After the first four set-up clicks, it alternates between the turns until either player runs out of health
	//	No buttons should disappear until after the first turn of both players though
	//	EACH TURN SETS UP FOR THE NEXT ONE, SO PLAYER1'S TURN WILL SET UP BY SAYING PLAYER2!!
	public void player1FirstTurn()
	{
		c1.setText("Player2, what will you do?");
		clickCounter = clickCounter + 1;
	}
	public void player2FirstTurn()
	{
		c1.setText("Player1, what will you do?");
		player1Nope.setVisible(false);
		clickCounter = clickCounter + 1;
		p1Health = p1Health - 1;
		p2Health = p2Health - 1;
		player1Health.setText("Health: " + p1Health);
		player2Health.setText("Health: " + p2Health);
	}
	public void player1Turn()
	{
		c1.setText("Player2, what will you do?");
		player2Nope.setVisible(false);
		clickCounter = clickCounter + 1;
	}
	public void player2Turn()
	{
		c1.setText("Player1, what will you do?");
		player1Nope.setVisible(false);
		clickCounter = clickCounter + 1;
		p1Health = p1Health - 1;
		p2Health = p2Health - 1;
		player1Health.setText("Health: " + p1Health);
		player2Health.setText("Health: " + p2Health);
	}
	
	
	protected void paintComponent(Graphics arg0)
	{
		super.paintComponent(arg0);
		Graphics2D g = (Graphics2D)arg0;

		//	Draws the resized image at an x, y, and this.
		//g.drawImage(firePerson, 725, 200, this);
		if (clickCounter == 1)
		{
			g.drawImage(player1Image, player1.getLeftX(), player1.getY(), this);
			//	Again? Wow :(
			repaint();
		}
		else if (clickCounter == 2)
		{
			g.drawImage(player1Image, player1.getLeftX(), player1.getY(), this);
			g.drawImage(item1Image, item1.getLeftX(), item1.getY(), this);
			repaint();
		}
		else if (clickCounter == 3)
		{
			g.drawImage(player1Image, player1.getLeftX(), player1.getY(), this);
			g.drawImage(item1Image, item1.getLeftX(), item1.getY(), this);
			g.drawImage(player2Image, player2.getRightX(), player2.getY(), this);
			repaint();
		}
		else if (clickCounter == 4)
		{
			g.drawImage(player1Image, player1.getLeftX(), player1.getY(), this);
			g.drawImage(item1Image, item1.getLeftX(), item1.getY(), this);
			g.drawImage(player2Image, player2.getRightX(), player2.getY(), this);
			g.drawImage(item2Image, item2.getRightX(), item2.getY(), this);
			//	WOW!! REALLY DON'T FORGET THE REPAINT!!
			repaint();
		}	
		
		//	Alternating turns
		//	PUT THE ANIMATION IN ONLY ONE OF THESE!!
		//	There isn't an animation yet, but when you make it, do that. 
		else if (clickCounter > 4 && clickCounter % 2 == 1)
		{
			g.drawImage(player1Image, player1.getLeftX(), player1.getY(), this);
			g.drawImage(item1Image, item1.getLeftX(), item1.getY(), this);
			g.drawImage(player2Image, player2.getRightX(), player2.getY(), this);
			g.drawImage(item2Image, item2.getRightX(), item2.getY(), this);
			repaint();
		}
		else if (clickCounter > 4 && clickCounter % 2 == 0)
		{
			g.drawImage(player1Image, player1.getLeftX(), player1.getY(), this);
			g.drawImage(item1Image, item1.getLeftX(), item1.getY(), this);
			g.drawImage(player2Image, player2.getRightX(), player2.getY(), this);
			g.drawImage(item2Image, item2.getRightX(), item2.getY(), this);
			repaint();
		}
		
	}	
}
