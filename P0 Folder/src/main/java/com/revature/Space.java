package com.revature;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.models.Menu;
import com.revature.utils.ConnectionUtil;

public class Space {

	public static void main(String[] args) {
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			System.out.println("Connection to space successful!");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		Menu menu = new Menu();
		
		menu.display();

	}

}
