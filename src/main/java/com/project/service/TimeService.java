package com.project.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.project.model.TimeModel;


public interface TimeService {
	public abstract List<TimeModel> gettime();
	public abstract String posttime(TimeModel timer);
	public abstract String puttime(TimeModel timer);
	public abstract String deletetime(int id);
	public abstract ResponseEntity<?> savetime(TimeModel timer,int id);
}
