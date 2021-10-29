package example1;

public class CurrentAccount {
	double overdraftLimit;
	public boolean withdraw()
	{
		if(overdraftLimit>50000) {
			throw new InvalidBalance("User exceded the limit");
		}
		else 
			System.out.println("User can withdraw");

		return true;
	}
}

