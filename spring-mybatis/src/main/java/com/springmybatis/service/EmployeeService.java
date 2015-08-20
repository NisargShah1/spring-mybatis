package com.springmybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmybatis.bean.Employee;
import com.springmybatis.mappper.EmployeeMapper;

@Service
public class EmployeeService {

		@Autowired
		private EmployeeMapper employeeMapper;

		public void insert() throws Exception {
			employeeMapper.insert(new Employee("Nisarg", "Infosys"));
		}
}
