package com.rpfb.portal.Reform.Portal.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rpfb.portal.Reform.Portal.model.NgoBranch;
import com.rpfb.portal.Reform.Portal.services.NgoBranchService;


@RestController
public class NgoBranchController {
	
	private static final Logger log = LoggerFactory.getLogger(NgoBranchController.class);
	@Autowired
	private NgoBranchService service;
	
	@PostMapping("/addNgobranch")
	public @ResponseBody String addNgoBranch(@RequestBody NgoBranch ngobranch) {
		service.addNgoBranch(ngobranch);
		return " saved ";
}
}