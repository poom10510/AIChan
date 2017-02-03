
public class Aiorder {
	private String result;
	private double value;
	private Aistatus st;
	public Aiorder() {
		result = "";
		value = 0;
		st= Aistatus.getInstance();
	}
	public void setResult(String[] input) {
		String[] order = input;
		if(st.getStatus().getNumber()==0){
			
			if(order[0].equalsIgnoreCase("cal")){
				st.setStatus('c');
				this.result = "I will open calculator, my user.";
			}
			else if(order[0].equalsIgnoreCase("hello")){
				this.result = "Hello, my user.";
			}
			else if(order[0].equalsIgnoreCase("end")){
				this.result = "Good Bye, my user.";
			}
			else{
				this.result = "Please say again.";
			}
		}
		else if(st.getStatus().getNumber()==1 ){
			/*if(order[0].equalsIgnoreCase("set")||order[0].equalsIgnoreCase("=")){
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
			}*/
			
			 if(order[0].equalsIgnoreCase("cancel")){
				st.setStatus('n');
				this.result = "I will close calculator, my user.";
			}
			else if(order[0].equalsIgnoreCase("end")){
				this.result = "Good Bye, my user.";
			}
			else{
				this.result = st.getCommand().getNowcommand().Active(order);
			}
		}
		
		
		
	}
	public String getResult() {
		return result;
	}
}
