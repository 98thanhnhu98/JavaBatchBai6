package com.example.Example4.repository;

import com.example.Example3.mode.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Employee,Long> {
    Employee findByCode(String code);
    Employee findByCodeAndEmail(String code, String email);

    List<Employee> findAllByOrderByCodeAsc();

    @Query("Select u from Employee0 u where u.code = ?1 and u.email = ?2")
    Employee findByCodeEmail(String code, String email); //select ... from ... where code_email = ?

    //JSQL
    @Query("select u from Employee0 u where u.name = :name")
    Employee findByName(@Param("name") String name);
}
