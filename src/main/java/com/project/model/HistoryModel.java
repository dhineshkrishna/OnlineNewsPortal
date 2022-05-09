package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HistoryModel {
	@Id
	private int history_id;
	private String most_viewed;
	private String most_liked;
	private String recent_viewed;
	private String high_suration;
	public int getHistory_id() {
		return history_id;
	}
	public void setHistory_id(int history_id) {
		this.history_id = history_id;
	}
	public String getMost_viewed() {
		return most_viewed;
	}
	public void setMost_viewed(String most_viewed) {
		this.most_viewed = most_viewed;
	}
	public String getMost_liked() {
		return most_liked;
	}
	public void setMost_liked(String most_liked) {
		this.most_liked = most_liked;
	}
	public String getRecent_viewed() {
		return recent_viewed;
	}
	public void setRecent_viewed(String recent_viewed) {
		this.recent_viewed = recent_viewed;
	}
	public String getHigh_suration() {
		return high_suration;
	}
	public void setHigh_suration(String high_suration) {
		this.high_suration = high_suration;
	}
	
}
