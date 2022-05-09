package com.project.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.ServiceImpl.AdminServImpl;
import com.project.model.AdminModel;


/**
 * 
 * @author Dhinesh
 * @version 29-04-2022
 *
 */

@RestController
public class AdminController {
	
	@Autowired
	AdminServImpl admin;

	/**
	 * Method get the all user details
	 * @return the list
	 */
	@GetMapping("/admin_get")
	public List<AdminModel> getusers(){
		return admin.getvalue();
	}

	/**
	 * Method to pass all attributes in Json format
	 * @param admins-this is the parameter to post method
	 * @return the string "Data posted succesfully"
	 */
	@PostMapping("/admin_post")
	public String postusers(@RequestBody AdminModel admins) {
		return admin.postadmin(admins);
	}

	/**
	 * Method used to update/edit the admin details
	 * @param admins- this is the parameter to put method
	 * @return the string "Data updated succesfully"
	 */
	@PutMapping("/admin_put")
	public String putusers(@RequestBody AdminModel admins) {
		if(admins.getAdmin_id()==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return admin.putadmin(admins);
	}

	/**
	 * Method used to delete the admin details.
	 * @param admin_id-this is the parameter to delete the object.
	 * @return the string "Data deleted succesfully".
	 */
	@DeleteMapping("/admin_delete/{admin_id}")
	public String deleteusers(@PathVariable ("admin_id")int admin_id) {
		if(admin_id==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return admin.deleteadmin(admin_id);
	}

	/**
     * Method used to get the AdminModel details
     * @param admin_id- this is parameter to get the particular object
     * @return AdminModel as Object
     */
	@PostMapping("/admin_postbyid/{admin_id}")
    public Optional<AdminModel> post(@PathVariable ("admin_id") int admin_id){
    	return admin.findById(admin_id);
    }
}

