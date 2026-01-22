package com.emp.leavemanagement.dao;

import com.emp.leavemanagement.config.DBConfig;
import com.emp.leavemanagement.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;

/* Handel employee database operations */

public class EmployeeDAO {
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employee (name, email, role) VALUES (?,?,?)";

        try (Connection conn = DBConfig.getConnection();
        // Prevent Injection Sql
             PreparedStatement ps = conn.prepareStatement(sql)) {

                ps.setString(1, employee.getName());
                ps.setString(2, employee.getEmail());
                ps.setString(3, employee.getRole());

                ps.executeUpdate();
                System.out.println("Employee Added Successfully");
             } catch (Exception e) {
                e.printStackTrace();
             }
    }
}
