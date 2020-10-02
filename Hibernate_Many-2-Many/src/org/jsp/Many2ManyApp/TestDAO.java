package org.jsp.Many2ManyApp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDAO {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();

		Transaction txc = session.beginTransaction();
		Course c1 = new Course();
		c1.setName("Java");

		Course c2 = new Course();
		c1.setName("J2EE");

		Course c3 = new Course();
		c1.setName("Framework");

		Student s1 = new Student();
		s1.setName("Ritesh Yadav");

		Student s2 = new Student();
		s2.setName("Shyama Yadav");

		Student s3 = new Student();
		s3.setName("Radhika Maman");

		/* ADD ALL COURSES OBJECT INTO ARRAYLIST */
		List<Course> course = new ArrayList<Course>();
		course.add(c1);
		course.add(c2);
		course.add(c3);

		/* ADD ALL STUDENT OBJECT INTO ARRAYLIST */
		List<Student> student = new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);

		/* EACH STUDENT OBJECT CONTAINS LIST OF COURSES */
		s1.setCourses(course);
		s2.setCourses(course);
		s3.setCourses(course);

		session.save(s1);
		session.save(s2);
		session.save(s3);
		txc.commit();

		session.close();
	}
}
