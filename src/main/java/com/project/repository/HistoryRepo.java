package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.HistoryModel;
@Repository
public interface HistoryRepo extends JpaRepository<HistoryModel, Integer>{

}
