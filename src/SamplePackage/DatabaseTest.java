package SamplePackage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest {

	
	
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		
		 String dbUrl = "jdbc:mysql://localhost:3306/demo?useSSL=true";
		 
		 String username = "root";
		 
		 String Password = "Iopjkl@123";
		 
		Connection con = DriverManager.getConnection(dbUrl,username ,Password);
		
		// Connection con = DriverManager.getConnection("jdbc:sql://localhost:3306;databaseName=demo;user=root;password={Iopjkl@123};");
		
		Class.forName("com.mysql.jdbc.Driver"); 
		
		Statement s = con.createStatement();
		
		ResultSet rs = s.executeQuery("SELECT * FROM demo.bank_data where blzcode=55020100");
		
		rs.next();
		
		String s1 = rs.getString("bezeichnung");
		
		String s2 = rs.getString("biccode");
		
		System.out.println(s1);
		
		System.out.println(s2);
	}
}
