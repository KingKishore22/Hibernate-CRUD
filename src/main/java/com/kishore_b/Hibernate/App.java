package com.kishore_b.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kishoreb.dao.Dao_class;
import com.kishoreb.dto.Employee;
import com.kishoreb.singleton.SessionTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        Employee emp=new Employee();
        emp.setName("Geetha");
        emp.setRole("Developer");
        
    	/* Configuration config=new Configuration();
		config.configure("config.cfg.xml");
		config.addAnnotatedClass(Employee.class);
		SessionFactory fact=SessionTemplate.getSessionTemplate();
		fact=config.buildSessionFactory();
		Session ses=fact.openSession();
       ses.beginTransaction();
        ses.save(emp);
        ses.getTransaction().commit();
        ses.close();*/
        Dao_class data=new Dao_class();
        //data.addData(emp);
       Employee em=data.getData(7);
        //data.deleteData(em);
       data.updateData(em);
       //emp.setName("Kumar");
       //System.out.println(emp.getName());
        
    }
}
