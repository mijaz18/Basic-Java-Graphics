import javax.swing.JFrame;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Canvas01 x=new Canvas01();
 JFrame f=new JFrame();
 f.add(x);
 f.setSize(500, 500);
 f.setVisible(true);
 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
 
 Canvas02 y=new Canvas02();
 JFrame g=new JFrame();
 g.add(y);
 g.setSize(500, 500);
 g.setVisible(true);
 g.setDefaultCloseOperation(g.EXIT_ON_CLOSE);
 
// Canvas03 z=new Canvas03();
// JFrame h=new JFrame();
// h.add(z);
// h.setSize(500, 500);
// h.setVisible(true);
// h.setDefaultCloseOperation(h.EXIT_ON_CLOSE);
	}
	

}
