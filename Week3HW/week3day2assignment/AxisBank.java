package week3day2assignment;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Deposit Amount Rs.90000");
		
		}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.saving();
	}

}
