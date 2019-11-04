import java.awt.event.MouseMotionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;

public class Canvas01 extends JComponent implements MouseListener,MouseMotionListener,KeyListener {
	//Question 01
	//Question 02
public Canvas01() {
	super();
	addMouseListener(this);
	addMouseMotionListener(this);
	addKeyListener(this);
	setFocusable(true);
}
int xcor;
int ycor;
int xcor1;
int ycor1;
int xcor2;
int ycor2;
char c;
int xer;


int[] array= new int[1000];
		int[] array01= new int[1000];
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked");
		xcor=e.getX();
		ycor=e.getY();
	    //repaint();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed");
		
		xcor1 = e.getX();
		ycor1 = e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse exit");
		
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {

		xcor = e.getX();
		ycor = e.getY();
		Graphics g = this.getGraphics();
		//Question 06
		System.out.println(xer);
		switch(xer){
		case 1:
			g.setColor(Color.BLACK);
			break;
		case 2:
			g.setColor(Color.BLUE);
			break;
		case 3:
			g.setColor(Color.cyan);
			break;
		case 4:
			g.setColor(Color.DARK_GRAY);
			break;
		case 5:
			g.setColor(Color.GRAY);
			break;
		case 6:
			g.setColor(Color.GREEN);
			break;
		case 7:
			g.setColor(Color.MAGENTA);
			break;
		case 8:
			g.setColor(Color.YELLOW);
			break;
		case 9:
			g.setColor(Color.PINK);
			break;
		}
		//g.setColor(Color.BLACK);
		g.fillOval(xcor, ycor, 30, 30);
		paintComponent(g);
		//repaint();
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		c=e.getKeyChar();
		xer=Character.getNumericValue(c);
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


			
		
	}

