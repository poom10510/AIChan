
public class Aipattern {
	private String record;
	private Aiorder aiorder;
	public Aipattern() {
		aiorder = new Aiorder();
		record = "";
	}
	public void setInput(String input) {
		String[] order = analyze(input);
		aiorder.setResult(order);

	}
	private String[] analyze(String input) {
		String[] parts = input.split(" ");;
		return parts;
	}
	public String getRespond() {
		return aiorder.getResult();

	}
}
