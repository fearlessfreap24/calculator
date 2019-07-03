import java.awt.*;
import javax.swing.*;

public class Display extends JFrame{

//	private JFrame frame;
	private JTextField txtDisplay;
	private JButton[] buttons = new JButton[18];

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Display window = new Display();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Display() {
//		try {
//			Display window = new Display();
//			window.frame.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		frame = new JFrame();
		initialize(new JFrame());
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(JFrame frame) {
		frame.setBounds(100, 100, 221, 249);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		txtDisplay = new JTextField();
		panel_1.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		JButton buttonPlus = new JButton("+");
		panel_6.add(buttonPlus);
		buttons[10] = buttonPlus;
		
		JButton buttonMinus = new JButton("-");
		panel_6.add(buttonMinus);
		buttons[11] = buttonMinus;
		
		JButton buttonMultiply = new JButton("x");
		panel_6.add(buttonMultiply);
		buttons[12] = buttonMultiply;
		
		JButton buttonDivide = new JButton("/");
		panel_6.add(buttonDivide);
		buttons[13] = buttonDivide;
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button1 = new JButton("1");
		panel_2.add(button1);
		buttons[1] = button1;
		
		JButton button2 = new JButton("2");
		panel_2.add(button2);
		buttons[2] = button2;
		
		JButton button3 = new JButton("3");
		panel_2.add(button3);
		buttons[3] = button3;
		
		JButton buttonClear = new JButton("C");
		panel_2.add(buttonClear);
		buttons[14] = buttonClear;
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JButton button4 = new JButton("4");
		panel_3.add(button4);
		buttons[4] = button4;
		
		JButton button5 = new JButton("5");
		panel_3.add(button5);
		buttons[5] = button5;
		
		JButton button6 = new JButton("6");
		panel_3.add(button6);
		buttons[6] = button6;
		
		JButton buttonEquals = new JButton("=");
		panel_3.add(buttonEquals);
		buttons[16] = buttonEquals;
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JButton button7 = new JButton("7");
		panel_4.add(button7);
		buttons[7] = button7;
		
		JButton button8 = new JButton("8");
		panel_4.add(button8);
		buttons[8] = button8;
		
		JButton button9 = new JButton("9");
		panel_4.add(button9);
		buttons[9] = button9;
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JButton buttonPercent = new JButton("%");
		panel_5.add(buttonPercent);
		buttons[15] = buttonPercent;
		
		JButton button0 = new JButton("0");
		panel_5.add(button0);
		buttons[0] = button0;
		
		JButton buttonDecimal = new JButton(".");
		panel_5.add(buttonDecimal);
		buttons[17] = buttonDecimal;
		

		frame.setVisible(true);
	
	}
	
	public JButton[] getButtons() {
		return buttons;
	}
	
	public JTextField getTextField() {
		return txtDisplay;
	}

}
