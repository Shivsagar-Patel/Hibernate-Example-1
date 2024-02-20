package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCGrouping {

	public static void main(String[] args) {
		Session session = Utility.getSF().openSession();
		Criteria cr = session.createCriteria(Emp.class);

		Projection proj1 = Projections.groupProperty("desig");
		Projection proj2 = Projections.sum("sal");
		Projection proj3 = Projections.avg("sal");
		Projection proj4 = Projections.max("sal");
		Projection proj5 = Projections.min("sal");
		
		ProjectionList pList=Projections.projectionList();
		
		pList.add(proj1);
		pList.add(proj2);
		pList.add(proj3);
		pList.add(proj4);
		pList.add(proj5);
		
		cr.setProjection(pList);
		
		List<Object[]> info=cr.list();
		
		for(Object data[]:info)
		{
			for(Object ele:data)
			{
				System.out.println(ele);
			}
			System.out.println("_____________________________________________________");
		}
		session.close();
	}

}
