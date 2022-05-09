package com.project.ServiceImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.model.AdminModel;
import com.project.repository.AdminRepo;
import com.project.service.AdminService;

/**
 * 
 * @author Dhinesh
 * @version 29-04-2022
 *
 */
@Service
public class AdminServImpl implements AdminService{

	@Autowired
	AdminRepo reposit;
    
	/***
     * Method used to retrieve the data 
     * @return the list
     */
	@Override
	public List<AdminModel> getvalue() {
		List<AdminModel> list=reposit.findAll();
		return list;
	}
    
	/**
	 * Method used to post the data
	 * @param admins-this is a parameter to post the data in Json format 
	 * @return "posted".
	 */
	@Override
	public String postadmin(AdminModel admins) {
		if(admins.getAdmin_id()==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		reposit.save(admins);
		return "posted";
	}

	/**
	 * Method used to edit the data
	 * @param admins-this is a parameter to update the data in Json format 
	 * @return "putted".
	 */
	@Override
	public String putadmin(AdminModel admins) {
		reposit.save(admins);
		return "putted";
	}
    
	/**
	 * Method used to delete the data
	 * @param id-this is a parameter to update the data in Json format 
	 * @return "Deleted".
	 */
	@Override
	public String deleteadmin(int id) {
		reposit.deleteById(id);
		return "deleted";
	}
    
	/**
	 * Method used to get the data
	 * @param id-this is a parameter to retrieve the data in Json format 
	 * @return the object
	 */
	public Optional<AdminModel> findById(int id) {
		return reposit.findById(id);
	}
}
