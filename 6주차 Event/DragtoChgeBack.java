import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragtoChgeBack extends JFrame {
	public DragtoChgeBack() {
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		c.addMouseListener(new MouseAdapter() {
			/*
			 * public void mousePressed(MouseEvent e) { c.setBackground(Color.YELLOW); }
			 */
			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}

			public void mouseExited(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}
		});
		c.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
		});
		setTitle("Drag to Change Background Color");
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DragtoChgeBack();

	}

}
