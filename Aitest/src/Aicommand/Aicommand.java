package Aicommand;

public abstract class Aicommand {
	private Aistatelist state;
	private String key,greeting;
	public Aicommand(Aistatelist state,String key,String greeting) {
		this.state = state;
		this.key = key;
		this.greeting = greeting;
	}
	public abstract String Active(String[] input );
	public Aistatelist getState(){
		return state;
	}
	public String getKey() {
		return key;
	}
	public String getGreeting() {
		return greeting;
	}
	
}
