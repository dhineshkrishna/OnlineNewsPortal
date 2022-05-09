package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.NewsModel;
@Repository
public interface NewsRepo extends JpaRepository<NewsModel, Integer>{

}
