package com.ms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		Employee e1=new Employee(1001,"Amit","SDE",125000);
		Employee e2=new Employee(2001,"Mohit","ASE",12000);
		Employee e3=new Employee(3001,"Poonam","ASE",40000);
		Employee e4=new Employee(4001,"Punaksh","Adv",50000);
		Employee e5=new Employee(5001,"Aashutosh","VE",45000);
		Employee e6=new Employee(6001,"Bhanu","SDE",25000);
		
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(e6);
		
		tr.commit();
		session.close();
		
		System.out.println("Data Store Successfullly...........");
		
	}

}
