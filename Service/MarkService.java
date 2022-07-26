package com.example.Example4.Service;

import com.example.Example4.mode.Mark;

import java.util.List;
import java.util.Optional;

public interface MarkService {
    List<Mark> getAll();

    void saveMarks(Mark tblMarks);

    void deleteMarks(int id);

    Optional<Mark> findMarksById(int id);

    Mark getOne(int id);
}
