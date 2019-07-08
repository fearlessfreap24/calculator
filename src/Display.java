//
// page made with Eclipse WindowBuilder
//
import java.awt.*;
import javax.swing.*;

public class Display extends JFrame{
	// variable to hold text field
	private JTextField txtDisplay;
	// array of JButtons to hold calculator buttons
	private JButton[] buttons = new JButton[18];
	/**
	 * Create the application.
	 */
	public Display() {
		initialize(new JFrame());
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(JFrame frame) {
		frame.setBounds(100, 100, 221, 249);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// panel 1 main panel
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 1, 0, 0));
		// panel_1 holds text field/display
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		txtDisplay = new JTextField();
		panel_1.add(txtDisplay);
		txtDisplay.setColumns(20);
		// panel_6 holds arithmetic buttons
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		JButton buttonPlus = new JButton("+");
		panel_6.add(buttonPlus);
		// add button to array
		buttons[10] = buttonPlus;
		
		JButton buttonMinus = new JButton("-");
		panel_6.add(buttonMinus);
		// add button to array
		buttons[11] = buttonMinus;
		
		JButton buttonMultiply = new JButton("x");
		panel_6.add(buttonMultiply);
		// add button to array
		buttons[12] = buttonMultiply;
		
		JButton buttonDivide = new JButton("/");
		panel_6.add(buttonDivide);
		// add button to array
		buttons[13] = buttonDivide;
		// panel_2 holds 1,2,3,and Clear
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button1 = new JButton("1");
		panel_2.add(button1);
		// add button to array
		buttons[1] = button1;
		
		JButton button2 = new JButton("2");
		panel_2.add(button2);
		// add button to array
		buttons[2] = button2;
		
		JButton button3 = new JButton("3");
		panel_2.add(button3);
		// add button to array
		buttons[3] = button3;
		
		JButton buttonClear = new JButton("C");
		panel_2.add(buttonClear);
		// add button to array
		buttons[14] = buttonClear;
		//panel_3 holds 4,5,6,and =
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JButton button4 = new JButton("4");
		panel_3.add(button4);
		// add button to array
		buttons[4] = button4;
		
		JButton button5 = new JButton("5");
		panel_3.add(button5);
		// add button to array
		buttons[5] = button5;
		
		JButton button6 = new JButton("6");
		panel_3.add(button6);
		// add button to array
		buttons[6] = button6;
		
		JButton buttonEquals = new JButton("=");
		panel_3.add(buttonEquals);
		// add button to array
		buttons[16] = buttonEquals;
		// panel_4 holds 7,8,and 9
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JButton button7 = new JButton("7");
		panel_4.add(button7);
		// add button to array
		buttons[7] = button7;
		
		JButton button8 = new JButton("8");
		panel_4.add(button8);
		// add button to array
		buttons[8] = button8;
		
		JButton button9 = new JButton("9");
		panel_4.add(button9);
		// add button to array
		buttons[9] = button9;
		// panel_5 holds %,0,and (.)
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JButton buttonPercent = new JButton("%");
		panel_5.add(buttonPercent);
		// add button to array
		buttons[15] = buttonPercent;
		
		JButton button0 = new JButton("0");
		panel_5.add(button0);
		// add button to array
		buttons[0] = button0;
		
		JButton buttonDecimal = new JButton(".");
		panel_5.add(buttonDecimal);
		// add button to array
		buttons[17] = buttonDecimal;
		// make the frame visible after everything is in place
		frame.setVisible(true);
	
	}
	// method to send array of JButtons to Control
	public JButton[] getButtons() {
		return buttons;
	}
	// method to send JTextField to Control
	public JTextField getTextField() {
		return txtDisplay;
	}

}
