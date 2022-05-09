package com.project.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.ServiceImpl.HistoryServImpl;
import com.project.model.HistoryModel;


/**
 * 
 * @author Dhinesh
 *
 */

@RestController
public class HistoryController {
	
	@Autowired
	HistoryServImpl historyy;

	/**
	 * Method get the all user details
	 * @return the list
	 */
	@GetMapping("/history_get")
	public List<HistoryModel> gethistories(){
		return  historyy.gethistory();
	}

	/**
	 * Method to pass all attributes in Json format
	 * @param history-this is the parameter to post method
	 * @return the string "Data posted succesfully"
	 */
	@PostMapping("/history_post")
	public String posthistories(@RequestBody HistoryModel history) {
		return  historyy.posthistory(history);
	}

	/**
	 * Method used to update/edit the history details
	 * @param history-this is the parameter to post method
	 * @return the string "Data updated succesfully".
	 */
	@PutMapping("/history_put")
	public String puthistories(@RequestBody HistoryModel history) {
		if(history==null) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  historyy.puthistory(history);
	}

	/***
	 * Method used to delete the history details
	 * @param id-this is parameter to delete the particular object
	 * @return the string "Data deleted succesfully".
	 */
	@DeleteMapping("/history_delete/{id}")
	public String deletehistories(@PathVariable ("id")int id) {
		if(id==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  historyy.deletehistory(id);
	}
}
