import java.awt.Color;
import java.awt.Graphics;
/*********************************************************************************
 * Ball class
 * Stores all of the information about a single ball including:
 * 		center, velocity, radius and color
 * It provides methods to move the ball, handle bouncing within a rectangle
 * 		and draw itself.
 ***********************************************************************************/
public class Ball {
	private int x, y;		// Center of the ball
	private int dx, dy;		// Velocity - how much to move the ball in one time unit
	private int radius;		// Radius of the ball
	private Color color;	// Color of the ball

	/**
	 * Ball constructor initializes the Ball object
	 * 
	 * @param xIn		x coordinate of center
	 * @param yIn		y coordinate of center
	 * @param dxIn		x velocity
	 * @param dyIn		y velocity
	 * @param radiusIn	radius
	 * @param colorIn	color
	 */

	public Ball (int xIn, int yIn, int dxIn, int dyIn, int radiusIn, Color colorIn) {
		// Nothing to do but save the data in the object's data fields.
		x = xIn;
		y = yIn;
		dx = dxIn;
		dy = dyIn;
		radius = radiusIn;
		color = colorIn;
	}

	/**
	 * Move the ball.  Add the velocity to its center.
	 */
	public void move() {
		x = x + dx;
		y = y + dy;
	}

	/**
	 * Check if the ball should bounce off any of the walls.  It will only
	 * bounce if it was heading toward the wall and went a bit past it.  If
	 * so just change the sign of the corresponding velocity.  Not a very
	 * accurate way to handle this, but it is simple and it mostly works.
	 * 
	 * @param xLow		x coord of left wall
	 * @param xHigh		x coord of right wall
	 * @param yLow		y coord of top wall
	 * @param yHigh		y coord of bottom wall
	 */
	public void bounce(int xLow, int xHigh, int yLow, int yHigh) {
		// Check for an x bounce.  Note that we bounce if the x is too
		//  low or too high AND IS HEADING IN THE WRONG DIRECTION.
		if (x - radius <= xLow && dx < 0)
			x = xHigh - radius;

		if (x + radius >= xHigh && dx > 0)
			x = radius;
		// Now check for a y bounce.
		if (y - radius <= yLow && dy < 0)
			y = yHigh - radius;

		if (y + radius >= yHigh && dy > 0)
			y = radius;
	}

	/**
	 * Draw the ball.
	 * 
	 * @param g			Graphics object in which to draw
	 */
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
	}
}


