package com.example.Example4.Service;

import com.example.Example4.mode.Clazz;
import com.example.Example4.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClassServiceIML implements ClassService {
    @Autowired
    private ClassRepository classRepository;

    @Override
    public List<Clazz> getAll() {
        return classRepository.findAll();
    }

    @Override
    public void saveClass(Clazz tblClass) {
        classRepository.save(tblClass);
    }

    @Override
    public void deleteSubject(int id) {
        classRepository.deleteById(id);
    }

    @Override
    public Optional<Clazz> findClassById(int id) {
        return classRepository.findById(id);
    }

    @Override
    public Clazz getOne(int id) {
        return classRepository.findById(id).get();
    }

    @Override
    public List<Clazz> findClassByName(String name) {
        return classRepository.findByName(name);
    }

    @Override
    public Long getCountByName() {
        return classRepository.countByName();
    }
}
