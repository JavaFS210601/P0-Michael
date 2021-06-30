package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.revature.models.Star;
import com.revature.utils.ConnectionUtil;

public class StarDao implements StarDaoInterface {

	@Override
	public List<Star> getStars() {
		try(Connection conn = ConnectionUtil.getConnection()) { //try to establish a DB connection, so we can run a query
			
			ResultSet rs = null; //initialize an empty result set that will store the results of our query
			
			String sql = "SELECT * FROM \"Stellar\".stars;"; //write the query, assign it to a string variable, put ; inside and outside double quotes
			
			Statement s = conn.createStatement(); //creating an object to send the query to our database 
			
			rs = s.executeQuery(sql); //execute the query (sql) using our statement object (s), put it in our ResultSet (rs)
			
			List<Star> starList = new ArrayList<>(); //create a list that will be populated with the returned stars
			
			while(rs.next()) { // while there are results left in the ResultSet (rs) do what's in the while loop
				
				//Create a new Star Object from each return row record 
				//This is the Star Class's all args constructor
				//And we are filling it with each column of the Star record 
				Star star = new Star( //blue star = class, yellow star = object name, "new" = object creation, green star = all arg's constructor in class star
						rs.getInt("star_id"),
						rs.getString("coll_name"),
						rs.getString("sci_name"),
						rs.getDouble("star_mass"),
						rs.getInt("spectral_id")
					);
				
				//add the newly created Star Object in the ArrayList of Stars
				starList.add(star);
			}
			
			return starList; //Finally, if successful, return the list of stars
			
			
			
		} catch(SQLException e) { //if something goes wrong accessing our data, it will get caught
			System.out.println("Something went wrong when trying to access your database");
			e.printStackTrace();
		}
		
		return null; //Java will yell if we don't have this because the try isn't guaranteed to succeed 
	}

		
		
		
		
		
	@Override
	public void addStar(Star newStar) {
		
		try(Connection conn = ConnectionUtil.getConnection()){
			
			//we're going to create a SQL statement using parameters to insert a new Star
			
			String sql = "INSERT INTO \"Stellar\".stars (coll_name, sci_name, star_mass, spectral_id)"
					+ "VALUES (?, ?, ?, ?);"; //these are parameters! We have to now specify the value of each "?"
			
			PreparedStatement ps = conn.prepareStatement(sql); //we use PreparedStatements for SQL commands with parameters 
			
			//use the PreparedStatement Object to insert values into the SQL query
			//The values will come from the employee object we sent in 
			//this requires two arguments, the number of the "?", and the value to give it 
			ps.setString(1, newStar.getColl_name());
			ps.setString(2, newStar.getSci_name());
			ps.setDouble(3, newStar.getStar_mass());
			ps.setInt(4, newStar.getSpectral_id());
			
			//this method actually executes the SQL command that we built 
			ps.executeUpdate(); // we use executeUpdate for insertions, updates, and deletes 
			
			//send confirmation to the console if successful 
			
			System.out.println(newStar.getColl_name() + " has been created. You are shining bright!");
			
			
		} 
		
		catch(SQLException e) {
			System.out.println("Star creation failed!");
			e.printStackTrace();
		}
		
		
	}
		
		
		
	@Override
	public void changeStar(int starId, int spectralId) {
		try(Connection conn = ConnectionUtil.getConnection()) {
			
			//notice how there are no ResultSet objects in method that don't include select statements 
			//because we aren't returning anything! Only changing stuff in the DB, not getting data from it 
			
			String sql = "UPDATE \"Stellar\".stars SET spectral_id = ? WHERE star_id = ?;";
			
			PreparedStatement ps = conn.prepareStatement(sql); //make a PreparedStatement using the sql string we made 
			
			//adding values to the wildcard parameters based on the users inputs 
			ps.setInt(1, spectralId);
			ps.setInt(2, starId);
			
			ps.executeUpdate(); //Run the PreparedStatement now that we've given values to its parameters
			
			if(spectralId == 1) {
				System.out.println("Star has change to: " + spectralId + "\nThis star is now an O class star! Visit \"Spectrum\" to learn more.");
			}
			if(spectralId == 2) {
				System.out.println("Star has change to: " + spectralId + "\nThis star is now a B class star! Visit \"Spectrum\" to learn more.");
			}
			if(spectralId == 3) {
				System.out.println("Star has change to: " + spectralId + "\nThis star is now an A class star! Visit \"Spectrum\" to learn more.");
			}
			if(spectralId == 4) {
				System.out.println("Star has change to: " + spectralId + "\nThis star is now an F class star! Visit \"Spectrum\" to learn more.");
			}
			if(spectralId == 5) {
				System.out.println("Star has change to: " + spectralId + "\nThis star is now a G class star! Visit \"Spectrum\" to learn more.");
			}
			if(spectralId == 6) {
				System.out.println("Star has change to: " + spectralId + "\nThis star is now a K class star! Visit \"Spectrum\" to learn more.");
			}
			if(spectralId == 7) {
				System.out.println("Star has change to: " + spectralId + "\nThis star is now an M class star! Visit \"Spectrum\" to learn more.");
			}
			
			
			
		}catch(SQLException e) {
			System.out.println("Change of star properties failed!");
			e.printStackTrace();
		}
		
	}
		
	
	
	
	
	
	
	

	@Override
	public void removeStar(int starId) {
		
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "DELETE FROM \"Stellar\".stars WHERE star_id = ?;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, starId);
			
			ps.executeUpdate();
			
			
			
			
		}catch(SQLException e) {
			System.out.println("Supernova failed!");
			e.printStackTrace();
		}
		
		
	}

		
		
	}
		
		
		
		
	


