import java.util.ArrayList;

public class Tameio {

	private String titlos;
	private String edra; 
	private ArrayList<Registered> registered = new ArrayList<>();
	
	public Tameio(String text1, String text2) {
		titlos = text1;
		edra = text2;
	}
	
	public String getTitlos() {
		return titlos;
	}
	
	public void addMember(Registered member) {
		this.registered.add(member); 
	}


	public ArrayList<Registered> getRegistered() {
		return registered;
	}
	
	
}
