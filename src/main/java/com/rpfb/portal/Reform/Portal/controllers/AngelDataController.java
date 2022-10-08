package com.rpfb.portal.Reform.Portal.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rpfb.portal.Reform.Portal.model.AngelData;
import com.rpfb.portal.Reform.Portal.services.AngelDataService;


@RestController
public class AngelDataController {

	private static final Logger log = LoggerFactory.getLogger(AngelDataController.class);

	@Autowired
	private AngelDataService service;
	
	@PostMapping("/addAngelData")
	public @ResponseBody String addAngelData(@RequestBody AngelData angeldata) {
		service.addAngelData(angeldata);
		
	
		

		return "User Data Saved";
	}

   
/**	
	 * Read single customer information
	 * 
	 * @return
 
	@GetMapping("/getAngelDataById/{id}")
	public Optional<AngelData> getAngelDataById(@PathVariable("id") Long id) {
		return service.getAngelDataById(id);
	}

	/**
	 * Read operation
	 * 
	 * @return
	 
	@GetMapping("/allAngelDataRecord")
	public Iterable<AngelData> getAllAngelData() {
		return service.getAllAngelData();
	}

	/**
	 * write operation insert create
	 * 
	 * @param customer
	 * @return
	 
	@PostMapping("/addAngelData")
	public @ResponseBody String addAngle(@RequestBody AngelData angle) {
		service.addAngleData(AngelData);
		return "saved ";

	}

  public static Logger getLog() {
	return log;
}

	/**
	 * to delete a single record
	 * 
	 * @param id
	 

	@DeleteMapping("/deleteAngelDataById/{id}")
	public void deleteAngelData(@PathVariable("id") Long id) {
		service.deleteAngelDataByid(id);

	}

	/**
	 * to update the customer
	 * 
	 * @param newCustomer
	 * @param id
	 

	@PutMapping("/updateAngelData/{id}")
	public AngelData updateAngelData(@RequestBody AngelData newAngelData, @PathVariable("id") Long id) {
		log.info("Updating the customer record " + newAngelData);
		try {
		return service.updateAngelData(newAngelData, id);

		 }catch (Exception ex) {
			log.error("new Angel not saved " + newAngelData );
		}
        return null;
*/
	}
