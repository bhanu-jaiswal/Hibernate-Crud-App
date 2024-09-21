package com.ms;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCEgFour 
{
	public static void main(String[] args) 
	{
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		//Filteration
		//Criterion ctr1=Restrictions.between("sal",100000,200000 );
		//criteria.add(Restrictions.like("name","a%"));
		criteria.add(Restrictions.in("desg", "ASE","SE"));
		
		List<Employee> emp=criteria.list();
		emp.forEach(System.out::println);

	}

}
