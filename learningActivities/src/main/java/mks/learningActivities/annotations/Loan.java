package mks.learningActivities.annotations;

public class Loan {

	private int principle;
	private int time;
	
	@InterestRate(value = 24)
	public void processLoan(int principle, int time) {
		this.principle = principle;
		this.time = time;
	}

	public int getPrinciple() {
		return principle;
	}

	public int getTime() {
		return time;
	}

}
