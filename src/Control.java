import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.StringTokenizer;

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
		
//			case "1": {
//				sop("Control->actionsPerformed->switch->case-1");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//				}
//			
//			case "2": {
//				sop("Control->actionsPerformed->switch->case-2");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//			}
//			
//			case "3": {
//				sop("Control->actionsPerformed->switch->case-3");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//			}
//			
//			case "4": {
//				sop("Control->actionsPerformed->switch->case-4");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//			}
//			
//			case "5": {
//				sop("Control->actionsPerformed->switch->case-5");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//			}
//			
//			case "6": {
//				sop("Control->actionsPerformed->switch->case-6");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//			}
//			
//			case "7": {
//				sop("Control->actionsPerformed->switch->case-7");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//			}
//			
//			case "8": {
//				sop("Control->actionsPerformed->switch->case-8");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//			}
//			
//			case "9": {
//				sop("Control->actionsPerformed->switch->case-9");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//			}
//			
//			case "0": {
//				sop("Control->actionsPerformed->switch->case-0");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//			}
//			
//			case ".": {
//				sop("Control->actionsPerformed->switch->case-.");
//				txtDisplay.setText(addToString(txtDisplay.getText(), buttonPushed));
//				break;
//			}
			case "C": {
				sop("Control->actionsPerformed->switch->case-C");
				txtDisplay.setText("");
				shuffle.empty();
				break;				
			}
			
			case "%": {
				sop("Control->actionsPerformed->switch->case-%");
				functionButton(buttonPushed);
				break;				
			}
			
			case "+": {
				sop("Control->actionsPerformed->switch->case-+");
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
			
			case "-": {
				sop("Control->actionsPerformed->switch->case--");
				functionButton(buttonPushed);
				break;				
			}
			
			case "x": {
				sop("Control->actionsPerformed->switch->case-x");
				functionButton(buttonPushed);
				break;				
			}
			
			case "/": {
				sop("Control->actionsPerformed->switch->case-/");
				functionButton(buttonPushed);
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
