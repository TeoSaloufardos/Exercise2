import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputForm extends JFrame { 

	private ArrayList<Tameio> tameia;
	private JTextField tameioField;
	private JPanel panel;

	private JButton ektypwsi;

	public InputForm(ArrayList<Tameio> tameia) {

		this.tameia = tameia;
		tameioField = new JTextField("Παρακαλώ εισάγετε το ταμείο που σας ενδιαφέρει:");

		ektypwsi = new JButton("Print");

		panel = new JPanel();
		panel.add(ektypwsi);
		this.setContentPane(panel);

		ButtonListener listener = new ButtonListener();
		ektypwsi.addActionListener(listener);

		panel.add(tameioField);
		this.setContentPane(panel);

		this.setSize(500, 250);
		this.setVisible(true);
		this.setTitle("Input Form");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String userInput = tameioField.getText(); // με αυτον τον τροπο μπορω να παρω την καταχωρηση που εχει κανει
														// ο χρηστης στο field/πεδιο και την εκχωρω στο userInput.

			Boolean found = true;
			int i = 0;
			while (found == true && i < tameia.size()) {

				if (tameia.get(i).getTitlos().equals(userInput)) {
					found = false;
					System.out.println("For " + userInput + " here are the resultes.");
					for (int y = 0; y < tameia.get(i).getRegistered().size(); y++) {
						System.out.println("Name: " + tameia.get(i).getRegistered().get(y).getLastName()+ " Net Income:" + tameia.get(i).getRegistered().get(y).netIncome());
					}
				}
				i++;

			}
			if (found == true) {
				System.out.println("Please insert again, we didnt find anything like that");
			}

		}

	}

}
