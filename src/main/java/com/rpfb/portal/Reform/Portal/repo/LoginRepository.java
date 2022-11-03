package com.rpfb.portal.Reform.Portal.repo;


import org.springframework.data.repository.CrudRepository;

import com.rpfb.portal.Reform.Portal.model.LoginResponse;


public interface LoginRepository extends CrudRepository<LoginResponse, String>{
	
}
