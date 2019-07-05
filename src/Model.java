import java.util.Stack;

public class Model {

	public String equals(Stack<String> shuffle, String text) {
		String args = shuffle.pop();
		switch (args) {
		
			case "%": {
				double percent = Double.parseDouble(text) * 0.01;
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
			
			default: { return null; }
		}
	}
	
	public boolean legitNumber(String a) {
		sop(String.format("model->legitNumber length = %d", a.split("\\.").length));
		return a.split("\\.").length <= 2;
	}
	
	private void sop(String a) {
		System.out.println(a);
	}
	
}
