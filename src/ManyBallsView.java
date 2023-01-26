import javax.swing.*;
import java.awt.*;
/******************************************************************************************
 *
 * Program:	ManyBallsView
 * Created by: Z. Blickensderfer, 12/30/22
 *
 * Description:
 * This is the front-end for the ManyBalls program.
 *
 *****************************************************************************************/
public class ManyBallsView extends JFrame {

    private Ball[] balls;
    private int windowWidth;
    private int windowHeight;

    private final static int NUM_BALLS = 20;

    public ManyBallsView(int width, int height, Ball[] balls) {
        // TODO: modify this constructor to accept an array of Balls, not just one Ball.
        // Initialize instance variables.
        windowWidth = width;
        windowHeight = height;
        this.balls = balls;

        // Show the window with the ball in its initial position.
        this.setTitle("MANY BALLS!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        // Clear the window.
        g.setColor(Color.white);
        g.fillRect(0, 0, windowWidth, windowHeight);

        // TODO: Modify this to call draw() on all 100 Balls.
        // Tell the ball to draw itself.
        for (int i = 0; i < NUM_BALLS; i++)
        {
            balls[i].draw(g);
        }
    }
}
