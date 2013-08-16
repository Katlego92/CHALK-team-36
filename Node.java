import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Node extends Ellipse2D {

	private int radius = 40;
	
	public Node() {
		super();
	}
	@Override
	public Rectangle2D getBounds2D() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFrame(double arg0, double arg1, double arg2, double arg3) {
		// TODO Auto-generated method stub
		
	}
}