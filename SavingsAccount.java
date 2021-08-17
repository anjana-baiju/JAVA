class SavingsAccount
{
	public static double annualInterestRate;
	private double savingsBalance;
	public SavingsAccount()
	{
		annualInterestRate=0.0;
		savingsBalance=0.0;
	}
	SavingsAccount(double rate,double bal)
	{
		annualInterestRate=rate;
		savingsBalance=bal;
	}
	
	public void monthlyInterest()
	{
		
		savingsBalance=savingsBalance + ((savingsBalance*annualInterestRate)/12);
		
	}


	public static void modifyInterestRate(double newRate)
	{
		annualInterestRate=newRate;
	}

	
	

	public static void main(String args[])
	{
		SavingsAccount saver1=new SavingsAccount(0.04,2000.00);
		SavingsAccount saver2=new SavingsAccount(0.04,3000.0);
		
		saver1.monthlyInterest();
		saver2.monthlyInterest();
		System.out.println("Details of Saver 1:");
		System.out.println("New Balance :" + saver1.savingsBalance);
		System.out.println("Details of Saver 2:");
		System.out.println("New Balance :" + saver2.savingsBalance);

		SavingsAccount.modifyInterestRate(0.05);
		saver1.monthlyInterest();
		saver2.monthlyInterest();
		System.out.println("Annual Interest Rate Modified to 5%......!!");
		System.out.println("Details of Saver 1:");
		System.out.println("New Balance :" + saver1.savingsBalance);
		System.out.println("Details of Saver 2:");
		System.out.println("New Balance :" + saver2.savingsBalance);
	}
}
