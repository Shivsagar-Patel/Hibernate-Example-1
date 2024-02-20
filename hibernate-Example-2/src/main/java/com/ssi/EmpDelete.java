package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpDelete {
	public static void main(String args[])
	{
		//delete the record using hibernate methods
		Emp emp=new Emp(113);
		
		
		Session session=Utility.getSF().openSession();
		
		Transaction tr=session.beginTransaction();
		session.delete(emp);
		
		tr.commit();
		session .close();
		System.out.println("One record will be deleted.................");
	}

}
