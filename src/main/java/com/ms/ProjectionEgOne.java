package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ProjectionEgOne {
	public static void main(String []arg) 
	{
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		//projection on table
		
		Projection proj1=Projections.property("name" );
		
		criteria.setProjection(proj1);
		
		List<String> names=criteria.list();
		for(String name:names)
		{
			System.out.println(name);
		}
		session.close();
	}
}
