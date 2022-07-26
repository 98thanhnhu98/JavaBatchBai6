package com.example.Example4.Service;


import com.example.Example4.dto.SubjectCount;
import com.example.Example4.repository.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceIML implements SubjectService {
    @Autowired
    SubjectsRepository subjectsRepository;
    @Override
    public List<SubjectCount> countBySem() {
        return subjectsRepository.countBySem();
    }
}
