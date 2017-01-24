package com.glarimy.blog.api;



public interface Blog {
	
	
	
	public default   String Create(Createlogin logindetails) throws  BlogException {
		// TODO Auto-generated method stub
		return null;
	}
	public Createlogin  getlogindetails(String email) throws  BlogException;
	

}
