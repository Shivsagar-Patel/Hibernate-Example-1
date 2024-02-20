package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class QBCExampleOne {

	public static void main(String[] args) {
		//here we fetching all the records using QBC
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Emp.class); //in bracktes we pass the name of our entity class
        List<Emp>employees=cr.list();
        
        for(int i=0;i<employees.size();i++)
        {
        	Emp employe=employees.get(i);
        	System.out.println(employe);
        }
        
        //iterate the list by foreach loop
       /* for(Emp employe :employees)
        {
        	System.out.println(employe);
        }*/
        session.close();
	}

}
