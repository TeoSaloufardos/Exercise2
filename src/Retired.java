
public class Retired extends Registered {

	public Retired(String lastName, String taxNumber, double monthlyIncome, double incomeFeeRate) {
		super(lastName, taxNumber, monthlyIncome, incomeFeeRate);
	}
	
	public double netIncome() {
		return (getMonthlyIncome() * (1 - getIncomeFeeRate()));
	}
}
