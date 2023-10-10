package com.girlscity.employermgrserver.domain.employee.repos;

import com.girlscity.employermgrserver.domain.employee.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
}
