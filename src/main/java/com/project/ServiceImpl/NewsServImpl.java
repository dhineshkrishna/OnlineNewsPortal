package com.project.ServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.model.NewsModel;
import com.project.repository.NewsRepo;
import com.project.service.NewsService;

@Service
public class NewsServImpl implements NewsService{
	
	@Autowired
	NewsRepo newsrepository;

	@Override
	public List<NewsModel> getnews() {
		List<NewsModel> list=newsrepository.findAll();
		return list;
	}

	@Override
	public String postnews(NewsModel news) {
		newsrepository.save(news);
		return "posted";
	}

	@Override
	public String putnews(NewsModel news) {
		newsrepository.save(news);
		return "putted";
	}

	@Override
	public String deletenews(int id) {
		newsrepository.deleteById(id);
		return "deleted";
	}

	@Override
	public ResponseEntity<?> savenews(NewsModel news, int id) {
		newsrepository.save(news);
		return ResponseEntity.ok("resource saved");
	}
}
