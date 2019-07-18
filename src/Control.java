import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

public class Control implements ActionListener, KeyListener {
	
	// array of JButtons to hold the buttons from Display to add listeners.
	private JButton[] buttons;
	// a JTextField to hold the Display text field to change the calculator display.
	private JTextField txtDisplay;
	// A model to be able to call methods from Model
	private Model model;
	// using a stack to hold equation parts
	// a JLabel to present information on Diplay
	private JLabel lblTotaler;
	private Stack<String> shuffle = new Stack<String>();
	
	public static void main(String[] args) {
		// create new instance of Control
		Control start = new Control();
		// call the init method that runs the program.
		start.init();

	}
	
	// init() starts the display and runs the program
	private void init() {
		// creates Display instance
		Display disp = new Display();
		// creates Model instance
		model = new Model();
		// call for the buttons from the display
		buttons = disp.getButtons();
		// call for the Totaler
		lblTotaler = disp.getTotaler();
		// call for the text field from display
		txtDisplay = disp.getTextField();
		// add key listener to text field
		txtDisplay.addKeyListener(this);
		// set focus to text field
		txtDisplay.setFocusable(true);
		// add listeners to buttons
		buttons = addListeners(buttons);
	}
	
	// addListeners() adds listeners to the buttons on the display
	private JButton[] addListeners(JButton[] buttons) {
		// a loop to add listeners to all buttons in array
		for (int i=0; i<buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
		
		return buttons;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		sop(e.getActionCommand());
		// variable to hold the action performed to be passed to switch statement.
		String buttonPushed = e.getActionCommand();
		// switch for action performed
		switcher(buttonPushed);
		// reset focus to txtDisplay
		txtDisplay.requestFocusInWindow();
		
	}
	
	// a shortcut method for System.out.println
	private void sop(String a) {
		System.out.println(a);
	}
	
	// String concatenation
	private String addToString(String a, String b) {
		return a+b;
	}
	
	// verifies the input from text field is a number then put it on the stack and then adds the function button
	private void functionButton(String op) {
//		sop(String.format("txtDisplay = %s, legitNumber = %b", txtDisplay.getText(), model.legitNumber(txtDisplay.getText())));
		// if the input is a number, push it on the stack and then push the operator on the stack
		if (model.legitNumber(txtDisplay.getText())){
			shuffle.push(txtDisplay.getText());
			shuffle.push(op);
			txtDisplay.setText("");
		}
		// if input is not a number display Not A Number
		else {
			txtDisplay.setText("NAN");
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// string of characters to be used for comparison
		String acceptable = "0123456789%/*-+.=";
		// 
		String in = Character.toString(e.getKeyChar());
		// if the enter key is pressed, make "in" be the equal sign
		if (e.getKeyCode() == KeyEvent.VK_ENTER) in = "=";
		if (acceptable.indexOf(in) >= 0) switcher(in);
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
	
	private void switcher(String a) {

		String operator = "/*-+%";
		switch(a) {
			// clear button. clears text field and stack
			case "C": 
			
			case "c": {
				sop("Control->actionsPerformed->switch->case-C");
				txtDisplay.setText("");
				shuffle.empty();
				sop(String.format("Stack Size = %d", shuffle.size()));
				break;				
			}
			// cases for functions
			case "%": 
			
			case "+":
			
			case "-":
			
			case "x": 
			
			// if the stack is empty, add the number and operator to the stack. if it is not, perform calculations and add result and operator to the stack
			case "/": {
				sop(String.format("Control->actionsPerformed->switch->case-%s", a));
				
				if (shuffle.empty()) functionButton(a);
				else {
					calculate();
					functionButton(a);
				}
				sop(String.format("Stack Size = %d", shuffle.size()));
				break;				
			}
			// sends to Model to verify the current text field input and sends to Model to perform to arithmetic 
			case "=": {
				sop("Control->actionsPerformed->switch->case-=");
				
				calculate();
				sop(String.format("Stack Size = %d", shuffle.size()));
				
				break;								
			}
			// catches everything else and puts on display
			default: { 
				txtDisplay.setText(addToString(txtDisplay.getText(), a));
				break; }
			
			};
	}
	
	private void calculate() {
		
		if (model.legitNumber(txtDisplay.getText())) {
			txtDisplay.setText(model.equals(shuffle, txtDisplay.getText()));
		}
		// if not a number, display Not A Number
		else {
			txtDisplay.setText("NAN");
		}
	}

}
