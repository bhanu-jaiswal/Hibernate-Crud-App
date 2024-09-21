package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class QBCEgTwoOrdering 
{
	public static void main(String[] args) 
	{
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		Order order1=Order.asc("sal");
		criteria.addOrder(order1);

		Order order2=Order.asc("desg");
		criteria.addOrder(order2);
		
		List<Employee> emp=criteria.list();
		emp.forEach(System.out::println);
	}

}
