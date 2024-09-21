package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.*;

public class QBCEgThreRestriction {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);

		Criterion ctr1=Restrictions.gt("sal",50000);
		Criterion ctr2=Restrictions.eq("desg","ASE");
		//Criterion ctr3=Restrictions.or(ctr1,ctr2);	
		Criterion ctr3=Restrictions.and(ctr1,ctr2);
		criteria.add(ctr3);
		List<Employee> emp=criteria.list();
		emp.forEach(System.out::println);

	}

}
