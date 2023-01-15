import java.awt.*;
import javax.swing.*;
/******************************************************************************
 * 
 * ImageDemo & ImageDemoView
 * Originally for Intro Prog. by: K.Sanden
 * With edits for CS2 by: Z. Blickensderfer, 12/30/22
 * Shows how to use an image in your program.
 * 
 * The file dalle-duck.png is in the project's Resources folder.
 * This should work with .jpg files, .gif files and some other formats.
 * 
 *****************************************************************************/
public class ImageDemo extends JFrame {
	private Image image;
	private ImageDemoView window;
	public ImageDemo() {
		// Initialize the image. then initialize the window.
		image = new ImageIcon("Resources/dalle_duck.png").getImage();
		window = new ImageDemoView(image);
	}

	public static void main(String[] args) {
		ImageDemo w = new ImageDemo();
	}
}
