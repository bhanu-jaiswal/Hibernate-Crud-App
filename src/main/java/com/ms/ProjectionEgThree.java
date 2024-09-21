package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionEgThree {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		//projection on table for id of all employee
		
		Projection proj1=Projections.property("name" );
		Projection proj2=Projections.property("sal" );
		ProjectionList pList=Projections.projectionList();
		
		pList.add(proj1);
		pList.add(proj2);
		
		criteria.setProjection(pList);
		
		
		List<Object[]> list=criteria.list();
		for(Object o[]:list)
		{
			for(Object e:o)
			{
			System.out.println(e);
			}
			System.out.println("--------------");
		}
		session.close();
	}

}
