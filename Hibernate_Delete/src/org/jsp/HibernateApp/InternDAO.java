package org.jsp.HibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InternDAO {

	public static void main(String[] args) {

		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();

		Transaction txc = session.beginTransaction();
		Intern intern = (Intern) session.get(Intern.class, 3);
		session.delete(intern);
		txc.commit();

		session.close();
	}
}
