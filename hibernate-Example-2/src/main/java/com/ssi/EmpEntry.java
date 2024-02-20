package com.ssi;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class EmpEntry {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter code :");
		int code=sc.nextInt();
		System.out.println("Enter Ename :");
		String name=sc.next();
		System.out.println("Enter Salary :");
		int sal=sc.nextInt();

		
		Emp emp=new Emp(code,name,sal);*/
		
//		SessionFactory sf=Utility.getSF();
//		Session session=sf.openSession();
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(new Emp(1001,"Manish",40000,"SE"));
		session.save(new Emp(1150,"Sagar",30000,"TL"));
		session.save(new Emp(1002,"Abhi",20000,"TL"));
		session.save(new Emp(1243,"Tarun",80000,"SE"));
		session.save(new Emp(1213,"Aakash",60000,"SE"));
		session.save(new Emp(1103,"Vishal",50000,"PM"));
		session.save(new Emp(103,"Rahul",90000,"PM"));
		tr.commit();
		session.close();
		System.out.println("Record Inserted Successfully.........................");
	}

}
