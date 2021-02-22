package com.dam.DAMHibernate_1a1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Principal {

	public static void main(String[] args) {
		
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		
		Session session = sf.openSession();
		
		
		session.getTransaction().begin();
		
		Coche coche1 = new Coche("4444ABC", "Toyota", "Yaris");
		Conductor c1 = new Conductor("11111111A", "Fulanito", "4324234324", coche1);
		
		session.save(coche1);
		session.save(c1);
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();

	}

}
