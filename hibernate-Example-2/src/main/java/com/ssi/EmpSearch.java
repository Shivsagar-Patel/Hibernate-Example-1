package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpSearch {

	public static void main(String[] args) {
		//fetching the details of Emp on the basis of its emp no
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		Emp emp=session.get(Emp.class, 111);
		System.out.println(emp);
		emp.setSal(50000);
		session.update(emp);
		System.out.println("Updated Successfully");
//		System.out.println(emp.getEcode());
//		System.out.println(emp.getEname());
//		System.out.println(emp.getSal());
		tr.commit();
		session.close();

	}

}
