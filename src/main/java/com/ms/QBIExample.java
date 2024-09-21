package com.ms;

import org.hibernate.Session;

public class QBIExample {

	public static void main(String[] args) 
	{
		Session session=Utility.getSessionFactory().openSession();
		Employee emp=session.get(Employee.class,2001 );
		if(emp!=null)
		System.out.println(emp);
		else
			System.out.println("invalid code");
		session.close();
		
		
		
	}

}
