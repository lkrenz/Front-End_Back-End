import javax.swing.*;
import java.awt.*;
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
public class NameWriterView extends JFrame {

    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 300;

    private String name;

    public NameWriterView(String name) {

        // Initialize the shared name variable.
        this.name = name;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// This tells the program what to do if the user closes
                                                                // the graphics window.
        this.setTitle("~~~ NameWriter ~~~");					// This sets the title of the window.
        this.setSize(500, 300);					// This sets the width and height of the window.
        this.setVisible(true);					    			// This displays the window.
    }

    public void setName(String name) {
        this.name = name;
    }

    // Called implicitly when you say window.repaint()
    public void paint(Graphics g) {

        // "Erase" the window.
        g.setColor(Color.CYAN);
        g.fillRect(0,0, WINDOW_WIDTH, WINDOW_HEIGHT);

        // Draw the user's name.
        g.setColor(Color.WHITE);
        g.drawString(name, 100, 100);
    }
}
