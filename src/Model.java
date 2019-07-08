import java.util.Stack;

public class Model {

	// this function pulls the items and performs the arithmetic
	public String equals(Stack<String> shuffle, String text) {
		// pop the operator off of the stack for the switch
		String args = shuffle.pop();
		// all arithmetic are returned as a float with 4 decimal places
		switch (args) {
			// the percentage is calculated as a Double and returned as a formatted float
			case "%": {
				// turn the number to be the  percentage in to a Double
				double percent = Double.parseDouble(text) * 0.01;
				// arithmetic
				return String.format("%.4f", Float.parseFloat(shuffle.pop()) * (float) percent);
			}
			
			case "+": {
				Float plus = Float.parseFloat(text);
				return String.format("%.4f", Float.parseFloat(shuffle.pop()) + plus);
			}
			
			case "-": {
				Float minus = Float.parseFloat(text);
				return String.format("%.4f", Float.parseFloat(shuffle.pop()) - minus);
			}
			
			case "x": {
				Float multiply = Float.parseFloat(text);
				return String.format("%.4f", Float.parseFloat(shuffle.pop()) * multiply);
			}
			
			case "/": {
				Float divide = Float.parseFloat(text);
				return String.format("%.4f", Float.parseFloat(shuffle.pop()) / divide);
			}
			// in case something weird was passed, return null
			default: { return null; }
		}
	}
	// verify input is a number
	public boolean legitNumber(String a) {
		sop(String.format("model->legitNumber length = %d", a.split("\\.").length));
		// split the input at the period and count the size of the arrays is less than or equal to 2
		return a.split("\\.").length <= 2;
	}
	// shortcut method for System.out.println
	private void sop(String a) {
		System.out.println(a);
	}
	
}
