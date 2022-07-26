package com.example.Example4.repository;

import com.example.Example4.mode.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository
        extends JpaRepository<Clazz, Integer> {
    List<Clazz> findByName(String name);

    @Query("SELECT COUNT(c.name) FROM TblClass c")
    long countByName();
}
