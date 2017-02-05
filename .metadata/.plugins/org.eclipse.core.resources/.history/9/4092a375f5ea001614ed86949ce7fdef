import Aicommand.Aicommand;
import Aicommand.Aicommandcalculator;
import Aicommand.Aicommandnormal;

public class Aicommandlist {
	private Aicommand[] command;
	private Aicommand nowcommand;
	public Aicommandlist(){
		Aicommand[] command = {new Aicommandnormal(),
					new Aicommandcalculator()};
		this.command = command;
		nowcommand = command[0];
	}
	public Aicommand getNowcommand() {
		return nowcommand;
	}
	public void setNowcommand(int num) {
		this.nowcommand = command[num];
	}
	public boolean checkKey(String key){
		for(int i =0; i< command.length;i++){
			if(key.equalsIgnoreCase(command[i].getKey())){
				this.nowcommand = command[i];
				return true;
			}
		}
		return false;
	}
}
