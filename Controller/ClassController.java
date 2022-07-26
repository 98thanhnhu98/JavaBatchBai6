package com.example.Example4.Controller;

import com.example.Example4.Service.ClassService;
import com.example.Example4.mode.Clazz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/class")
public class ClassController {

    @Autowired
    ClassService classService;

    //http://localhost:8080/class/getAll
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Clazz>> listAll() {
        List<Clazz> list = classService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }

    //http://localhost:8080/class/save
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Clazz> saveClass(@RequestBody Clazz tblClass) {
        classService.saveClass(tblClass);
        return ResponseEntity.ok(tblClass);
    }

    //http://localhost:8080/class/1
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Clazz> findById(@PathVariable("id") int id) {
        Clazz tblClass = classService.getOne(id);
        return new ResponseEntity<>(tblClass, HttpStatus.OK);
    }

    //http://localhost:8080/class/1
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Clazz> updateClass(@PathVariable("id") int id,
                                                @RequestBody Clazz tblClass) {
        Clazz oldClass = classService.getOne(id);
        if (oldClass == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldClass.setName(tblClass.getName());
            oldClass.setNote(tblClass.getNote());
            classService.saveClass(oldClass);
            return ResponseEntity.ok(oldClass);
        }
    }

    //http://localhost:8080/class/1
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Clazz> deleteClass(@PathVariable("id") int id) {
        Optional<Clazz> tblClass = classService.findClassById(id);
        if (tblClass == null) {
            return ResponseEntity.notFound().build();
        } else {
            classService.deleteSubject(id);
            return ResponseEntity.ok().build();
        }
    }

    //http://localhost:8080/class/?name=
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Clazz>> findByName(@RequestParam String name) {
        return new ResponseEntity<>(classService.findClassByName(name), HttpStatus.OK);
    }

    //http://localhost:8080/class/count
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public ResponseEntity<Clazz> countById(){
        Long tblClass = classService.getCountByName();
        return new ResponseEntity(tblClass, HttpStatus.OK);
    }
}
