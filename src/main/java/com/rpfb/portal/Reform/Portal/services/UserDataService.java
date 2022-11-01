package com.rpfb.portal.Reform.Portal.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpfb.portal.Reform.Portal.model.UserData;
import com.rpfb.portal.Reform.Portal.repo.UserDataRepository;

@Service
public class UserDataService {
	private static final Logger log = LoggerFactory.getLogger(UserDataService.class);
	
	@Autowired
	private UserDataRepository repository;
	
	//adding user data to DB
	public String addUserData(UserData userdata) {
	repository.save(userdata);
	return "User Data Saved";
	}
	
	//reading user data 
	public Optional<UserData> getUserById(Long id) {
		return repository.findById(id);
	}

	
	
	
	public long getLoginData(UserData userdata) {
		return userdata.getU_Id();		
	}


public  String updateUser(UserData newUser ,Long id,String newpassord) {
		
		log.info("Updating the password for id "+ id + " User " + newUser.toString()) ;
		 
		  UserData user = repository.findById(id).get();
		  
		  user.setPassword(newpassord);
		  
		  repository.save(user);
		  log.info("User Password Updated ") ;
		 return "updated";
}
}
