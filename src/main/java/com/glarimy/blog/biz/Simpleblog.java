package com.glarimy.blog.biz;



import com.glarimy.blog.api.Blog;
import com.glarimy.blog.api.BlogException;
import com.glarimy.blog.api.Createlogin;
import com.glarimy.blog.data.DAO;
import com.glarimy.blog.data.JPADAO;

public class Simpleblog implements Blog {
	
	private DAO dao;
	
	public Simpleblog() {
		dao = new JPADAO();
	}
	
	@Override
	public String Create(Createlogin logindetails) throws BlogException {
		if (logindetails == null )
			throw new BlogException();

		Createlogin logindetail = new Createlogin();
		logindetail.setLogindetails(logindetails);
		String email = dao.Create(logindetail);
		return email;
		
	}

  

	@Override
	public Createlogin getlogindetails(String email) throws BlogException {
		Createlogin logindetails = dao.getlogindetails(email);
		if (logindetails == null)
			throw new BlogException();
		return logindetails;
	}


	
	

}
