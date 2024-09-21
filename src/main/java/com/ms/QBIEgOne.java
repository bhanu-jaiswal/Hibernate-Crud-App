package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class QBIEgOne {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
	
		List<Employee> emp=criteria.list();// select *from employee;
		emp.forEach(System.out::println);
		session.close();
	}

}
