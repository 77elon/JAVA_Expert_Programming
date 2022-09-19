import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class My201720970One extends JFrame {
	JLabel Label1 = new JLabel("아래의 버튼 중 하나를 입력하시오.");
	JLabel Label2 = new JLabel("Good Luck!");
	JPanel Main = new JPanel();

	public My201720970One() {
		JButton[] ButtonSet = new JButton[3];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("가위 바위 보 (201720970 권대한)");
		Container c = getContentPane();

		c.setLayout(new BorderLayout(0, 10));
		c.add(Label1, BorderLayout.NORTH);
		c.add(Label2, BorderLayout.SOUTH);
		c.add(Main, BorderLayout.CENTER);
		ButtonSet[0] = new JButton("0 : 가위");
		ButtonSet[1] = new JButton("1 : 바위");
		ButtonSet[2] = new JButton("2 : 보");
		for (int i = 0; i < ButtonSet.length; i++) {
			Main.add(ButtonSet[i]);
			ButtonSet[i].addActionListener(new Listener1());
		}
		Main.setLayout(new GridLayout(1, 3));
		setSize(400, 200);
		setVisible(true);
	}

	private class Listener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton Temp = (JButton) e.getSource();
			int Num1 = Character.getNumericValue(Temp.getText().charAt(0));
			int Computer_Num = (int) (Math.random() * 3);

			if (Num1 == 0 && Computer_Num == 2) {
				Label2.setText("인간 : " + Num1 + " 컴퓨터 : " + Computer_Num + " 결과 : 인간 승리!");
			} else if (Num1 == 2 && Computer_Num == 0) {
				Label2.setText("인간 : " + Num1 + " 컴퓨터 : " + Computer_Num + " 결과 : 컴퓨터 승리!");
			} else if (Num1 == Computer_Num) {
				Label2.setText("인간 : " + Num1 + " 컴퓨터 : " + Computer_Num + " 결과 : 비겼습니다.");
			} else if (Num1 > Computer_Num) {
				Label2.setText("인간 : " + Num1 + " 컴퓨터 : " + Computer_Num + " 결과 : 인간 승리!");
			} else if (Num1 < Computer_Num) {
				Label2.setText("인간 : " + Num1 + " 컴퓨터 : " + Computer_Num + " 결과 : 컴퓨터 승리!");
			}
		}
	}

	public static void main(String[] args) {
		new My201720970One();
	}

}
