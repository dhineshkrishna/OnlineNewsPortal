package com.project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.ServiceImpl.UserServImpl;
import com.project.model.UserModel;


/**
 * 
 * @author Dhinesh
 *
 */

@RestController
public class UserController {

	@Autowired
	UserServImpl users;

	/**
	 * Method used to get all the user details
	 * @return the list
	 */
	@GetMapping("/user_get")
	public List<UserModel> getusers(){
		return  users.getuser();
	}

	/**
	 * Method used to post the user details
	 * @param user -this is a parameter used to post the details in the form of Json
	 * @return the string "Data posted successfully".
	 */
	@PostMapping("/user_post")
	public String postusers(@RequestBody UserModel user) {
		return  users.postuser(user);
	}

	/**
	  * Method used to update/edit the user details
	 * @param user -this is a parameter used to post the details in the form of Json
	 * @return the string "Data updated successfully".
	 */
	@PutMapping("/user_put")
	public String putusers(@RequestBody UserModel user) {
		if(user.getUser_name()==null) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  users.putuser(user);
	}

	/**
	 * Method used to delete the object
	 * @param id-this is a parameter used to delete the details
	 * @return the string "Data deleted successfully".
	 */
	@DeleteMapping("/user_delete/{user_id}")
	public String deleteusers(@PathVariable ("user_id")int user_id) {
		if(user_id==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  users.deleteuser(user_id);
	}
}
