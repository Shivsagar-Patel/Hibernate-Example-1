package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class QBCPRojection {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		
		Projection proj=Projections.property("ecode");
		cr.setProjection(proj);
		
		List<Integer>codes=cr.list();
		
		for(Integer code:codes)
		{
			System.out.println(code);
		}
		
		/*Projection proj=Projections.property("ename");
		cr.setProjection(proj);
		
		List<String> names=cr.list();
		
		for(String name:names)
		{
			System.out.println(name);
		}*/
		session.close();

	}

}
