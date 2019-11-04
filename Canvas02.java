import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
public class Canvas02 extends JComponent implements MouseListener, MouseMotionListener {
	public Canvas02() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	int x1;
	int y1;
	int x2;
	int y2;
	int x3;
	int y3;
	int move;

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x2=e.getX();
		y2=e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		x1=e.getX();
		y1=e.getY();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//x2=e.getX();
		//y2=e.getY();
		
		
	}
	public void paintComponent(Graphics x) {
		x.setColor(Color.BLACK);
		x.fillOval(x1, y1, 30, 30);
		x.drawLine(x1, y1, x2, y2);
	}
	
		
	
	

	@Override
	public void mouseReleased(MouseEvent e) {
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

}
