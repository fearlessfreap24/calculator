import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Control implements ActionListener {

	private JButton[] buttons;
	private JTextField txtDisplay;
	private Model model;
	private Stack<String> shuffle = new Stack<String>();
	
	public static void main(String[] args) {
		Control start = new Control();
		start.init();

	}
	
	private void init() {
		Display disp = new Display();
		model = new Model();
		buttons = disp.getButtons();
		txtDisplay = disp.getTextField();
		buttons = addListeners(buttons);
	}

	private JButton[] addListeners(JButton[] buttons) {
		for (int i=0; i<buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
		
		return buttons;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		sop(e.getActionCommand());
		String buttonPushed = e.getActionCommand();
		switch(buttonPushed) {
		
			case "C": {
				sop("Control->actionsPerformed->switch->case-C");
				txtDisplay.setText("");
				shuffle.empty();
				break;				
			}
			
			case "%": 
			
			case "+":
			
			case "-":
			
			case "x": 
			
			case "/": {
				sop("Control->actionsPerformed->switch->case-/");
				functionButton(buttonPushed);
				break;				
			}
			
			case "=": {
				sop("Control->actionsPerformed->switch->case-=");
				if (model.legitNumber(txtDisplay.getText())) {
					txtDisplay.setText(model.equals(shuffle, txtDisplay.getText()));
				}
				else {
					txtDisplay.setText("NAN");
				}
				break;								
			}
			
			default: { 
				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
				break; }
			
			};
		
	}
	
	private void sop(String a) {
		System.out.println(a);
	}
	
	private String addToString(String a, String b) {
		return a+b;
	}
	
	private void functionButton(String op) {
		sop(String.format("txtDisplay = %s, legitNumber = %b", txtDisplay.getText(), model.legitNumber(txtDisplay.getText())));
		if (model.legitNumber(txtDisplay.getText())){
			shuffle.push(txtDisplay.getText());
			shuffle.push(op);
			txtDisplay.setText("");
		}
		else {
			txtDisplay.setText("NAN");
		}
		
	}

}
