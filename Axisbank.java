package week3Assig;

public class Axisbank {

	public void deposit() {
		System.out.println("deposit:30,000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***BankInfo***");
		BankInfoAssignment Bank = new BankInfoAssignment();
		Bank.saving();
		Bank.fixed();
		Bank.deposit();
		System.out.println("***AxisBank***");
		Axisbank Axis = new Axisbank();
		Axis.deposit();
	}
}
