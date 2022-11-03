package com.rpfb.portal.Reform.Portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;


import com.rpfb.portal.Reform.Portal.dto.LoginReq;
import com.rpfb.portal.Reform.Portal.model.LoginResponse;
import com.rpfb.portal.Reform.Portal.model.UserData;
import com.rpfb.portal.Reform.Portal.services.UserDataService;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/v1")
public class UserDataController {
	
	private static final Logger log = LoggerFactory.getLogger(UserDataController.class);
	
	@Autowired
	private UserDataService service;
	@PostMapping("/addUserData")
	public @ResponseBody String addUserData(@RequestBody LoginReq userdata) {
		service.addUserData(userdata);
		return "User Data Saved";
	}
	
	@GetMapping("/getLoginUserById/{id}")
	public @ResponseBody Optional<UserData> getLoginUserbyId(@PathVariable Long id) {
		return service.getUserById(id);
	}
	
	@PostMapping("/loginhelper/login")
	public @ResponseBody LoginResponse Login(@RequestBody LoginReq user) {
		return service.addUserData(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@PostMapping("loginhelper/login/")
//	public @ResponseBody  String login(@RequestParam UserData user,@RequestParam String email,@RequestParam String password,@RequestParam long id )
//	{
//		boolean uid = service.userLogin(user, email, password, id);
//		log.info("Logging in User");
//		if (uid == true) {
//			return "Login successful";
//		}
//		return "Not Successful";
//	}
//	
//	@PostMapping("loginhelper/changepassword/")
//	public String changePassword(@RequestBody UserData userdata, @RequestBody String newpassword)
//	{
//		return service.updateUser(userdata, userdata.getU_Id(), newpassword);
//	}
	

}
