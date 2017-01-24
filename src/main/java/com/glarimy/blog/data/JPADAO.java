package com.glarimy.blog.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.glarimy.blog.api.Createlogin;

public class JPADAO implements DAO {
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("Blog");

	@Override
	public String Create(Createlogin logindetails) {
		
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(logindetails);
		em.getTransaction().commit();
		em.close();
		return logindetails.getName();
	}

	

	@Override
	public Createlogin getlogindetails(String email) {
		EntityManager em = factory.createEntityManager();
		Createlogin logindetails = em.find(Createlogin.class, email);
		em.close();
		return logindetails;
	}
	}


