package hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl ="jdbc:mariadb://nasoab.myqnapcloud.com:3306/Spring-Hibernate";
		String user= "root";
		String pwd ="admin";
		try {
			System.out.println("Connection To  !! "+jdbcUrl);
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conx = DriverManager.getConnection(jdbcUrl,user,pwd);
			System.out.println("Connection successfull !!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
