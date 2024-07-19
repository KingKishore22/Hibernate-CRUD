package com.kishoreb.singleton;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.kishoreb.dto.Employee;

public class SessionTemplate {
	static SessionFactory fact=null;
	static Configuration config=null;
	public static SessionFactory getSessionTemplate() {
		if(config==null) {
			config=new Configuration();
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(Employee.class);
			fact=config.buildSessionFactory();
			
		}
		return fact;
	}

}
