package com.project.ServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.model.TimeModel;
import com.project.repository.TimeRepo;
import com.project.service.TimeService;

@Service
public class TimeServImpl implements TimeService{
	
	@Autowired
	TimeRepo timerepository;
	
	@Override
	public List<TimeModel> gettime() {
		List<TimeModel> list=timerepository.findAll();
		return list;
	}

	@Override
	public String posttime(TimeModel timer) {
		timerepository.save(timer);
		return "posted";
	}

	@Override
	public String puttime(TimeModel timer) {
		timerepository.save(timer);
		return "putted";
	}

	@Override
	public String deletetime(int id) {
		timerepository.deleteById(id);
		return "deleted";
	}

	@Override
	public ResponseEntity<?> savetime(TimeModel timer, int id) {
		timerepository.save(timer);
		return ResponseEntity.ok("resource saved");
	}
}
