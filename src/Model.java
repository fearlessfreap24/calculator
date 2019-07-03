import java.util.Stack;

public class Model {

	public String equals(Stack<String> shuffle, String text) {
		String args = shuffle.pop();
		switch (args) {
			case "%": {
				double percent = Double.parseDouble(text) * 0.01;
				return Float.toString(Float.parseFloat(shuffle.pop()) * (float) percent);
			}
			
			case "+": {
				Float plus = Float.parseFloat(text);
				return Float.toString(Float.parseFloat(shuffle.pop()) + plus);
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
