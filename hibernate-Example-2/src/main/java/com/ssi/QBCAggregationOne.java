package com.ssi;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCAggregationOne {

	public static void main(String[] args) {
		Session session = Utility.getSF().openSession();
		Criteria cr = session.createCriteria(Emp.class);

		Projection proj1 = Projections.sum("sal");
		Projection proj2 = Projections.avg("sal");
  
		ProjectionList pList=Projections.projectionList();
		pList.add(proj1);
		pList.add(proj2);
		
		cr.setProjection(pList);
		
		Object ans[]=(Object[])cr.uniqueResult();
		
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		// finding the sum of salaries

		/*
		 * Projection proj = Projections.avg("sal"); cr.setProjection(proj);
		 * 
		 * Double value = (Double) cr.uniqueResult(); System.out.println(value);
		 * session.close();
		 */
		/*
		 * Projection proj = Projections.sum("sal"); cr.setProjection(proj);
		 * 
		 * Long value = (Long) cr.uniqueResult(); System.out.println(value);
		 * session.close();
		 */
	}

}
