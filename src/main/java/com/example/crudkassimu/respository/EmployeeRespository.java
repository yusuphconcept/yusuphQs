package com.example.crudkassimu.respository;

import com.example.crudkassimu.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee, Long> {
    //all crud database methods
}