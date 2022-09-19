import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBox extends JFrame {
	public ComboBox() {
		Container c = getContentPane();
		JTextField input = new JTextField(10);
		JComboBox<String> stor = new JComboBox<String>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextField, JComboBox and ActionListener");
		c.setLayout(new FlowLayout());
		c.add(input);
		c.add(stor);
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField temp = (JTextField) e.getSource();
				stor.addItem(temp.getText());
				//temp.setText(null);
			}
		});
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ComboBox();

	}

}
