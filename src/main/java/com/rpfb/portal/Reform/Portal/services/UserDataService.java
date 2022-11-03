package com.rpfb.portal.Reform.Portal.services;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpfb.portal.Reform.Portal.dto.LoginReq;
import com.rpfb.portal.Reform.Portal.model.LoginResponse;
import com.rpfb.portal.Reform.Portal.model.UserData;
import com.rpfb.portal.Reform.Portal.repo.UserDataRepository;
import com.rpfb.portal.Reform.Portal.repo.LoginRepository;

@Service
public class UserDataService implements UserDataInterface{
	private static final Logger log = LoggerFactory.getLogger(UserDataService.class);
	
	@Autowired
	private UserDataRepository repository;
	private LoginRepository repo;
	
	//adding user data to DB
	public LoginResponse addUserData(LoginReq user) {
		LoginResponse ob = new LoginResponse();
		ob.setEmail(user.getEmail());
		ob.setPassword(user.getPassword());
		
		if (this.repo != null)
			repo.save(ob);
		return ob;
	}
	
	//reading user data 
	public Optional<UserData> getUserById(Long id) {
		return repository.findById(id);
	}

	
	
	
	/*public long getLoginData(UserData userdata) {
		return userdata.getU_Id();		
	}*/


public  String updateUser(UserData newUser ,Long id,String newpassord) {
		
		log.info("Updating the password for id "+ id + " User " + newUser.toString()) ;
		 
		  UserData user = repository.findById(id).get();
		  
		  user.setPassword(newpassord);
		  
		  repository.save(user);
		  log.info("User Password Updated ") ;
		 return "updated";
}

public boolean userLogin(UserData user, String email, String password, long id) {	
	
		return true;
		/*UserData ob = repository.findById(id).get();
		
		String email_id = ob.getEmail();
		
		if(email_id == email)
			return true;
		else
			return false;*/
}
}



