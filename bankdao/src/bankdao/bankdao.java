package bankdao;
import java.util.ArrayList;
import java.sql.Connection;

public class bankdao {
	
	ArrayList<bankaccount> javaClass = new ArrayList<bankaccount>();
	
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    final String DB_URL = "jdbc:mysql://bankdatabase.cfhu7rqq4cib.us-west-1.rds.amazonaws.com:3306";
    final String USER = "admin";
    final String PASS = "admin123";
    Connection conn = null;
    
	public void createUser(bankaccount newUser) {
		javaClass.add(newUser);
	}
	public void readUsers() {
		for (bankaccount user : javaClass) {
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println(user.getPhoneNumber());
			System.out.println(user.getAccountNumber());
			System.out.println(user.getEmail());
			System.out.println(user.getBalance());
			System.out.println("*************************");
			System.out.println();
		}
	}
	
	public void updateUser(bankaccount newUser) {
		javaClass.add(newUser);
	}
	public void deleteUser(bankaccount newUser) {
		javaClass.remove(newUser);
	}
}

	