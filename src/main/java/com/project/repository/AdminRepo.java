package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.AdminModel;
@Repository
public interface AdminRepo extends JpaRepository<AdminModel, Integer>{

}
