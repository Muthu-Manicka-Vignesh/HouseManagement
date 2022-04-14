package com.myprogramming.SpringBootApplication.Records;

import com.myprogramming.SpringBootApplication.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Records extends JpaRepository<House, Integer> {
    public List<House> findByType(String type);
}
