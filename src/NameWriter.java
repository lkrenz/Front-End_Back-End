import java.awt.*;  //need this for graphics
import javax.swing.*; //need this for graphics
import java.util.Scanner; //need this for user input
/******************************************************************************************
 *
 * Program:	NameWriter & NameWriterView
 * Created for Intro. Prog. by:	Katherine Bellafiore Sanden, 1/2/18
 * Edited for CS2 by: Z. Blickensderfer, 12/30/22
 *
 * Description:
 * This program demonstrates how to facilitate the transfer of information from
 * the back-end to the front-end, utilizing calls to repaint in the back-end to
 * prompt the front-end to update itself.
 *
 *****************************************************************************************/
public class NameWriter {
	private String name = "[Your name here]";
	private NameWriterView window;

	public NameWriter() {
		window = new NameWriterView(name);
	}

	public void getUserName() {
		Scanner console = new Scanner(System.in);
		System.out.println("What is your name? ");
		name = console.nextLine();
		window.setName(name);
	}

	public static void main(String args[]) {
		NameWriter n = new NameWriter();
		n.getUserName();
		// Repaints the window. USE THIS COMMAND LIBERALLY — any time you want to update your window!
		n.window.repaint();
	}
}
