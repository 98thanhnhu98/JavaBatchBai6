package com.example.Example4.repository;

import com.example.Example4.mode.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepository extends JpaRepository<Mark,Integer> {
    List<Mark> findByMark(int mark);

//    @Query("SELECT m.mark FROM TblMarks m")
//    long countByMark();

}
