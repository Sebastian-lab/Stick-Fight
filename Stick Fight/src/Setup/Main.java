package Setup;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Main implements ActionListener, KeyListener, MouseListener, MouseMotionListener{

	//important stuff
	private JFrame f;
	private Panel p;
	Timer timer;
	public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	//other stuff
	
	public Main() {
		
	}
	
	public void makeFrame() {
		f = new JFrame();
		f.setTitle("Stick Fight");
		f.setPreferredSize(screenSize);
		f.setResizable(false);
		f.setFocusable(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		makePanel();
		addToPanel();
		addToFrame();
		f.pack();
		f.setVisible(true);
	}
	
	public void start() {
		timer = new Timer(1000/60, this);
		timer.start();
	}
	
	public void makePanel() {
		p = new Panel();
	}
	
	public void addToPanel() {
		
	}
	
	public void addToFrame() {
		f.add(p);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.makeFrame();
		main.start();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		p.repaint();
	}

}
