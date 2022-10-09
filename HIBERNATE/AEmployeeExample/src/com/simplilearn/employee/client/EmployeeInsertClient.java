package com.simplilearn.employee.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.simplilearn.employee.Employee;

public class EmployeeInsertClient {

	public static void main(String[] args) {

		System.out.println("********** START-CustomerClient**************");
		
		SessionFactory factory = null;
		Transaction tx = null;
		Session session = null;
		try {
			
			//1. Create the Configuration Object
			AnnotationConfiguration acfg= new AnnotationConfiguration();
			System.out.println("----------1. Create the Configuration Object----------");
			
			//2. Call the Configure Method
			acfg=(AnnotationConfiguration) acfg.configure();
			System.out.println("----------2. Call the Configure Method----------");
			
			//3. Through the Configuration Object Call the Build Session Factory
			factory = acfg.buildSessionFactory();
			System.out.println("----------3. Through the Configuration Object Call the Build Session Factory----------");
			
			//4. With the help of factory object open the session
			session= factory.openSession();
			System.out.println("----------4. With the help of factory object open the session----------");
			
			//5. With the Help of Session object call the begin transaction
			tx = session.beginTransaction();
			System.out.println("----------5. With the Help of Session object call the begin transaction----------");
			
			//6. Prepare the Business Object
			System.out.println("----------6. Prepare the Business Object----------");
			Employee emp = new Employee("Athira", "athira@simplilearn.com", "University Plaza, Cape Girardeau, United States", 9999, "Director");
			
			//Employee emp = new Employee("Strahinja", "strahinja@simplilearn.com", "Cape Girardeau, UK", 8888, "Ass. Director");
			
			//7. Save the Data
			// Provide the Business Object to the Session
			session.save(emp);
			System.out.println("----------7. Save the Data----------");
			
			//8. Commit in to DB
			tx.commit();
			System.out.println("----------8. Commit in to DB----------");
			
		} catch (Exception e) {

			e.printStackTrace();
			System.err.println("#### Error Occured while Inserting the data");
		}
		
		//9. Close the Resource
		session.close();
		factory.close();
		System.out.println("----------9. Close the Resource----------");
		
		System.out.println("********** END-CustomerClient**************");
	

	
	}
}
