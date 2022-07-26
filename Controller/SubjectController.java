package com.example.Example4.Controller;

import com.example.Example3.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @RequestMapping(value = "/countbysem" ,method = RequestMethod.GET)
    public ResponseEntity<List<SubjectCount>> countBySem(){
        List<SubjectCount> ls = subjectService.countBySem();
        return new ResponseEntity<List<SubjectCount>>(ls, HttpStatus.OK);
    }
}
