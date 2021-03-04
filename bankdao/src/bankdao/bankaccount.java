package bankdao;

public class bankaccount {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int accountNumber;
	private double balance;
	private String email;
	double newBalance;
	
	public String getFirstName() {
		return firstName;
	}
	public  void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public  void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
		
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
		
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(int num) {
		newBalance = balance + num;
		System.out.println(newBalance);
	}
		//withdraw method 
		
	public void withdraw(int num) {
		if (balance - num > 0) {
			newBalance = balance - num;
			System.out.println(newBalance);
		}
		else {
			System.out.println("not enough fund");
		}
	}
	public void getCustomerInfo() {
		System.out.println("Customer Name is "+ firstName + lastName);
		System.out.println("Account Number is "+accountNumber);
		System.out.println("Balnce is " + balance);
		System.out.println("Email is "+ email);
		System.out.println("Phone Nmber is "+ phoneNumber);
		
	}
		
}
