package Aicommand;

import java.util.ArrayList;
import java.util.List;

public class Aicommandschedule extends Aicommand{
	private List<String> list;
	private String result;
	public Aicommandschedule() {
		super(Aistatelist.SCHEDULE,"sch", "Schedule");
		/*String[] list = {"sleep",
						 "eat",
						 "play game"};*/
		this.list = new ArrayList<String>();
		this.list.add("sleep");
		this.list.add("eat");
		this.list.add("play game");
		//this.list =list;
		this.result ="";
	}

	@Override
	public String Active(String[] input) {
		this.result ="";
		if(input[0].equalsIgnoreCase("view")){
			if(list.size()==0){
				result = "No schedule.";
			}
			else{
				for (int i = 0; i < list.size(); i++) {
					result += i+1+". "+list.get(i)+"\n";
				}
			}
				
		}
		
		return this.result;
	}

}
