package com.revature.daos;

import java.util.List;

import com.revature.models.Star;

public interface StarDaoInterface {
	
	public List<Star> getStars(); //return a List of all stars

	public void addStar(Star newStar); //take a new star object, add it to the database
	
	public void changeStar(int starId, int spectralId); // change a star's spectral_id (their property) given their star_id
	
	public void removeStar(int starId);  //remove a star based on given star_id
	
	

	
	
	

}
