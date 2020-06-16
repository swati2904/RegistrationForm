package mainapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		System.out.println("Register Here!!!");
		System.out.println("Login");
		int x; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// taking input from the user.
		x = Integer.parseInt(br.readLine());
		
		RegisterPojo registerpojo = new RegisterPojo();
		RegisterDAO registerdao = new RegisterDAO();
		switch(x) {
		case 1: 
			System.out.println("Enter your first name");
			String firstname = br.readLine();
			System.out.println("Enter your last name");
			String lastname = br.readLine();
			System.out.println("Enter your user name");
			String username = br.readLine();
			System.out.println("Enter your email ");
			String email = br.readLine();
			System.out.println("Enter your password");
			String password = br.readLine();
			
			
			registerpojo.setFirstname(firstname);
			registerpojo.setLastname(lastname);
			registerpojo.setUsername(username);
			registerpojo.setEmail(email);
			registerpojo.setPassword(password);
			
			registerdao.addUser(registerpojo);
			break;
			
			
		case 2:	break;
		}
	}
}
