package Aicommand;

public class Aicommandnormal extends Aicommand{

	public Aicommandnormal() {
		super(Aistatelist.NORMAL,"normal", "Normal");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Active(String[] input) {
		String result ="";
		if(input[0].equalsIgnoreCase("hello")){
			result = "Hello, my user.";
		}
		else if(input[0].equalsIgnoreCase("end")){
			result = "Good Bye, my user.";
		}
		else{
			result = "Please say again.";
		}
		return result;
	}

}
