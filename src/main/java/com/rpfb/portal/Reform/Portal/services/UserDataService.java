package com.rpfb.portal.Reform.Portal.services;

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
	
	
	public String addUserData(UserData userdata) {
	repository.save(userdata);
	return "User Data Saved";
		
	}

}
