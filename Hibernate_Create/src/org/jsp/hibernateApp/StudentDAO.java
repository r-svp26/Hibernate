package org.jsp.hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAO {

	public static void main(String[] args) {

		Student student = new Student();
		student.setName("Krishna");
		student.setAddress("Gokul");

		Configuration conf = new Configuration().configure();;
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();

		Transaction txc = session.beginTransaction();
		session.save(student);
		txc.commit();

		session.close();
		
	}
}
