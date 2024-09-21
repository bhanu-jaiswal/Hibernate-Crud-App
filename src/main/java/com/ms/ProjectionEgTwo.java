package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ProjectionEgTwo {
	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		//projection on table for id of all employee
		
		Projection proj1=Projections.property("eno" );
		
		criteria.setProjection(proj1);
		
		List<Integer> enos=criteria.list();
		for(Integer eno:enos)
		{
			System.out.println(eno);
		}
		session.close();
	}

}
