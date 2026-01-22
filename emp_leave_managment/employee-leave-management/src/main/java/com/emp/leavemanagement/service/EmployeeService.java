package com.emp.leavemanagement.service;

import com.emp.leavemanagement.dao.EmployeeDAO;
import com.emp.leavemanagement.model.Employee;

/* Handels employee business logic */
public class EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    public void registerEmployee(String name, String email, String role) {
        Employee employee = new Employee(name, email, role);
        employeeDAO.addEmployee(employee);
    }
}
