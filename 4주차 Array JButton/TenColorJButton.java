import java.awt.*;
import javax.swing.*;

public class TenColorJButton extends JFrame
{
	public TenColorJButton()
	{
		setTitle("Ten Color Buttons Frame");
		Color [] colorary = 
			{
				Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.DARK_GRAY, Color.PINK, Color.GRAY
			};

		Container frame = getContentPane();
		frame.setLayout(new GridLayout(1, 10));
		JButton [] Buttons = new JButton[10];
		for (int i = 0; i < 10; i++)
		{
			Buttons[i] = new JButton(Integer.toString(i));
			Buttons[i].setBackground(colorary[i]);
			Buttons[i].setOpaque(true);
			frame.add(Buttons[i]);
		}
		setVisible(true);
		setSize(500,200);
	}
	public static void main(String[] args) 
	{
		new TenColorJButton();
	}

}
