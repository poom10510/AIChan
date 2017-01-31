
public class Aiorder {
	private String result;
	private double value;
	public Aiorder() {
		result = "";
		value = 0;
	}
	public void setResult(String[] input) {
		String[] order = input;
		if(order[0].equalsIgnoreCase("hello")){
			this.result = "Hello, my user.";
		}
		else if(order[0].equalsIgnoreCase("set")||order[0].equalsIgnoreCase("=")){
			try {
				value = Double.parseDouble(order[1]);
			} catch (Exception e) {
				// TODO: handle exception
			}
			this.result = ""+value;
		}
		else if(order[0].equalsIgnoreCase("plus")||order[0].equalsIgnoreCase("+")){
			for(int i =1; i<order.length;i++){
				try {
					value += Double.parseDouble(order[i]);
					//System.out.println(value);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			this.result = ""+value;
		}
		else if(order[0].equalsIgnoreCase("minus")||order[0].equalsIgnoreCase("-")){
			for(int i =1; i<order.length;i++){
				try {
					value -= Double.parseDouble(order[i]);
					//System.out.println(value);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			this.result = ""+value;
		}
		else if(order[0].equalsIgnoreCase("multi")||order[0].equalsIgnoreCase("*")){
			for(int i =1; i<order.length;i++){
				try {
					value *= Double.parseDouble(order[i]);
					//System.out.println(value);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			this.result = ""+value;
		}
		else if(order[0].equalsIgnoreCase("divide")||order[0].equalsIgnoreCase("/")){
			for(int i =1; i<order.length;i++){
				try {
					value /= Double.parseDouble(order[i]);
					//System.out.println(value);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			this.result = ""+value;
		}
		else if(order[0].equalsIgnoreCase("end")){
			this.result = "Good Bye, my user.";
		}
		else{
			this.result = "Please say again.";
		}
		
	}
	public String getResult() {
		return result;
	}
}
