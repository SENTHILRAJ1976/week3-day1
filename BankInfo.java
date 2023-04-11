package bankfunction;

public class BankInfo {

	public void saving() {
		System.out.println("Saving Account");
	}
	
	
	public void fixed() {
		System.out.println("Fixed Deposit");
		
	}
	
	
	public void deposit() {
		System.out.println("Deposit to Saving Account");
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankInfo info = new BankInfo();
		
		info.saving();
		info.fixed();
		info.deposit();

	}

}
