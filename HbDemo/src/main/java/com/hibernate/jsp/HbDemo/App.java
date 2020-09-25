package com.hibernate.jsp.HbDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId(8);
		s1.setName("Rama Krishna");
		s1.setLoc("Patna");
		
		int id = s1.getId();
		String name = s1.getName();
		String loc=s1.getLoc();

		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);

		@SuppressWarnings("deprecation")
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();

		Transaction txc = session.beginTransaction();
		session.save(s1);
		txc.commit();
		
		System.out.println("Employee ID="+id+" Name="+name+" Location="+loc);
		System.out.println("Data Fetched Successfully");

	}
}
