package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
	

		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con =null;
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","SYSTEM","Default@123");
		
		
	   if(con!=null)
	   {
		   System.out.println("Connected");
	   }
	   else
		   System.out.println("connection not established");
	   
	   
	   
	   }
}


