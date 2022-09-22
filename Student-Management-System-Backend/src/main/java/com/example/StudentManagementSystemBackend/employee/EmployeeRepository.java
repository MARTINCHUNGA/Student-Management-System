package com.example.StudentManagementSystemBackend.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("Employee")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
