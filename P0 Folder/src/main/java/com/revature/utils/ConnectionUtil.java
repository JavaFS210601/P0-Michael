package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

public static Connection getConnection() throws SQLException{
		
		//For compatibility with other technologies/frameworks, we'll need to register our driver 
		//This process makes the application aware of what driver class (what SQL dialect) we're using
		
		try {
			Class.forName("org.postgresql.Driver"); //try to find and return the postgresql driver Class
		} 
		catch (ClassNotFoundException e){
			System.out.println("Class wasn't found");
			e.printStackTrace(); //prints the exception message to the console 
		}
		
		//Successfully hidden DB credentials in environment variable
		//run -> run configurations -> environment -> add the environment variable key/pairs you want 
		String url = System.getenv("url");
		String username = System.getenv("username");
		String password = System.getenv("password");		
		
		
		return DriverManager.getConnection(url, username, password);
	
}
}
