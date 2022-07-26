package com.example.Example4.Service;

import com.example.Example3.Service.StudentService;
import com.example.Example3.mode.Employee;
import com.example.Example3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class StudentServiceIML implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return studentRepository.findAll(Sort.by(Sort.Direction.ASC, "code", "name"));
    }

    @Override
    public List<Employee> getAllStudent(String dir, String field) {
        List<Employee> lsStudent = null;
        if(dir.equals("ASC")) {
            studentRepository.findAll(Sort.by(Sort.Direction.ASC, field));
        } else {
            studentRepository.findAll(Sort.by(Sort.Direction.DESC, field));
        }

        return lsStudent;
    }

    @Override
    public void saveEmployee(Employee employee) {
        studentRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Optional<Employee> findEmployeeById(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Employee findStudentByCode(String code) {
        return studentRepository.findByCode(code);
    }

    @Override
    public Employee findEmployeeByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Employee findStudentByCodeEmail(String code, String email) {
        return studentRepository.findByCodeAndEmail(code,email);
    }

    @Override
    public Employee getOneEmployee(long id) {
        return studentRepository.findById(id).get();
    }
}
