
public abstract class Registered {
	private String lastName;
	private String taxNumber;
	private double monthlyIncome;
	private double incomeFeeRate;
	
	public Registered(String lastName, String taxNumber, double monthlyIncome, double incomeFeeRate) {
		super();
		this.lastName = lastName;
		this.taxNumber = taxNumber;
		this.monthlyIncome = monthlyIncome;
		this.incomeFeeRate = incomeFeeRate;
	}	
	
	public abstract double netIncome();

	public String getLastName() {
		return lastName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public double getIncomeFeeRate() {
		return incomeFeeRate;
	}
	
	
	
}
