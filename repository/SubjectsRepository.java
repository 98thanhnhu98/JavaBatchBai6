package com.example.Example4.repository;

import com.example.Example3.mode.Subject;
import com.example.Example4.mode.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SubjectsRepository extends JpaRepository<Subject,Long> {
    @Query("SELECT new com.example.Example3.dto.SubjectCount(s.sem , count(s.name)) from Subject s group by s.sem")
    List<SubjectCount> countBySem();
}
