import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
public class Canvas03 extends JComponent implements KeyListener,MouseListener {
	char x;
	int x1;
	int y1;
public Canvas03() {
	super();
	addKeyListener(this);
	setFocusable(true);
	addMouseListener(this);
	
}
	@Override
	public void keyTyped(KeyEvent e) {
		x=e.getKeyChar();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		 x1=e.getX();
		 y1=e.getY();
	}


	@Override
	public void keyReleased(KeyEvent e) {
		x1=x1+8;
		Graphics g=this.getGraphics();
		g.drawString(String.valueOf(x), x1, y1);
		
	
		
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1=e.getX();
		 y1=e.getY();
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
