package com.project.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.project.model.NewsModel;

public interface NewsService {
	public abstract List<NewsModel> getnews();
	public abstract String postnews(NewsModel news);
	public abstract String putnews(NewsModel news);
	public abstract String deletenews(int id);
	public abstract ResponseEntity<?> savenews(NewsModel news,int id);
}
