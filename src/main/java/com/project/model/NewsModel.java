package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewsModel {
	@Id
	private int news_id;
	private String sports;
	private String politics;
	private String spirtual;
	private String employment;
	private String natinaol_news;
	public int getNews_id() {
		return news_id;
	}
	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	public String getPolitics() {
		return politics;
	}
	public void setPolitics(String politics) {
		this.politics = politics;
	}
	public String getSpirtual() {
		return spirtual;
	}
	public void setSpirtual(String spirtual) {
		this.spirtual = spirtual;
	}
	public String getEmployment() {
		return employment;
	}
	public void setEmployment(String employment) {
		this.employment = employment;
	}
	public String getNatinaol_news() {
		return natinaol_news;
	}
	public void setNatinaol_news(String natinaol_news) {
		this.natinaol_news = natinaol_news;
	}
	
}
