package com.ssi;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;


public class QBCExampleFilteration {

	public static void main(String[] args) {
		//here we fetching all the records using QBC
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Emp.class); //in bracktes we pass the name of our entity class
		//Criterion crt1=Restrictions.gt("sal",50000); //sal>50000
		//Criterion crt1=Restrictions.ge("sal",50000);
		//Criterion crt1=Restrictions.lt("sal",50000);
		//Criterion crt1=Restrictions.le("sal",50000);
		//Criterion crt1=Restrictions.eq("sal",50000);
		//Criterion crt1=Restrictions.like("ename","S%");
//		Criterion crt1=Restrictions.gt("sal",50000);
//		Criterion crt2=Restrictions.lt("sal",50000);
//		Criterion crt3=Restrictions.or(crt1,crt2);
		Criterion crt1=Restrictions.gt("sal",50000);
		Criterion crt2=Restrictions.lt("sal",50000);
		Criterion crt3=Restrictions.and(crt1,crt2);
		cr.add(crt3);
		
        List<Emp>employees=cr.list();
        
        
        for(int i=0;i<employees.size();i++)
        {
        	Emp employe=employees.get(i);
        	System.out.println(employe);
        }
        session.close();
	}

}
