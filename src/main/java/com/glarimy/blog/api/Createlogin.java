package com.glarimy.blog.api;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement
public class Createlogin {
	
	protected String  name;
	@Id
	protected char email;
	private Createlogin logindetails;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getEmail() {
		return email;
	}

	public void setEmail(char email) {
		this.email = email;
	}

	public Createlogin(String name, char email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Createlogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setData(Createlogin logindetails) {
		this.setLogindetails(logindetails);
		
	}

	public Createlogin getLogindetails() {
		return logindetails;
	}

	public void setLogindetails(Createlogin logindetails) {
		this.logindetails = logindetails;
	}

}
