package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCProjectionExampleTwo {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		
		//projecting ecode,ename
	 Projection proj1=Projections.property("ecode");
	 Projection proj2=Projections.property("ename");
	ProjectionList pList= Projections.projectionList();
	pList.add(proj1);
	pList.add(proj2);
	
	cr.setProjection(pList);
	
	List<Object[]>info=cr.list();
	
	for(Object data[]:info)
	{
		for(Object element:data)
		{
			System.out.println(element);
		}
		System.out.println("----------------------------");
	}
		
		session.close();
	}

}
