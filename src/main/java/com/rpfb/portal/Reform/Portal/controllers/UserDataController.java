package com.rpfb.portal.Reform.Portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.rpfb.portal.Reform.Portal.model.UserData;
import com.rpfb.portal.Reform.Portal.services.UserDataService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class UserDataController {
	
	private static final Logger log = LoggerFactory.getLogger(UserDataController.class);
	
	@Autowired
	private UserDataService service;
	@PostMapping("/addUserData")
	public @ResponseBody String addUserData(@RequestBody UserData userdata) {
		service.addUserData(userdata);
		return "User Data Saved";
	}
	
	@PostMapping("loginhelper/login")
	public @ResponseBody long login(@RequestBody UserData userdata)
	{
		return service.getLoginData(userdata);
	}
	
	@PostMapping("loginhelper/changepassword/")
	public String changePassword(@RequestBody UserData userdata, @RequestBody String newpassword)
	{
		return service.updateUser(userdata, userdata.getU_Id(), newpassword);
	}
	

}
