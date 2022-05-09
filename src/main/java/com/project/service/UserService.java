package com.project.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.project.model.UserModel;

public interface UserService {
	public abstract List<UserModel> getuser();
	public abstract String postuser(UserModel user);
	public abstract String putuser(UserModel user);
	public abstract String deleteuser(int id);
	public abstract ResponseEntity<?> saveuser(UserModel user,int id);
}
