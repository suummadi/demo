package com.glarimy.blog.data;

import com.glarimy.blog.api.Createlogin;

public interface DAO {
	
	String Create(Createlogin logindetails);
	Createlogin getlogindetails(String email); 
	

}
