import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		Tameio Tameio1 = new Tameio("Trapezikwn", "Ermou 20 Athina");
		Tameio Tameio2 = new Tameio("Ygeionomikwn", "Panepistimiou 45 Athina");
		Tameio Tameio3 = new Tameio("Nomikwn", "Solwnos 15 Athina");
		
		ArrayList<Tameio> tameia = new ArrayList<Tameio>();
		tameia.add(Tameio1);
		tameia.add(Tameio2);
		tameia.add(Tameio3);
		
		Employee empl1 = new Employee("Papagewrgiou", "0987654321", 600, 0.05, 2); 
		Employee empl2 = new Employee("Papastergiou", "0987346321", 987, 0.03, 0);
		Employee empl3 = new Employee("Dhmhtriadhs", "0245213421", 800, 0.08, 1);
		
		Retired retired1 = new Retired("Xaralampous", "0984731341", 1000, 0.07);
		Retired retired2 = new Retired("Kapetanios","4839104839", 750, 0.06);
		Retired retired3 = new Retired("Karakwstas","9483918312", 550, 0.05);
		
		Tameio1.addMember(empl1); Tameio1.addMember(retired1);
		Tameio2.addMember(empl2); Tameio2.addMember(retired2);
		Tameio3.addMember(empl3); Tameio3.addMember(retired3);
		
		
		
				
		new InputForm(tameia);
		
		
	}

}
