package com.example.Example4.Controller;

import com.example.Example3.Service.StudentService;
import com.example.Example3.mode.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class EmployeeController {
    @Autowired
    StudentService studentService;

    //
    //http://localhost:8080/employeetdetall
//    @RequestMapping(value = "/employeetdetall",method = RequestMethod.GET)    //(DONE)  GET ALL
//    public ResponseEntity<List<Employee0>> listResponseEntity(){
//        List<Employee0> list = studentService.getAllEmployee();
//        if (list.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(list,HttpStatus.OK);
//    }
    //http://localhost:8080/employeetdetall/name/{name}
//    @RequestMapping(value = "/employeetdetall/name/{name}",method = RequestMethod.GET)    //(DONE)
//    public ResponseEntity<Employee0> findSubjectByName(@PathVariable("name")String name){
//        Employee0 u = (Employee0) studentService.findEmployeeByName(name);
//        return new ResponseEntity<Employee0>(u,HttpStatus.OK);
//    }
    //http://localhost:8080/employeetdetall/{id}
//    @RequestMapping(value = "/employeetdetall/{id}" , method = RequestMethod.GET)     //(DONE)  GET ID
//    public ResponseEntity<Employee0> getStudentByID(@PathVariable("id") long id){
//        Employee0 employee = studentService.getOneEmployee(id);
//        return new ResponseEntity<Employee0>(employee,HttpStatus.OK);
//    }
    //http://localhost:8080/employeetdetall/save
//    @RequestMapping(value = "/employeetdetall/save", method = RequestMethod.POST)    //(DONE)
//    public ResponseEntity<Employee0> saveSubject(@RequestBody Employee0 employee){
//        studentService.saveEmployee(employee);
//        return ResponseEntity.ok(employee);
//    }
    //http://localhost:8080/employeetdetall/update/{id}
//    @RequestMapping(value = "/employeetdetall/update/{id}", method = RequestMethod.POST)  //(DONE)
//    public ResponseEntity<Employee0> updateSubject(@PathVariable("id")long id, @RequestBody Employee0 employee){
//        Employee0 oldSubject = studentService.getOneEmployee(id);
//        if (oldSubject == null){
//            return ResponseEntity.notFound().build();
//        } else {
//            oldSubject.setName(employee.getName());
//            oldSubject.setAddress(employee.getAddress());
//            oldSubject.setCode(employee.getCode());
//            oldSubject.setEmail(employee.getEmail());
//            oldSubject.setPhone(employee.getPhone());
//            oldSubject.setClazzByClassid(employee.getClazzByClassid());
//            studentService.saveEmployee(employee);
//            return ResponseEntity.ok(oldSubject);
//        }
//    }
    //http://localhost:8080/employeetdetall/delete/{id}
//    @RequestMapping(value = "/employeetdetall/delete/{id}", method = RequestMethod.DELETE)   //(DONE)
//    public ResponseEntity<Employee0> deleteStudent(@PathVariable("id") long id){
//        Optional<Employee0> _olderStudent = studentService.findEmployeeById(id);
//        if (_olderStudent == null){
//            return ResponseEntity.notFound().build();
//        } else {
//            studentService.deleteEmployee(id);
//            return ResponseEntity.ok().build();
//        }
//    }
        @RequestMapping(value = "/Student", method = RequestMethod.GET)
    public ResponseEntity<Employee> getStudentByCode(@RequestParam(value = "code", defaultValue = "a1") String code) {
        Employee u = studentService.findStudentByCode(code);
        return new ResponseEntity<Employee>(u, HttpStatus.OK);
    }

    @RequestMapping(value = "/Student/codemail",method = RequestMethod.GET)
    public ResponseEntity<Employee> getStudentByCodeAndEMail(
            @RequestParam(value = "code", defaultValue = "") String code,
            @RequestParam(value = "email", defaultValue = "") String email) {
        Employee u = studentService.findStudentByCodeEmail(code,email);
        return new ResponseEntity<Employee>(u,HttpStatus.OK);
    }

    @RequestMapping(value = "/Student/code/{code}", method = RequestMethod.GET)
    ///Student/code/A01
    public ResponseEntity<Employee> a(
            @RequestParam(value = "code", defaultValue = "") String code,
            @RequestParam(value = "email", defaultValue = "") String email) {
        return null;
    }

    @RequestMapping(value = "/Student/id/{id}", method = RequestMethod.GET)
    ///Student/id/1
    public ResponseEntity<Employee> b(
            @RequestParam(value = "code", defaultValue = "") String id) {
        return null;
    }


}
