package Aicommand;

public enum Aistatelist {
	NORMAL(0),
	CALCULATOR(1),
	SCHEDULE(2);
	
	 private int num;

	 Aistatelist(int num) {
	        this.num = num;
	    }
	 
	 public int getNumber(){
		return num;
		 
	 }
}
