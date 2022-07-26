package com.example.Example4.Controller;

import com.example.Example4.Service.MarkService;
import com.example.Example4.mode.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/mark")
public class MarkController {
    @Autowired
    MarkService markService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Mark>> listAllMarks() {
        List<Mark> list = markService.getAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Mark> saveMark(@RequestBody Mark marks) {
        markService.saveMarks(marks);
        return ResponseEntity.ok(marks);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Mark> findById(@PathVariable("id") int id) {
        Mark marks = markService.getOne(id);
        return new ResponseEntity<>(marks, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Mark> updateMark(@PathVariable("id") int id,
                                               @RequestBody Mark marks) {
        Mark oldMarks = markService.getOne(id);
        if (oldMarks == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldMarks.setMark(marks.getMark());
            oldMarks.setNote(marks.getNote());
            return ResponseEntity.ok(oldMarks);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Mark> deleteMark(@PathVariable("id") int id) {
        Optional<Mark> marks = markService.findMarksById(id);
        if (marks == null) {
            return ResponseEntity.notFound().build();
        } else {
            markService.deleteMarks(id);
            return ResponseEntity.ok().build();
        }
    }
}
