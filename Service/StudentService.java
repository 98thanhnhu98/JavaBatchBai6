package com.example.Example4.Service;

import com.example.Example3.mode.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    List<Employee> getAllEmployee();

    List<Employee> getAllStudent(String dir, String field);
    void saveEmployee(Employee employee);
    void deleteEmployee(long id);
    Optional<Employee> findEmployeeById(long id);
    Employee findStudentByCode(String code);
    Employee findEmployeeByName(String name);
    Employee findStudentByCodeEmail(String code, String email);
    Employee getOneEmployee(long id);
}
