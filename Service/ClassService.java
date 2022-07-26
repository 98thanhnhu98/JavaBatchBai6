package com.example.Example4.Service;

import com.example.Example4.mode.Clazz;

import java.util.List;
import java.util.Optional;

public interface ClassService {
    List<Clazz> getAll();

    void saveClass(Clazz tblClass);

    void deleteSubject(int id);

    Optional<Clazz> findClassById(int id);

    Clazz getOne(int id);

    List<Clazz> findClassByName(String name);

    Long getCountByName();
}
