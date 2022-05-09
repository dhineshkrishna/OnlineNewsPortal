package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimeModel {
	@Id
	private int time_id;
	private String in_time;
	private String out_time;
	private String login_duration;
	public int getTime_id() {
		return time_id;
	}
	public void setTime_id(int time_id) {
		this.time_id = time_id;
	}
	public String getIn_time() {
		return in_time;
	}
	public void setIn_time(String in_time) {
		this.in_time = in_time;
	}
	public String getOut_time() {
		return out_time;
	}
	public void setOut_time(String out_time) {
		this.out_time = out_time;
	}
	public String getLogin_duration() {
		return login_duration;
	}
	public void setLogin_duration(String login_duration) {
		this.login_duration = login_duration;
	}	
}
