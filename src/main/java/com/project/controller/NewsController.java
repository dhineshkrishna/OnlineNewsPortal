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
import com.project.ServiceImpl.NewsServImpl;
import com.project.model.NewsModel;


/**
 * 
 * @author Dhinesh
 *
 */

@RestController
public class NewsController {
	
	@Autowired
	NewsServImpl newsese;

	/**
	 * Method used to get all the news
	 * @return the list
	 */
	@GetMapping("/news_get")
	public List<NewsModel> getnewses(){
		return  newsese.getnews();
	}

	/**
	 * Method used to post the all attributes
	 * @param news-this is parameter used to post the attributes in Json format
	 * @return the string "Data posted successfully".
	 */
	@PostMapping("/news_post")
	public String postnewses(@RequestBody NewsModel news) {
		return  newsese.postnews(news);
	}

	/**
	 * Method used to update/edit the all attributes
	 * @param news-this is a parameter used to update the attributes in Json format
	 * @return the string "Data updated successfully".
	 */
	@PutMapping("/news_put")
	public String putnewses(@RequestBody NewsModel news) {
		if(news==null) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  newsese.putnews(news);
	}

	/**
	 * Method used to delete the object
	 * @param id-this is a parameter used to delete the details
	 * @return the string "Data deleted successfully".
	 */
	@DeleteMapping("/news_delete/{id}")
	public String deletenewses(@PathVariable ("id")int id) {
		if(id==0) {
			throw new IllegalArgumentException("Invalid data input");
		}
		return  newsese.deletenews(id);
	}
}
