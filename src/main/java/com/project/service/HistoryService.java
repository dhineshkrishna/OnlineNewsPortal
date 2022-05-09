package com.project.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.project.model.HistoryModel;

public interface HistoryService {
	public abstract List<HistoryModel> gethistory();
	public abstract String posthistory(HistoryModel history);
	public abstract String puthistory(HistoryModel history);
	public abstract String deletehistory(int id);
	public abstract ResponseEntity<?> savehistory(HistoryModel history,int id);
}
