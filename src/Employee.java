
public class Employee extends Registered{
	private int protectedMembers;

	public Employee(String lastName, String taxNumber, double monthlyIncome, double incomeFeeRate, int protectedMembers) {
		super(lastName, taxNumber, monthlyIncome, incomeFeeRate);
		this.protectedMembers = protectedMembers;
	}
	
	public double netIncome() {
		return (getMonthlyIncome() * (1 - getIncomeFeeRate()) + protectedMembers * 100 );
	}
}
