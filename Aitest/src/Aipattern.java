
public class Aipattern {
	private String input;
	private String record;
	public Aipattern() {
		record = "";
	}
	public void setInput(String input) {
		String[] order = analyze(input);
		if(order[0].equalsIgnoreCase("hello")){
			record = "Hello, my user";
		}

	}
	private String[] analyze(String input) {
		String[] parts = input.split(" ");;
		return parts;
	}
	public String getRespond() {
		return record;

	}
}