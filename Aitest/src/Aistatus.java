import Aicommand.Aistatelist;

public class Aistatus {
	private static Aistatus ins;
	private Aistatelist status;
	private Aicommandlist command;
	private Aistatus() {
		status = Aistatelist.NORMAL;
		command = new Aicommandlist();
	}
	public static Aistatus getInstance(){
		if(ins == null){
			ins = new Aistatus();
		}
		return ins;
	}
	public void setStatus(char status) {
		if(status == 'n'){
			this.status = Aistatelist.NORMAL;
			this.command.setNowcommand(this.status.getNumber());
		}
		else if(status == 'c'){
			this.status = Aistatelist.CALCULATOR;
			this.command.setNowcommand(this.status.getNumber());
		}
		
	}
	public boolean changeCommand(String input){
		return this.command.checkKey(input);
	}
	public Aicommandlist getCommand() {
		return command;
	}
	public Aistatelist getStatus(){
		//return status;
		return this.command.getNowcommand().getState();
	}
}
