import java.awt.*;
import javax.swing.*;

/******************************************************************************
 * 
 * ImageDemo.java
 * Edited by: Z. Blickensderfer, 12/30/22
 * Shows how to use an image in your program.
 * 
 * The file dalle-duck.png is in the project's Resources folder.
 * This should work with .jpg files, .gif files and some other formats.
 * 
 *****************************************************************************/
public class ImageDemo extends JFrame
{
	private Image image;
	public ImageDemo()
	{
		image = new ImageIcon("Resources/dalle_duck.png").getImage();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("QUACK");
		this.setSize(1000, 800);
	}

	public static void main(String[] args)
	{
		/* Place the image in your project workspace. */
		ImageDemo w = new ImageDemo();
		w.setVisible(true);
	}

	public void paint(Graphics g)
	{
		// EX#1: Draw image at (100, 50).  
		// 		No scaling.
		g.drawImage(	image, 		// image to draw
						100, 50, 	// (x, y) of upper left corner in output window
						this);

		// EX#2: Draw image at (400, 50).  
		// 		Scale to width = 70, height = 60
		g.drawImage(	image,		// image to draw 
						400, 50, 	// (x, y) of upper left corner in output window
						70, 60, 	// width, height
						this);
		
		// EX#3: Draw image at (500, 50).
		// 		Scale to half of its original width and 3/2 times its original height
		int oldWidth = image.getWidth(this);
		int oldHeight = image.getHeight(this);
		g.drawImage(	image, 		// image to draw
						500, 50, 	// (x, y) of upper left corner in output window
						oldWidth / 2, oldHeight * 3 / 2,	// width, height
						this);
	
		// EX#4: Draw only part of the original image.
		// 		Take the rectangle from (20, 30) to (90, 100) in the target image.
		// 		Scale it and draw it in the rectangle from (700, 50) to (900, 100).
		g.drawImage(	image,		// image to drqw 
						700, 50,	// (x, y) of upper left corner in output window
						900, 130,	// (x, y) of lower right corner in output window
						20, 30, 	// (x, y) of upper left corner of rectangle within image to draw
						90, 100, 	// (x, y) of lower right corner of rectangle within image to draw
						this);
		System.out.println("hello");
	}
}
