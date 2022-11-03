package com.rpfb.portal.Reform.Portal.services;

import java.util.Optional;

import com.rpfb.portal.Reform.Portal.dto.LoginReq;
import com.rpfb.portal.Reform.Portal.model.LoginResponse;
import com.rpfb.portal.Reform.Portal.model.UserData;

public interface UserDataInterface {
	
	public LoginResponse addUserData(LoginReq userdata);
	
	public Optional<UserData> getUserById(Long id);
	
	//public long getLoginData(UserData userdata);
	
	public  String updateUser(UserData newUser ,Long id,String newpassord);
	
	public boolean userLogin(UserData user, String email, String password, long id);

}
