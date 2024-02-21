package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLExampleTwo {

	public static void main(String[] args) {
		//fetching the ename,sal using HQL
		
		String hql="select ename,sal from Emp"; // we provide the name of an entity class
		
		Session session=Utility.getSF().openSession();
		
		//to run an hql we need query object
		Query query=session.createQuery(hql);
        List<Object[]> emps=query.list();
        
        for(Object emp[]:emps)
        {
        	for(Object info:emp)
        	System.out.println(info);
        	
        	System.out.println("----------------------------------");
        }
        session.close();
	}

}
