package com.kishoreb.dao;

import java.util.List;

import com.kishoreb.dto.Employee;

public interface Dao {
public int updateData(Employee emp);
public int deleteData(Employee emp);
public List<Employee>getAllData();
public int addData(Employee emp);
public Employee getData(int id);
}
