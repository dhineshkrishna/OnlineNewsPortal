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
import com.project.ServiceImpl.TimeServImpl;
import com.project.model.TimeModel;


/**
 * 
 * @author Dhinesh
 *
 */

@RestController
public class TimeController {
	
	@Autowired
	TimeServImpl times;

	/**
	 * Method used to get all the time details
	 * @return the list
	 */
	@GetMapping("/time_get")
	public List<TimeModel> gettimes(){
		return  times.gettime();
	}

	/**
	 * Method used to post the all attributes
	 * @param timer-this is parameter used to post the attributes in Json format
	 * @return the string "Data posted successfully".
	 */
	@PostMapping("/time_post")
	public String posttimes(@RequestBody TimeModel timer) {
		return  times.posttime(timer);
	}

	/**
	 * Method used to update/edit the all attributes
	 * @param timer-this is parameter used to post the attributes in Json format
	 * @return the string "Data updated successfully".
	 */
	@PutMapping("/time_put")
	public String puttimes(@RequestBody TimeModel timer) {
		if(timer==null) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  times.puttime(timer);
	}

	/**
	 * Method used to delete the object
	 * @param id-this is a parameter used to delete the details
	 * @return the string "Data deleted successfully".
	 */
	@DeleteMapping("/time_delete/{id}")
	public String deletetimes(@PathVariable ("id")int id) {
		if(id==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  times.deletetime(id);
	}
}
