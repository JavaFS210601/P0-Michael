package com.revature.models;

public class Star {
	
	private int star_id;
	private String coll_name;
	private String sci_name;
	private double star_mass;
	private int spectral_id;
	
	
	
	//no args constructor
	public Star() {
		super();
	}


	//all args constructor
	public Star(int star_id, String coll_name, String sci_name, double star_mass, int spectral_id) {
		super();
		this.star_id = star_id;
		this.coll_name = coll_name;
		this.sci_name = sci_name;
		this.star_mass = star_mass;
		this.spectral_id = spectral_id;
	}


	
	
	//all args - star_id constructor
	public Star(String coll_name, String sci_name, double star_mass, int spectral_id) {
		super();
		this.coll_name = coll_name;
		this.sci_name = sci_name;
		this.star_mass = star_mass;
		this.spectral_id = spectral_id;
	}
	
	


	public Star(double star_mass) {
		super();
		this.star_mass = star_mass;
	}


	@Override
	public String toString() {
		return "Star [star_id=" + star_id + ", coll_name=" + coll_name + ", sci_name=" + sci_name + ", star_mass="
				+ star_mass + ", spectral_id=" + spectral_id + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coll_name == null) ? 0 : coll_name.hashCode());
		result = prime * result + ((sci_name == null) ? 0 : sci_name.hashCode());
		result = prime * result + spectral_id;
		result = prime * result + star_id;
		long temp;
		temp = Double.doubleToLongBits(star_mass);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Star other = (Star) obj;
		if (coll_name == null) {
			if (other.coll_name != null)
				return false;
		} else if (!coll_name.equals(other.coll_name))
			return false;
		if (sci_name == null) {
			if (other.sci_name != null)
				return false;
		} else if (!sci_name.equals(other.sci_name))
			return false;
		if (spectral_id != other.spectral_id)
			return false;
		if (star_id != other.star_id)
			return false;
		if (Double.doubleToLongBits(star_mass) != Double.doubleToLongBits(other.star_mass))
			return false;
		return true;
	}


	public int getStar_id() {
		return star_id;
	}


	public void setStar_id(int star_id) {
		this.star_id = star_id;
	}


	public String getColl_name() {
		return coll_name;
	}


	public void setColl_name(String coll_name) {
		this.coll_name = coll_name;
	}


	public String getSci_name() {
		return sci_name;
	}


	public void setSci_name(String sci_name) {
		this.sci_name = sci_name;
	}


	public double getStar_mass() {
		return star_mass;
	}


	public void setStar_mass(double star_mass) {
		this.star_mass = star_mass;
	}


	public int getSpectral_id() {
		return spectral_id;
	}


	public void setSpectral_id(int spectral_id) {
		this.spectral_id = spectral_id;
	}



	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
