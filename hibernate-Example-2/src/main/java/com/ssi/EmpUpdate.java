package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpUpdate {

	public static void main(String[] args) {
		//we need to update the salary of employee using hibernate methods
		
		Emp emp=new Emp();
		emp.setEcode(113);   //id of the record which we need to be changed
		emp.setSal(750000);  //the new salary
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.update(emp);   //hibernate will generate an update command and will run it
		tr.commit();
		session.close();
		System.out.println("Record Updated Successfully....................");

	}

}
