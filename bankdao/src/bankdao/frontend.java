package bankdao;
import java.util.ArrayList;

public class frontend {
	public static void main(String[] args) {
		bankdao studentDao = new bankdao();
		bankaccount account = new bankaccount();
		
		account.setFirstName("Richard");
		account.setLastName("Liu");
		account.setAccountNumber(123456);
		account.setBalance(800);
		account.setEmail("abc@gmail.com");
		account.setPhoneNumber("8888888888");
		account.withdraw(500);
		
		studentDao.createUser(account);
		studentDao.updateUser(account);
		
		studentDao.readUsers();
	}
}

