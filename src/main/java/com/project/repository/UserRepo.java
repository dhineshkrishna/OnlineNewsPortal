package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.UserModel;
@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer>{

}
