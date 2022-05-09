package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.TimeModel;
@Repository
public interface TimeRepo extends JpaRepository<TimeModel, Integer>{

}
