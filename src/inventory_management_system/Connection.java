package inventory_management_system;

import java.sql.DriverManager;

//TODO: fix getConnection method once db issues are solved & write readTable

public class Connection {

	public Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/dbname"; //fix dbname once db problems are resolved
			String username = "";
			String password = ""; //username and password for dev purposes
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return conn;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	
}
