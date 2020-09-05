package com.khan;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khan.Entity.Address;
import com.khan.Entity.Teacher;


public class MyApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();

		System.out.println("Enter Email");
		String email = sc.nextLine();

		System.out.println("Enter City");
		String city = sc.nextLine();

		System.out.println("Enter Pincode");
		String pincode = sc.nextLine();
		
		Address address = new Address();
		address.setCity(city);
		address.setPincode(pincode);
		
		Teacher teacher=new Teacher();
		teacher.setName(name);
		teacher.setEmail(email);
		teacher.setAddress(address);
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(teacher);
		txn.commit();
		session.close();
		factory.close();
		
		System.out.println("Data save successfully");

	}

}
