package mks.learningActivities.annotations;

import java.lang.reflect.Method;

public class LoanTransaction {

	
	public static void main(String[] args) {
		Loan loan = new Loan();
		
		loan.processLoan(10000, 2);
		
		double interest = calculateInterest(loan);
		
		System.out.println("Interest of "+loan.getPrinciple()+" for "+loan.getTime()+" years is: "+interest);
	
	}
	
	private static double calculateInterest(Loan loan) {
		
		Method [] methods = loan.getClass().getMethods();
		double amount = 0;
		for(Method m : methods) {
			InterestRate rate = m.getAnnotation(InterestRate.class);
			
			if( rate != null) {
				amount = loan.getPrinciple() * loan.getTime() * rate.value() / 100;
			}
		}
		return amount;
	}
}
