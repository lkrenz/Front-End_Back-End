import java.awt.*;  //need this for graphics
import javax.swing.*; //need this for graphics
import java.util.Scanner; //need this for user input

/******************************************************************************************
 * 
 * Program:	NameWriter
 * Created by:	Katherine Bellafiore Sanden, 1/2/18
 * Edited by: Z. Blickensderfer, 12/30/22
 * 
 * Description:
 * This is a basic template for using graphics.  Just the bare necessities.  
 *
 *****************************************************************************************/

public class NameWriter extends JFrame
{
	private String name = "";

	public NameWriter() {
		/* These 4 lines are your set-up code: like building the foundation of a house. */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// This tells the program what to do if the user closes
																// the graphics window.
		this.setTitle("~~~ NameWriter ~~~");					// This sets the title of the window.
		this.setSize(500, 300);					// This sets the width and height of the window.
		this.setVisible(true);					    			// This displays the window.
	}

	public void getUserName() {
		Scanner console = new Scanner(System.in);
		System.out.println("What is your name? ");
		name = console.nextLine();
	}

	public static void main(String args[])
	{
		NameWriter window = new NameWriter();
		window.getUserName();
		// Repaints the window. USE THIS COMMAND LIBERALLY — any time you want to update your window!
		window.repaint();
	}

	// Called implicitly when you say window.repaint()
	public void paint(Graphics g) 		
	{
		// Draw the user's name.
		g.drawString(name, 100, 100);
	}
}
