package com.kishoreb.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.kishoreb.dto.Employee;
import com.kishoreb.singleton.SessionTemplate;

public class Dao_class implements Dao {

	@Override
	public int updateData(Employee emp) {
		// TODO Auto-generated method stub
		SessionFactory ses_fac=SessionTemplate.getSessionTemplate();
		Session ses=ses_fac.openSession();
		emp.setName("Rohan");
		ses.beginTransaction();
		ses.update(emp);
		ses.getTransaction().commit();
			//ses.close();
		
		return 0;
	}
	

	@Override
	public int deleteData(Employee emp) {
		// TODO Auto-generated method stub
		SessionFactory ses_fac=SessionTemplate.getSessionTemplate();
		Session ses=ses_fac.openSession();
		ses.beginTransaction();
		ses.delete(emp);
		ses.getTransaction().commit();
		ses.close();
	
		return 0;
	}

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addData(Employee emp) {
		// TODO Auto-generated method stub
		SessionFactory ses_fac=SessionTemplate.getSessionTemplate();
		Session ses=ses_fac.openSession();
		ses.beginTransaction();
		ses.save(emp);
		ses.getTransaction().commit();
		ses.close();
	
		return 0;
	}


	@Override
	public Employee getData(int id) {
		// TODO Auto-generated method stub
		SessionFactory ses_fac=SessionTemplate.getSessionTemplate();
		Session ses=ses_fac.openSession();
		Employee emplo=ses.get(Employee.class, id);
		return emplo;
	}

}
