package com.example.Example4.Service;

import com.example.Example4.mode.Mark;
import com.example.Example4.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MarkServiceIML implements MarkService{
    @Autowired
    private MarkRepository markRepository;

    @Override
    public List<Mark> getAll() {
        return markRepository.findAll();
    }

    @Override
    public void saveMarks(Mark tblMarks) {
        markRepository.save(tblMarks);
    }

    @Override
    public void deleteMarks(int id) {
        markRepository.deleteById(id);
    }

    @Override
    public Optional<Mark> findMarksById(int id) {
        return markRepository.findById(id);
    }

    @Override
    public Mark getOne(int id) {
        return markRepository.findById(id).get();
    }
}
