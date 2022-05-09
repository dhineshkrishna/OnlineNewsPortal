package com.project.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.model.HistoryModel;
import com.project.repository.HistoryRepo;
import com.project.service.HistoryService;

@Service
public class HistoryServImpl implements HistoryService{
	@Autowired
	HistoryRepo reposit;
	@Override
	public List<HistoryModel> gethistory() {
		List<HistoryModel> list=reposit.findAll();
		return list;
	}

	@Override
	public String posthistory(HistoryModel history) {
		reposit.save(history);
		return "posted";
	}

	@Override
	public String puthistory(HistoryModel history) {
		reposit.save(history);
		return "putted";
	}

	@Override
	public String deletehistory(int id) {
		reposit.deleteById(id);
		return "deleted";
	}

	@Override
	public ResponseEntity<?> savehistory(HistoryModel history, int id) {
		reposit.save(history);
		return ResponseEntity.ok("resource saved");
	}

}
