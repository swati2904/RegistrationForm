package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		// register the drive class
		Class.forName("oracle.jdbc.OracleDrive");
		
		// create the connection object
		Connection con = null;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:51521:xe","SYSTEM","root");
		if(con!= null) {
			System.out.println("estalished!!!");
		}
		return con;
	}
}

