import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Random;
import java.util.Vector;

public class Puzzle_201720970 extends JFrame {
	int count = 1;
	JButton[] Puzzles = new JButton[16];
	Vector<String> num = new Vector<String>();

	public Puzzle_201720970() {
		String Number = "";
		Random random = new Random();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("4 X 4 Puzzle (201720970_권대한)");
		setLayout(new GridLayout(4, 4));

		while (num.size() != 16) {
			Number = Integer.toString(random.nextInt(16) + 1);
			while (!num.isEmpty() && num.contains(Number)) {
				Number = Integer.toString(random.nextInt(16) + 1);
			}
			num.add(Number);
		}
		for (int i = 0; i < Puzzles.length; i++) {
			Puzzles[i] = new JButton();
			add(Puzzles[i]);
			Puzzles[i].setText(num.get(i));
			if (num.get(i).equals("16")) {
				Puzzles[i].setEnabled(false);
				Puzzles[i].setText("");
			}
			Puzzles[i].addActionListener(new PressedListener());
		}
		setSize(500, 300);
		setVisible(true);
	}

	private int[] Check = new int[4];

	private void NumberCheck(int index) {
		Check[0] = index - 4; // u
		Check[1] = index + 4; // d
		Check[2] = index - 1; // l
		Check[3] = index + 1; // r
		if (Check[1] > 16) {
			Check[1] = -1;
		}
		if (Check[2] < 0 || Check[2] % 4 == 3) {
			Check[2] = -1;
		}
		if (Check[3] % 4 == 0) {
			Check[3] = -1;
		}
	}

	private class PressedListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int index = 0, i1 = 0;

			JButton b1 = (JButton) e.getSource();
			JFrame f1 = (JFrame) b1.getTopLevelAncestor();

			while (!b1.equals(Puzzles[index])) {
				index++;
			}
			NumberCheck(index);
			for (int i = 0; i < Check.length; i++) {
				if (Check[i] > -1) {
					//Array Size Exception!
					if (Check[i] == 16) {
						continue;
					} else if (!Puzzles[Check[i]].isEnabled()) {
						if (count > 299) {
							f1.setTitle("이동 횟수 : " + count + "회" + " - 실패 (201720970_권대한)");
							for (JButton b2 : Puzzles) {
								b2.setEnabled(false);
							}
							break;
						}
						f1.setTitle("이동 횟수 : " + count + "회" + " (201720970_권대한)");
						count++;
						while (Puzzles[i1].getText().equals(Integer.toString(i1 + 1))) {
							// boolean?
							++i1;
						}
						// if 14, Is successes
						if (i1 > 13) {
							f1.setTitle("이동 횟수 : " + count + "회" + " - 성공 (201720970_권대한)");
						}
						// b1.getText() isPressed
						Puzzles[Check[i]].setText(Puzzles[index].getText());
						Puzzles[index].setText("");
						Puzzles[Check[i]].setEnabled(true);
						Puzzles[index].setEnabled(false);
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		new Puzzle_201720970();
	}
}
